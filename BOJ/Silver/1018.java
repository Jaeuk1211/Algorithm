package p1018_체스판_다시_칠하기;

import java.util.Scanner;

public class Main {
	public static int countWB(char[][] arr, int r, int c) {
		
		int countA=0;
		int countB=0;
		int flag=0;
		
		if(arr[r][c] != 'W') flag++;
		
		for(int row=r; row < r+8; row++) {
			for(int col=c; col < c+8; col++) {
				if(flag == 0) {
					if( ((row-r)%2 == 0 && (col-c)%2 == 0) || ((row-r)%2 == 1 && (col-c)%2 == 1) ) {
						if(arr[row][col] != 'W') countA++;
						else countB++;
					} else if( ((row-r)%2 == 0 && (col-c)%2 == 1) || ((row-r)%2 == 1 && (col-c)%2 == 0) ) {
						if(arr[row][col] != 'B') countA++;
						else countB++;
					}
				}
				else {
					if( ((row-r)%2 == 0 && (col-c)%2 == 0) || ((row-r)%2 == 1 && (col-c)%2 == 1) ) {
						if(arr[row][col] != 'B') countA++;
						else countB++;
					} else if( ((row-r)%2 == 0 && (col-c)%2 == 1) || ((row-r)%2 == 1 && (col-c)%2 == 0) ) {
						if(arr[row][col] != 'W') countA++;
						else countB++;
					}
				}
			}
		}
		
		if(countA < countB) return countA;
		else if(countA > countB) return countB;
		else return countA;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		char[][] arr = new char[N][M];
		
		for(int i=0; i<N; i++) {
			String temp = sc.nextLine();
			for(int k=0; k<M; k++) {
				arr[i][k] = temp.charAt(k);
			}
		}
		
		int res = Integer.MAX_VALUE;
		
		for(int r=0; r<arr.length; r++) {
			
			if(r+8 > arr.length) break;
			
			for(int c=0; c<arr[r].length; c++) {
				if(c+8 > arr[0].length) break;
				
				int temp = countWB(arr,r,c);
				
				if(temp < res) res = temp;
			
			}
			
		}
		
		System.out.println(res);				
	}
	
}
