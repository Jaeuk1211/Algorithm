package p1183_약속;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] cal = new int[N];
		
		for(int i=0; i<N; i++) {
			int S = sc.nextInt();
			int A = sc.nextInt();
			cal[i] = S - A;
		}
	
		Arrays.sort(cal);
		
		if(N%2==1) System.out.println("1");
		else System.out.println(Math.abs(cal[N/2]-cal[(N/2)-1])+1);
		
	}
}
