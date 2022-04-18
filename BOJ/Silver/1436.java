package p1436_영화감독_숌;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=666; i<=2666799; i++) {
			String temp = Integer.toString(i);		
			int idx = temp.indexOf("6");
			if(idx == -1) continue;
			
			int count=0;	
			for(int k=idx; k<temp.lastIndexOf("6")+1; k++) {
				if(count == 0) {
					if(temp.charAt(k) == '6') count++;
				} 
				else {
					if(temp.charAt(k) == '6') count++;
					else {
						if(count>=3) arr.add(temp);
						
						count=0;
					}
				}
			}
			if(count>=3) arr.add(temp);
		}
		
		int N = sc.nextInt();
		sc.nextLine();
		
		System.out.println(arr.get(N-1));
	 	
	}
}
