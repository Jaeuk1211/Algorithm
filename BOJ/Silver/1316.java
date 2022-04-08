package p1316_그룹_단어_체커;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int res=0;
		
		
		for(int i=0; i<N; i++) {
			String temp = sc.nextLine();
			int[] count = new int[26];
			for(int k=0; k<26; k++) count[k] = 0;
			
			for(int k=0; k<temp.length(); k++) {
				int ascii = temp.charAt(k)-97;
				
				count[ascii]++;
			}		
					
			int partresult=0;
			for(int k=0; k<26; k++) {
				if(count[k] != 0) {
					char alp = (char)k;
					alp+=97;
					
					int idx = temp.indexOf(alp);
					
					if(temp.substring(idx,idx+count[k]).length() == count[k]) {
						for(int j=0; j<temp.substring(idx,idx+count[k]).length(); j++) {
							if(temp.substring(idx,idx+count[k]).charAt(j) == alp)
								partresult++;	
						}
					}
				}
			}
			
			if(temp.length() == partresult) res++;
		}
		
		System.out.println(res);
		
	}
}
