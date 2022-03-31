package p1145_적어도_대부분의_배수;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
		}
				
		int res=1;
		
		while(true) {
			int count=0;
			for(int i=0; i<num.length; i++) {
				if(res%num[i] == 0) count++;
			}
			
			if(count>=3) break;
			else res++;
		}
		
		System.out.println(res);
		
	}
}
