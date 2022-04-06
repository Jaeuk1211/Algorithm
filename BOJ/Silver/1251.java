package p1251_단어_나누기;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static String reverse(String s) {
		
		String res = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			res = res.concat(s.substring(i,i+1));
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=1;i<str.length()-1;i++) {		
			for(int k=i+1;k<str.length();k++) {
				
				String A = str.substring(0,i);
				String B = str.substring(i,k);
				String C = str.substring(k);
								
				String res = "";
					
				A=reverse(A);
				B=reverse(B);
				C=reverse(C);
					
				res = res.concat(A);
				res = res.concat(B);
				res = res.concat(C);
					
				arr.add(res);
			}
		}
		
		Collections.sort(arr);
		
		System.out.println(arr.get(0));
		
	}
}
