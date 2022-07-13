package p1041_주사위_Silver1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] dice = new int[6];
		
		for(int i=0; i<6; i++) {
			dice[i] = sc.nextInt();
		}
		
		
		long total=0;
		if(N == 1) {
			Arrays.sort(dice);
			
			for(int i=0; i<5; i++) {
				total += dice[i];
			}
			
		} else {
			
			int[] ddice = new int[12];
			ddice[0] = dice[0] + dice[1];
			ddice[1] = dice[0] + dice[2];
			ddice[2] = dice[0] + dice[3];
			ddice[3] = dice[0] + dice[4];
			ddice[4] = dice[1] + dice[2];
			ddice[5] = dice[1] + dice[3];
			ddice[6] = dice[1] + dice[5];
			ddice[7] = dice[2] + dice[4];
			ddice[8] = dice[2] + dice[5];
			ddice[9] = dice[3] + dice[4];
			ddice[10] = dice[3] + dice[5];
			ddice[11] = dice[4] + dice[5];
			Arrays.sort(ddice);
			int db = ddice[0];
			
			int[] tdice = new int[8];
			tdice[0] = dice[0] + dice[1] + dice[2];
			tdice[1] = dice[0] + dice[1] + dice[3];
			tdice[2] = dice[0] + dice[2] + dice[4];
			tdice[3] = dice[0] + dice[3] + dice[4];
			tdice[4] = dice[1] + dice[2] + dice[5];
			tdice[5] = dice[1] + dice[3] + dice[5];
			tdice[6] = dice[2] + dice[4] + dice[5];
			tdice[7] = dice[3] + dice[4] + dice[5];
			Arrays.sort(tdice);
			int tp = tdice[0];
			
			Arrays.sort(dice);
			int sg = dice[0];
			
			long sgtemp = 0;
			for(int i=0; i<N-2; i++) {
				sgtemp += sg*4;
			}
			
			for(int i=0; i<N-1; i++) {
				total += db*4;
				total += sgtemp;
			}

			total += tp*4;
			for(int i=0; i<N-2; i++) {
				total += db*4;
			}
			total += sg * Math.pow(N-2,2);
				
		}
		
		System.out.println(total);
		
	}
}
