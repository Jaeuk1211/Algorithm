package p1931_회의실_배정_Silver2;

import java.util.Arrays;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] time = new int[N][2];
		
		for(int i=0; i<N; i++) {
			String temp[] = br.readLine().split(" ");
			time[i][0] = Integer.parseInt(temp[0]);
			time[i][1] = Integer.parseInt(temp[1]);
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		    	if(o1[1] == o2[1]) return o1[0]-o2[0];
		    	else return o1[1]-o2[1];
		    }
		});
		
		int res=1;
		int idx=0;
		
		for(int i=idx+1; i<N; i++) {
			if(time[idx][1] <= time[i][0]) {
				idx = i;
				res++;
			}
		}
		
		System.out.println(res);
		
	}
}