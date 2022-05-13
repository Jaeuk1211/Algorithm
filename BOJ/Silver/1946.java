package p1946_신입_사원_Silver1;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testcase; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int[][] rank = new int[N][2];
			int res=1;
			
			for(int j=0; j<N; j++) {
				String temp[] = br.readLine().split(" ");
				rank[j][0] = Integer.parseInt(temp[0]);
				rank[j][1] = Integer.parseInt(temp[1]);
			}
			
			Arrays.sort(rank, new Comparator<int[]>() {
			    @Override
			    public int compare(int[] o1, int[] o2) {
			    	return o1[0]-o2[0];
			    }
			});
			
			if(rank[0][0] == rank[0][1]) {
				System.out.println(res);
				continue;
			}
			
			int mrank = rank[0][1];
			for(int j=1; j<N; j++) {
				if(rank[j-1][1] < mrank) mrank = rank[j-1][1];
				
				if(rank[j][1] < mrank) {
					res++;
				}
			}
			
			System.out.println(res);
			
		}
	}
}

