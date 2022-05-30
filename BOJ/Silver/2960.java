package p2960_에라토스테네스의_체;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		
		int[] num = new int[N+1];
		
		for(int i=2; i<=N; i++) {
			num[i] = 1;
		}
    	
    	int cnt = 0;
    	for(int i = 2; i<=N; i++) {
    		for(int j = i; j<=N; j+=i) {
    			if(num[j] == 1) {
        			cnt++;
        			num[j] = 0;
    			}

    			if(cnt == K) {
    				System.out.println(j);
    				System.exit(0);
    			}
    		}
    	}
	}
}
