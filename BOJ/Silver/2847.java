package p2847_게임을_만든_동준이_Silver4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] score = new int[N];
		int res=0;
		
		for(int i=0; i<N; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int i=N-1; i>0; i--) {
			while(score[i] <= score[i-1]) {
				score[i-1]--;
				res++;
			}
		}
		
		System.out.println(res);
	}
}
