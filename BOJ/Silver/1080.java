package p1080_행렬_Silver2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		
		int[][] original = new int[N][M];
		int[][] change = new int [N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				original[i][j] = 0;
				change[i][j] = 0;
			}
		}
			
		for(int i=0; i<N; i++) {
			String temp = sc.nextLine();
			for(int j=0; j<temp.length(); j++) {
				original[i][j] = Integer.parseInt(temp.substring(j,j+1));
			}
		}
		
		for(int i=0; i<N; i++) {
			String temp = sc.nextLine();
			for(int j=0; j<temp.length(); j++) {
				change[i][j] = Integer.parseInt(temp.substring(j,j+1));
			}
		}
		
		if(N<3 || M<3) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(original[i][j] != change[i][j]) {
						System.out.println(-1);
						return;
					}
				}
			}
			System.out.println(0);
			return;
		}
		
		int res=0;
		for(int i=0; i+2<N; i++) {
			for(int j=0; j+2<M; j++) {
				if(original[i][j]%2 != change[i][j]) {
					original[i][j]++;
					original[i+1][j]++;
					original[i+2][j]++;
					original[i][j+1]++;
					original[i+1][j+1]++;
					original[i+2][j+1]++;
					original[i][j+2]++;
					original[i+1][j+2]++;
					original[i+2][j+2]++;
					res++;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				original[i][j] = original[i][j]%2;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(original[i][j] != change[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(res);		
	}
}
