package p2407_조합_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		BigInteger num1 = BigInteger.ONE;
        BigInteger num2 = BigInteger.ONE;
        
        for(int i=0; i<m; i++) {
            num1 = num1.multiply(new BigInteger(String.valueOf(n-i)));
            num2 = num2.multiply(new BigInteger(String.valueOf(i+1)));
        }
        
        System.out.println(num1.divide(num2));
	}
}
