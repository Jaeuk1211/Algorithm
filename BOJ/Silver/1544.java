package p1544_사이클_단어;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		HashSet<String> arr = new HashSet<>();
		int res=0;
		
		for(int i=0; i<N; i++) {
			
			String str = sc.nextLine();
			
			if(arr.contains(str)) continue;
			else {
				for(int k=0; k<str.length(); k++) {
					String temp = str.substring(k).concat(str.substring(0,k));			
					arr.add(temp);				
				}
				res++;
			}
		}
		
		System.out.println(res);
		
	}
}
