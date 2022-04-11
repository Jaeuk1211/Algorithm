package p1331_나이트_투어;

import java.util.Scanner;

public class Main {
	
	public static int getColumn(char c) {
		int column=0;
		
		switch(c) {
			case 'A':
				column=0;
				break;
			case 'B':
				column=1;
				break;
			case 'C':
				column=2;
				break;
			case 'D':
				column=3;
				break;
			case 'E':
				column=4;
				break;
			case 'F':
				column=5;
				break;
		}
		
		return column;
	}
	
	public static void main(String[] args) {
		
		int[][] chess = new int[6][6];
		Scanner sc = new Scanner(System.in);		
		for(int i=0;i<6;i++) {
			for(int k=0; k<6; k++) {
				chess[i][k] = 0;
			}
		}
				
		int srow=0;
		int scol=0;
		
		int prow=0;
		int pcol=0;
		
		for(int i=0; i<36; i++) {
			String s = sc.nextLine();
						
			int row = Integer.parseInt(s.substring(1,2))-1;
			int col = getColumn(s.charAt(0));
			
			if(i != 0) {
				if(row-2==prow && col-1==pcol) {}
				else if(row-2==prow && col+1==pcol) {}
				else if(row+2==prow && col-1==pcol) {}
				else if(row+2==prow && col+1==pcol) {}
				else if(row-1==prow && col-2==pcol) {}
				else if(row-1==prow && col+2==pcol) {}
				else if(row+1==prow && col-2==pcol) {}
				else if(row+1==prow && col+2==pcol) {}
				else {
					System.out.println("Invalid");
					return;
				}
				if(i==35) {
					if(row-2==srow && col-1==scol) {}
					else if(row-2==srow && col+1==scol) {}
					else if(row+2==srow && col-1==scol) {}
					else if(row+2==srow && col+1==scol) {}
					else if(row-1==srow && col-2==scol) {}
					else if(row-1==srow && col+2==scol) {}
					else if(row+1==srow && col-2==scol) {}
					else if(row+1==srow && col+2==scol) {}
					else {
						System.out.println("Invalid");
						return;
					}
				}
			} else {
				srow = row;
				scol = col;
			}
			
			chess[row][col]++;
			
			if(chess[row][col] > 1) {
				System.out.println("Invalid");
				return;
			}
			
			prow=row;
			pcol=col;
		}
				
		System.out.println("Valid");
	}
}
