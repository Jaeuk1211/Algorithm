package p1789_수들의_합;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		long total=0;
		long i=1;
		while(total <= N) {
			total += i;
			i++;
		}
		
		System.out.println(i-2);
		
	}
}
