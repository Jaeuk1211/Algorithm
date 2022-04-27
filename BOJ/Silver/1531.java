package p1531_투명;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[101][101];
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		for(int i=1; i<=100; i++) {
			for(int k=1; k<=100; k++) {
				arr[i][k] = 0-M;
			}
		}
		
		for(int i=0; i<N; i++) {
			
			int startX = sc.nextInt();
			int startY = sc.nextInt();
			int endX = sc.nextInt();
			int endY = sc.nextInt();
			
			for(int x=startX; x<=endX; x++) {
				for(int y=startY; y<=endY; y++) {
					arr[x][y]++;
				}
			}
		}
		
		int res=0;
		for(int i=1; i<=100; i++) {
			for(int k=1; k<=100; k++) {
				if(arr[i][k] > 0) res++;
			}
		}
		
		System.out.println(res);
		
		
	}
}
