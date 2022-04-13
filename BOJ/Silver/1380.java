package p1380_귀걸이;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> res = new ArrayList<>();
		
		int testcase=1;
		
		while(true) {
			
			int N = sc.nextInt();
			sc.nextLine();
			
			if(N == 0) break;
			
			String[] name = new String[N];
			int[][] idx = new int[N][2];
			
			for(int i=0; i<N; i++) {
				name[i] = sc.nextLine();
			}
			
			for(int i=0; i<N; i++) {
				idx[i][0] = 0;
				idx[i][1] = 0;
			}
			
			for(int i=0; i<N; i++) {
				String[] temp = sc.nextLine().split(" ");
				
				if(temp[1].equals("A"))
					idx[Integer.parseInt(temp[0])-1][0]++;
				else if(temp[1].equals("B"))
					idx[Integer.parseInt(temp[0])-1][1]++;
				else
					continue;
			}
			
			for(int i=0; i<N-1; i++) {
				String[] temp = sc.nextLine().split(" ");
				
				if(temp[1].equals("A"))
					idx[Integer.parseInt(temp[0])-1][0]++;
				else if(temp[1].equals("B"))
					idx[Integer.parseInt(temp[0])-1][1]++;
				else
					continue;
			}
						
			for(int i=0; i<N; i++) {				
				if(!(idx[i][0] == 1 && idx[i][1] == 1))
					res.add(testcase + " " + name[i]);
			}
			
			testcase++;
			
		}
		
		for(String s : res) System.out.println(s);
	}
}
