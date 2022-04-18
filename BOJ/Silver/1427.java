package p1427_소트인사이드;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String res = "";
		
		String[] arr = new String[num.length()];
		
		for(int i=0; i<num.length(); i++) {
			arr[i] = num.substring(i,i+1);
		}
		
		Arrays.sort(arr);
		
		for(int i=num.length()-1; i>=0; i--) {
			res = res.concat(arr[i]);
		}
		
		System.out.println(res);
		
	}
}
