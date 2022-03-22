package p5585_거스름돈_Bronze2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cost = sc.nextInt();	
		int change = 1000-cost;
				
		int fhundred = change/500;
		change = change%500;
		int hundred = change/100;
		change = change%100;
		int fifty = change/50;
		change = change%50;
		int ten = change/10;
		change = change%10;
		int five = change/5;
		change = change%5;
		int one = change;
		
		int result = fhundred+hundred+fifty+ten+five+one;
		System.out.println(result);
	}
}
