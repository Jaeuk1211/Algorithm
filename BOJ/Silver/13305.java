package p13305_주유소_Silver4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] distance = new long[N-1];
		long[] cost = new long[N];
		
		for(int i=0; i<N-1; i++) {
			distance[i] = sc.nextLong();
		}
		for(int i=0; i<N; i++) {
			cost[i] = sc.nextLong();
		}
				
		long total = 0;
		long nowcost = Integer.MAX_VALUE;
		for(int i=0; i<N-1; i++) {
			if(nowcost > cost[i]) nowcost = cost[i];
			
			total += nowcost * distance[i];
		}
		
		System.out.println(total);
		
	}
}
