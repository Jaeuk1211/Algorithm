package p15903_카드_합체_놀이_Silver3;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Long> card = new PriorityQueue<>();
		long res=0;
		
		for(int i=0; i<n; i++) {
			card.add(sc.nextLong());
		}		
		
		for(int i=0; i<m; i++) {
			long temp = card.peek();
			card.remove();
			temp += card.peek();
			card.remove();
			card.add(temp);
			card.add(temp);
		}
		
		while(!card.isEmpty()) {
			res += card.peek();
			card.remove();
		}
		
		System.out.println(res);
		
	}
}
