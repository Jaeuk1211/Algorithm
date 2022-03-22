package p14659_한조서열정리하고옴ㅋㅋ_Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] mountain = new int[N];
		int[] kill = new int[N];
		
		for(int i=0; i<N; i++) {
			mountain[i] = sc.nextInt();
			kill[i] = 0;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++){
				if(mountain[i] > mountain[j]) kill[i]++;
				else {
					break;
				}
			}
		}
		
		Arrays.sort(kill);
		System.out.println(kill[N-1]);
		
	}
}
