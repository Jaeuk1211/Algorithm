package p1246_온라인_판매;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] price = new int[M];
		
		for(int i=0; i<M; i++) {
			price[i] = sc.nextInt();
		}
		
		Arrays.sort(price);

		int max=0;
		int p=0;
		int temptotal=0;
		
		for(int i=0; i<M; i++) {
			
			if(M-i <N) temptotal = price[i] * (M-i);
			else temptotal = price[i] * N;
			
			if(temptotal > max) {
				p = price[i];
				max = temptotal;			
			}
		
		}
		System.out.print(p + " " + max);
		
	}
}
