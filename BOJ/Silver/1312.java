package p1312_소수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] input = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int N = Integer.parseInt(input[2]);
		
		A %= B;
        for (int i = 0; i < N - 1; i++) {
            A *= 10;
            A %= B;
        }
        A *= 10;
        
        System.out.println(A/B);
		
	}
}
