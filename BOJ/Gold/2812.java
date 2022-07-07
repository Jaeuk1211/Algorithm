package p2812_크게_만들기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);

		Stack<String> stack = new Stack<>();
        String[] nums = br.readLine().split("");
        StringBuilder sbd = new StringBuilder();
 
        for (String num : nums) {
            while (!stack.isEmpty() && num.compareTo(stack.peek()) > 0 && K > 0) {
                stack.pop();
                K--;
            }
            stack.add(num);
        }
		
        while (!stack.isEmpty()) {
            sbd.append(stack.pop());
        }
        
        String answer = sbd.reverse().toString();
        System.out.println(answer.substring(0, answer.length() - K));
		
	}
}
