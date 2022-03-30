package p1064_평행사변형;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static class coordinate {
		int x;
		int y;
		
		public coordinate(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static double dist(coordinate a, coordinate b) {		
		return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y, 2));
	}
	
	public static int ccw(coordinate a, coordinate b, coordinate c) {
		int temp = (b.x-a.x)*(c.y-a.y)-(b.y-a.y)*(c.x-a.x);
		
		if(temp<0) return -1;
		else if(temp>0) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		coordinate[] co = new coordinate[3];
		double[] distance = new double[3];
		
		for(int i=0; i<3; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			co[i] = new coordinate(x,y);
		}
		
		if(ccw(co[0], co[1], co[2]) == 0) {
			System.out.println(-1);
			return;
		}
		
		distance[0] = 2*(dist(co[0],co[1])+dist(co[0],co[2]));
		distance[1] = 2*(dist(co[0],co[2])+dist(co[1],co[2]));
		distance[2] = 2*(dist(co[1],co[2])+dist(co[0],co[1]));
		
		Arrays.sort(distance);
		
		double res = distance[2] - distance[0];
		
		System.out.println(res);
		
	}
}
