package p1063_킹;

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
		case 'G':
			column=6;
			break;
		case 'H':
			column=7;
			break;
		}
		
		return column;
	}
	
	public static char getColumn(int col) {
		char column=' ';
		
		switch(col) {
		case 0:
			column='A';
			break;
		case 1:
			column='B';
			break;
		case 2:
			column='C';
			break;
		case 3:
			column='D';
			break;
		case 4:
			column='E';
			break;
		case 5:
			column='F';
			break;
		case 6:
			column='G';
			break;
		case 7:
			column='H';
			break;
		}
		
		return column;
	}
	
	public static void main(String[] args) {
		int[][] chess = new int[8][8];
		
		Scanner sc = new Scanner(System.in);
		
		String king = sc.next();
		String stone = sc.next();
		int move = sc.nextInt();
		
		int krow = Integer.parseInt(king.substring(1,2))-1;
		int srow = Integer.parseInt(stone.substring(1,2))-1;
		
		char kchar = king.charAt(0);				
		int kcol=getColumn(kchar);		
		char schar = stone.charAt(0);		
		int scol=getColumn(schar);
		
		String[] dir = new String[move];
		for(int i=0; i<move; i++) {
			dir[i] = sc.next();
		}
		
		for(int i=0;i<8;i++) {
			for(int k=0;k<8;k++) {
				chess[i][k] = 0;
			}
		}		
		chess[krow][kcol] = 1;
		chess[srow][scol] = 2;
		
		
		for(String s : dir) {
			switch(s) {
				case "R":
					if(kcol+1 >= 8) continue;
					else {
						if(krow == srow && kcol+1 == scol) {
							if(scol+1 >= 8) continue;
							else {
								chess[krow][kcol] = 0;
								chess[srow][scol] = 1;
								chess[srow][scol+1] = 2;
								krow = srow;
								kcol = scol;
								scol = scol+1;
								continue;
							}
						} else {
							chess[krow][kcol] = 0;
							chess[krow][kcol+1] = 1;
							kcol = kcol+1;
							continue;
						}
					}
				case "L":
					if(kcol-1 <= -1) continue;
					else {
						if(krow == srow && kcol-1 == scol) {
							if(scol-1 <= -1) continue;
							else {
								chess[krow][kcol] = 0;
								chess[srow][scol] = 1;
								chess[srow][scol-1] = 2;
								krow = srow;
								kcol = scol;
								scol = scol-1;
								continue;
							}
						} else {
							chess[krow][kcol] = 0;
							chess[krow][kcol-1] = 1;
							kcol = kcol-1;
							continue;
						}
					}
				case "B":
					if(krow-1 <= -1) continue;
					else {
						if(krow-1 == srow && kcol == scol) {
							if(srow-1 <= -1) continue;
							else {
								chess[krow][kcol] = 0;
								chess[srow][scol] = 1;
								chess[srow-1][scol] = 2;
								krow = srow;
								kcol = scol;
								srow = srow-1;
								continue;
							}
						} else {
							chess[krow][kcol] = 0;
							chess[krow-1][kcol] = 1;
							krow = krow-1;
							continue;
						}
					}
				case "T":
					if(krow+1 >= 8) continue;
					else {
						if(krow+1 == srow && kcol == scol) {
							if(srow+1 >= 8) continue;
							else {
								chess[krow][kcol] = 0;
								chess[srow][scol] = 1;
								chess[srow+1][scol] = 2;
								krow = srow;
								kcol = scol;
								srow = srow+1;
								continue;
							}
						} else {
							chess[krow][kcol] = 0;
							chess[krow+1][kcol] = 1;
							krow = krow+1;
							continue;
						}
					}
				case "RT":
					if(krow+1 >= 8 || kcol+1 >= 8) continue;
					else {
						if(krow+1 == srow && kcol+1 == scol) {
							if(srow+1 >= 8 || scol+1 >= 8) continue;
							else {
								chess[krow][kcol] = 0;
								chess[srow][scol] = 1;
								chess[srow+1][scol+1] = 2;
								krow = srow;
								kcol = scol;
								srow = srow+1;
								scol = scol+1;
								continue;
							}
						} else {
							chess[krow][kcol] = 0;
							chess[krow+1][kcol+1] = 1;
							krow = krow+1;
							kcol = kcol+1;
							continue;
						}
					}
				case "LT":
					if(krow+1 >= 8 || kcol-1 <= -1) continue;
					else {
						if(krow+1 == srow && kcol-1 == scol) {
							if(srow+1 >= 8 || scol-1 <= -1) continue;
							else {
								chess[krow][kcol] = 0;
								chess[srow][scol] = 1;
								chess[srow+1][scol-1] = 2;
								krow = srow;
								kcol = scol;
								srow = srow+1;
								scol = scol-1;
								continue;
							}
						} else {
							chess[krow][kcol] = 0;
							chess[krow+1][kcol-1] = 1;
							krow = krow+1;
							kcol = kcol-1;
							continue;
						}
					}
				case "RB":
					if(krow-1 <= -1 || kcol+1 >= 8) continue;
					else {
						if(krow-1 == srow && kcol+1 == scol) {
							if(srow-1 <= -1 || scol+1 >= 8) continue;
							else {
								chess[krow][kcol] = 0;
								chess[srow][scol] = 1;
								chess[srow-1][scol+1] = 2;
								krow = srow;
								kcol = scol;
								srow = srow-1;
								scol = scol+1;
								continue;
							}
						} else {
							chess[krow][kcol] = 0;
							chess[krow-1][kcol+1] = 1;
							krow = krow-1;
							kcol = kcol+1;
							continue;
						}
					}
				case "LB":
					if(krow-1 <= -1 || kcol-1 <= -1) continue;
					else {
						if(krow-1 == srow && kcol-1 == scol) {
							if(srow-1 <= -1 || scol-1 <= -1) continue;
							else {
								chess[krow][kcol] = 0;
								chess[srow][scol] = 1;
								chess[srow-1][scol-1] = 2;
								krow = srow;
								kcol = scol;
								srow = srow-1;
								scol = scol-1;
								continue;
							}
						} else {
							chess[krow][kcol] = 0;
							chess[krow-1][kcol-1] = 1;
							krow = krow-1;
							kcol = kcol-1;
							continue;
						}
					}
			}
		}
				
		kchar = getColumn(kcol);
		schar = getColumn(scol);

		String kres = kchar+Integer.toString(krow+1);
		String sres = schar+Integer.toString(srow+1);
		
		System.out.println(kres);
		System.out.println(sres);
		
	}
}
