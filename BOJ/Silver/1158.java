package p1158_요세푸스_문제;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>(N);
		
		for(int i=0; i<N; i++) {
			arr.add(i+1);
		}
		
		int idx=K-1;
		System.out.print("<");
		while(true) {
			
			System.out.print(arr.get(idx));

			arr.remove(idx);
			if(arr.size() == 0) break;
			
			if(K-1 < 0) idx=arr.size()-1;
			else idx=(idx+K-1)%arr.size();
			
			System.out.print(", ");
			
		}
		System.out.print(">");
		System.out.println();
		
	}
}
