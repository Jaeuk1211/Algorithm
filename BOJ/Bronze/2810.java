package p2810_컵홀더_Bronze2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		ArrayList<String> seat = new ArrayList<>();
		
		int i=0;
		while(i<N) {
			if(str.charAt(i) == 'S') {
				seat.add(str.substring(i,i+1));
				i++;
			} else if (str.charAt(i) == 'L') {
				seat.add(str.substring(i,i+2));
				i=i+2;
			}
		}
		
		if(seat.size()+1 > N) System.out.println(N);
		else System.out.println(seat.size()+1);
		
	}
	
}
