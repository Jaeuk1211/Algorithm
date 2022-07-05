package p1013_Contact;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			
			String s = br.readLine();
			String pattern = "(100+1+|01)+";
			
			if(s.matches(pattern)) System.out.println("YES");
			else System.out.println("NO");
				
		}
		
	}
}
