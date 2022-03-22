package p2839_설탕_배달_Bronze1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kg = sc.nextInt();
		
		int count3 = kg/3;
		int count5 = kg/5;
		
		int result = Integer.MAX_VALUE;
		for(int i=0; i<=count3; i++) {
			for(int j=0; j<=count5; j++) {
				if((i*3) + (j*5) == kg) {
					if(i+j < result)
						result = i+j;
				}
			}
		}
		
		if(result == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(result);
	}
}
