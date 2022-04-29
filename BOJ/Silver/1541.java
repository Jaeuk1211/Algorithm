package p1541_잃어버린_괄호_Silver2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split("\\-");
		int res=0;
		
		for(int i=0; i<str.length; i++) {
			String[] temp = str[i].split("\\+");
			int t = 0;
			
			for(int j=0; j<temp.length; j++) {
				t += Integer.parseInt(temp[j]);
			}
			
			if(i==0) res+=t;
			else res-=t;
		}
	
		System.out.println(res);
		
	}
}
