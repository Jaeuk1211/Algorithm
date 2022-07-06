package p2212_센서;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		int[] sen = new int[N];
		int[] dis = new int[N-1];
		
		String[] input = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			sen[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(sen);
		
		for(int i=1; i<N; i++) {
			dis[i-1] = sen[i] - sen[i-1];
		}
		
		Arrays.sort(dis);	
		
		int res=0;
		for(int i=0; i<N-k; i++) {
			res += dis[i];
		}
		
		System.out.println(res);
		
	}
}
