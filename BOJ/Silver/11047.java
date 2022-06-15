package p11047_동전_0_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int cost = Integer.parseInt(temp[1]);
		int[] bill = new int[N];
		int res=0;
		
		for(int i=0; i<N; i++) {
			bill[i] = Integer.parseInt(br.readLine());
		}
		
		while(cost != 0) {
			
			int use=0;
			
			for(int i=N-1; i>=0; i--) {
				if(cost >= bill[i]) {
					use=i;
					break;
				}
			}
			
			cost -= bill[use];
			res++;
			
		}
		
		System.out.println(res);
		
	}
}
