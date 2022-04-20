package p1439_뒤집기;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		ArrayList<String> ls0 = new ArrayList<>();
		ArrayList<String> ls1 = new ArrayList<>();
		
		int idx=0;
		String temp = s;
		while(s.length() > 0) {			
			temp = temp.substring(idx);
			
			if(temp.charAt(0) == '0') {
				idx = temp.indexOf("1");
				
				if(idx == -1) {
					ls0.add(temp.substring(0));
					break;
				}
				else ls0.add(temp.substring(0,idx));
			}
			else {
				idx = temp.indexOf("0");
				
				if(idx == -1) {
					ls1.add(temp.substring(0));
					break;
				}
				else ls1.add(temp.substring(0,idx));
			}
		}
		
		if(ls0.size() < ls1.size()) System.out.println(ls0.size());
		else System.out.println(ls1.size());
	}
}
