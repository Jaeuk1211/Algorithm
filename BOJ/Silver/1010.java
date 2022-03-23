package p1010_다리_놓기;

import java.util.Scanner;

class Main {	
	public static int count = 0;

	public static void comb(boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            count++;
            return;
        }
        
        for(int i=start; i<n; i++) {
        	visited[i] = true;
        	comb(visited,i+1,n,r-1);
        	visited[i] = false;
        }        
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			boolean[] visited = new boolean[M];
			
			comb(visited,0,M,N);
			System.out.println(count);
			count=0;
		}
	} 
}