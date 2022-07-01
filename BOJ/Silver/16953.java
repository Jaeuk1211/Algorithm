package p16953_A_B_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static int cal(long a, long b, int depth) {
		
		depth++;
	
		int temp = 0;
		long left = 2*a;
		long right = Long.parseLong(Long.toString(a).concat("1"));
		
		if(left == b) {
			temp++;
			System.out.println(depth);
		}
		else if(left < b) temp += cal(left,b,depth);
		
		if(right == b) {
			temp++;
			System.out.println(depth);
		}
		else if(right < b) temp += cal(right,b,depth);
		
		return temp;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		long original = Long.parseLong(temp[0]);
		long change = Long.parseLong(temp[1]);
		
		int d=1;
		int valid=0;
		
		valid = cal(original,change,d);
		
		if(valid != 1) System.out.println(-1);
		
	}
}
