package p9656_돌_게임2_Silver4;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N%2 == 1) System.out.println("CY");
		else System.out.println("SK");
		
	}
}
