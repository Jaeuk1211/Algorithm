package p1440_타임머신;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] time = sc.nextLine().split(":");
		
		int res=0;
		for(int i=0; i<time.length; i++) {
			
			int one = Integer.parseInt(time[i]);
			int two = Integer.parseInt(time[(i+1)%3]);
			int three = Integer.parseInt(time[(i+2)%3]);
			
			if(1 <= one && one <= 12) {
				if((0 <= two && two <= 59) && (0 <= three && three <= 59)) res++;
				if((0 <= three && three <= 59) && (0 <= two && two <= 59)) res++;
			}
		}
		
		System.out.println(res);
		
	}
}
