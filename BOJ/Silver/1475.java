package p1475_방_번호;

import java.util.Scanner;

public class Main {
	public static void newset(int[] set, int setnum) {
		for(int i=0; i<set.length; i++) {
			set[i]++;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int[] num = new int[10];
		
			
		for(int i=0; i<num.length; i++) {
			num[i]=0;
		}
		for(int i=0; i<s.length(); i++) {
			num[Integer.parseInt(s.substring(i,i+1))]++;
		}
		
		
		int temp = num[6] + num[9];
		if(temp%2 == 1) num[6] = (temp/2)+1;
		else num[6] = temp/2;
			
		int res = num[0];		
		for(int i=0; i<num.length-1; i++) {
			if(num[i] > res) {
				res = num[i];
			}
		}
		
		System.out.println(res);
		
	}
}
