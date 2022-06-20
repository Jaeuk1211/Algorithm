package p11047_통나무_건너뛰기_Silver1;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int[] log = new int[N];
			int[] result = new int[N];
			String[] str = br.readLine().split(" ");
			
			for(int j=0; j<N; j++) {
				log[j] = Integer.parseInt(str[j]);
				result[j] = 0;
			}
			
			Arrays.sort(log);
			
			int start=0;
			int end=N-1;
			int idx=0;
			while(start<=end) {
				
				result[start] = log[idx];
				idx++;
				
				if(start==end) break;
				
				result[end] = log[idx];
				idx++;
				
				start++;
				end--;
				
			}
			
			int res=0;
			
			for(int j=0; j<N; j++) {
				int temp = Math.abs(result[(j+1)%N] - result[j]);
				if(temp > res) res = temp;
			}
			
			System.out.println(res);
			
		}
		
	}
}
