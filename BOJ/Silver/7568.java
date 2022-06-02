package p7568_덩치;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] data = new int[N][2];
		int[] res = new int[N];
 		
		for(int i=0; i<N; i++) {
			String[] temp = br.readLine().split(" ");
			
			data[i][0] = Integer.parseInt(temp[0]);
			data[i][1] = Integer.parseInt(temp[1]);
		}
		
		for(int i=0; i<N; i++) {
			
			int count=0;
			for(int j=0; j<N; j++) {
				if(data[i][0] < data[j][0] && data[i][1] < data[j][1]) count++;	
			}			
			
			res[i] = count+1;
		}
		
		for(int i=0; i<N; i++) 
			System.out.print(res[i] + " ");
	
	}
	
}
