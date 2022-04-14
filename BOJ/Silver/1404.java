package p1404_토너먼트_승자;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] sp = sc.nextLine().split(" ");
		
		double[][] percent = new double[8][8];
		double[] finals = new double[8];
		double[] victory = new double[8];

		int idx=0;
		
		for(int i=0; i<8; i++) {
			percent[i][i] = 0;
			for(int k=i+1; k<8; k++) {
				percent[i][k] = (double) (Integer.parseInt(sp[idx]))/100;
				percent[k][i] = (double) (100 - Integer.parseInt(sp[idx]))/100;
				idx++;
			}
		}
		
		for(int i=0; i<8; i++) {
			finals[i]=0;
			victory[i]=0;
		}
		
		for(int i=0; i<8; i++) {
			int A=0;
			int B=0;
			
			if(i==0 || i==1) {
				A=2;
				B=3;
			} else if(i==2 || i==3) {
				A=0;
				B=1;
			} else if(i==4 || i==5) {
				A=6;
				B=7;
			} else if(i==6 || i==7) {
				A=4;
				B=5;
			}
			
			if(i%2==0)
				finals[i] = (double) percent[i][A]*(percent[i][i+1]*percent[A][B]) + percent[i][B]*(percent[i][i+1]*percent[B][A]);
			else 
				finals[i] = (double) percent[i][A]*(percent[i][i-1]*percent[A][B]) + percent[i][B]*(percent[i][i-1]*percent[B][A]);
			
		}
		
		for(int i=0; i<8; i++) {
			if(i<4) {
				for(int k=4; k<8; k++)
					victory[i] += (double) finals[i]*finals[k]*percent[i][k];
			} else {
				for(int k=0; k<4; k++)
					victory[i] += (double) finals[i]*finals[k]*percent[i][k];
			}
		}
		
		for(double d : victory) System.out.print(d + " ");
		
		
	}
}
