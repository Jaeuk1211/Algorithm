package p5636_생일;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] name = new String[N];
		int[] day = new int[N];
		int[] month = new int[N];
		int[] year = new int[N];
			
		for(int i=0; i<N; i++) {		
			
			String[] temp = br.readLine().split(" ");
			name[i] = temp[0];
			day[i] = Integer.parseInt(temp[1]);
			month[i] = Integer.parseInt(temp[2]);
			year[i] = Integer.parseInt(temp[3]);
		
		}
		
		int max=0;
		for(int i=1; i<N; i++) {
			if(year[max] == year[i]) {
				if(month[max] == month[i]) {
					if(day[max] > day[i]) max=i;
				} else if(month[max] > month[i]) max=i;
			} else if(year[max] > year[i]) max=i;
		}
		
		int min=0;
		for(int i=1; i<N; i++) {
			if(year[min] == year[i]) {
				if(month[min] == month[i]) {
					if(day[min] < day[i]) min=i;
				} else if(month[min] < month[i]) min=i;
			} else if(year[min] < year[i]) min=i;
		}
		
		System.out.println(name[min]);
		System.out.println(name[max]);
			
	}
}
