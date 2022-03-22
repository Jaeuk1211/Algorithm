package p15904_UCPC는_무엇의_약자일까_Bronze1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count=0;
		
		if(s.contains("U")) {
			s = s.substring(s.indexOf("U")+1);
			count++;
		}
		if(s.contains("C")) {
			s = s.substring(s.indexOf("C")+1);
			count++;
		}
		if(s.contains("P")) {
			s = s.substring(s.indexOf("P")+1);
			count++;
		}
		if(s.contains("C")) {
			s = s.substring(s.indexOf("C")+1);
			count++;
		}
		
		if(count == 4) System.out.println("I love UCPC");
		else System.out.println("I hate UCPC");
		
	}
}
