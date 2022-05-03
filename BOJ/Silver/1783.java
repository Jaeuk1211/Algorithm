package p1783_병든_나이트_Silver5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int res=0;
		
		if(N>=3) {
			if(M>=7) res = 5 + (M-7);
			else if(M>=5) res = 4;
			else res = M;
		} else if(N==2){
			if(M>=7) {
				res = 4;
			} else {
				if(M%2 == 0) res = M/2;
				else res = M/2 + 1;
			}
		} else res = 1;
		
		System.out.println(res);
	}
}