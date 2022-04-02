package p1181_단어_정렬;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> arr = new ArrayList<>(N);
		
		for(int i=0;i<N;i++) {
			String string = sc.nextLine();
			arr.add(string);
		}
		
		ArrayList<String> res = new ArrayList<>(N);
		int len=1;
		
		while(res.size() != N) {
			String[] temp = new String[N];
			
			int tempidx = 0;
			for(int i=0; i<arr.size(); i++) {
				String str = arr.get(i);
				if(str.length() == len) {
					temp[tempidx] = str;
					tempidx++;
				}
			}
			
			len++;
			String[] tmp = new String[tempidx];
			for(int i=0; i<tmp.length; i++) {
				tmp[i] = temp[i];
			}
			Arrays.sort(tmp);
			
			for(int i=0;i<tmp.length;i++) {
				res.add(tmp[i]);
			}
			
		}
		
		for(int i=0; i<res.size(); i++) {
			
			if(i != res.size()-1) {
				if(res.get(i).equals(res.get(i+1))) continue;
			}
			
			System.out.println(res.get(i));
		}
		
	}
}
