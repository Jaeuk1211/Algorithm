package p1036_36진수_Gold1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> alp = new ArrayList<>();
		ArrayList<String> str = new ArrayList<>();
		int[] idx = new int[26];
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<N; i++) {
			String s = sc.nextLine();
			str.add(s);
			
			for(int j=0; j<s.length(); j++) {
				if(!alp.contains(s.substring(j,j+1))) {
					alp.add(s.substring(j,j+1));
				}
			}
		}
	
		int k = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<N; i++) {
			String temp = str.get(i);
			
			for(int j=0; j<alp.size(); j++) {
				String search = alp.get(j);
				
				temp = temp.replaceAll(search, "Z");			
			}
			
			str.remove(i);
			str.add(i, temp);
		}
		
		
		long res=0;
		for(int i=0; i<str.size(); i++) {
			String temp = str.get(i);
			int sq = 0;
			for(int j=temp.length()-1; j>=0; j--) {
				double pow = Math.pow(36, sq);
				
				if(65 <= temp.charAt(j) && temp.charAt(j) <=90)
					res += ((int) (temp.charAt(j)- 55)) * pow;
				else
					res += ((int) (temp.charAt(j)- 48)) * pow;
				
				sq++;
			}
		}
		
		String result = "";
		while(res > 0) {
			char c = ' ';
			
			if(10 <= res%36 && res%36 <= 35)
				c = (char) ((res%36) + 55);
			else
				c = (char) ((res%36) + 48);
			
			result = Character.toString(c).concat(result);
			res = res/36;
			
		}
		
		System.out.println(result);
		
	}
}