package p11399_ATM_Silver3;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] queue = new int[N];
		
		
		for(int i=0; i<N; i++) {
			queue[i] = sc.nextInt();
		}
		
		Arrays.sort(queue);
		int res=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				res += queue[j];
			}
		}
		
		System.out.println(res);
		
	}
}
