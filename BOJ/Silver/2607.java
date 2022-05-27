package p2607_비슷한_단어;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		int[] sidx = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			sidx[s.charAt(i)-65]++;
		}
		
		int res=0;
		for(int i=0; i<N-1; i++) {
			
			String temp = br.readLine();
			int error=0;
			
			int[] tidx = new int[26];
			
			for(int j=0; j<temp.length(); j++) {
				tidx[temp.charAt(j)-65]++;
			}
			
			for(int j=0; j<26; j++) {
				error += Math.abs(sidx[j] - tidx[j]);
			}
			
			if(Math.abs(s.length() - temp.length()) <= 1 && error <= 2)
				res++;
			
		}
		
		System.out.println(res);
		
	}
}
