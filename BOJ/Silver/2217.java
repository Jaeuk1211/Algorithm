package p2217_로프_Silver4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] rope = new int[N];
		ArrayList<Integer> res = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			rope[i] = sc.nextInt();
		}
		
		Arrays.sort(rope);
		
		for(int i=0; i<N; i++) {
			int temp = rope[i]*(N-i);
			res.add(temp);
		}
		
		Collections.sort(res);
		System.out.println(res.get(res.size()-1));
		
	}
}