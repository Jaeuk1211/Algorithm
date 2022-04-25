package p1476_날짜_계산;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int res=1;
		int e=1;
		int s=1;
		int m=1;
		while(true) {
			if(e==E && s==S && m==M) break;
			
			e = (e%15)+1;
			s = (s%28)+1;
			m = (m%19)+1;	
			res++;
			
		}
		
		System.out.println(res);
		
	}
}
