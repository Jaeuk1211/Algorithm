package p9655_돌_게임_Silver5;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N%2 == 1) System.out.println("SK");
		else System.out.println("CY");
		
	}
}
