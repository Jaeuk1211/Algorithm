package p8979_올림픽;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] Nrank = br.readLine().split(" ");
		int N = Integer.parseInt(Nrank[0]);
		int rank = Integer.parseInt(Nrank[1]);
		
		int[][] medal = new int[N][4];
		
		int g = 0;
		int s = 0;
		int b = 0;
		
		int idx=0;
		for(int i=0; i<N; i++) {			
			
			String[] input = br.readLine().split(" ");
			
			if(rank == Integer.parseInt(input[0])) {					
				g = Integer.parseInt(input[1]);
				s = Integer.parseInt(input[2]);
				b = Integer.parseInt(input[3]);				
			} else {						
				medal[idx][0] = Integer.parseInt(input[0]);
				medal[idx][1] = Integer.parseInt(input[1]);
				medal[idx][2] = Integer.parseInt(input[2]);
				medal[idx][3] = Integer.parseInt(input[3]);
				idx++;				
			}			
		}
		
		int res=1;
		for(int i=0; i<idx; i++) {
			if(medal[i][1] > g) {
				res++;
			} else {
				if(medal[i][1] == g) {
					if(medal[i][2] > s) {
						res++;
					}
					else {
						if(medal[i][2] == s) {
							if(medal[i][3] > b) {
								res++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(res);
		
	}
}
