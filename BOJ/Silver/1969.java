package p1969_DNA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int len = Integer.parseInt(input[1]);
		
		String[] str = new String[N];
		
		for(int i=0; i<N; i++) {
			str[i] = br.readLine();
		}
		
		int res=0;
		String resstr = "";
		for(int i=0; i<len; i++) {
			
			int[] count = new int[4];
			
			for(int j=0; j<N; j++) {
				if(str[j].charAt(i) == 'A') count[0]++;
				else if(str[j].charAt(i) == 'C') count[1]++;
				else if(str[j].charAt(i) == 'G') count[2]++;
				else count[3]++;
			}
			
			int max = count[0];
			for(int j=1; j<4; j++) {
				if(max < count[j]) max = count[j];
			}
			
			if(max == count[0]) resstr = resstr.concat("A");
			else if(max == count[1]) resstr = resstr.concat("C");
			else if(max == count[2]) resstr = resstr.concat("G");
			else if(max == count[3]) resstr = resstr.concat("T");
			
		}
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<len; j++)
				if(str[i].charAt(j) != resstr.charAt(j)) res++;
		}
		
		System.out.println(resstr);
		System.out.println(res);
		
	}
}
