package p1606_침투_계획_세우기;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x == 0 && y == 0) {
            System.out.println(1);
            return;
        }
        
        int start = Math.max(Math.abs(x), Math.abs(y));
        long m = 2;
        int tem_x = x;
        int tem_y = y;
        
        if(x < 0 && y < 0) {
            while(tem_x != 0) {
                tem_x++;
                tem_y--;
            }
            start = Math.abs(tem_y);
        }
        else if(x > 0 && y > 0) {
            while(tem_x != 1) {
                tem_x--;
                tem_y++;
            }
            start = Math.abs(tem_y);
        }
        
        if(start != 1) {
            for(int i = 0; i < start-1; i++) {
                m = m+7+6*i;
            }
        }
        
        tem_x = 0;
        tem_y = start;
        
        if(tem_x == x && tem_y == y) {
            System.out.println(m);
            return;
        }
        else {
            for(int i = 0; i < start; i++) {
                tem_x--;
                m++;
                if(tem_x == x && tem_y == y) {
                    System.out.println(m);
                    return;
                }
            }
            for(int i = 0; i < start; i++) {
                tem_y--;
                m++;
                if(tem_x == x && tem_y == y) {
                    System.out.println(m);
                    return;
                }
            }
            for(int i = 0; i < start; i++) {
                tem_x++;
                tem_y--;
                m++;
                if(tem_x == x && tem_y == y) {
                    System.out.println(m);
                    return;
                }
            }
            for(int i = 0; i < start; i++) {
                tem_x++;
                m++;
                if(tem_x == x && tem_y == y) {
                    System.out.println(m);
                    return;
                }
            }
            for(int i = 0; i < start+1; i++) {
                tem_y++;
                m++;
                if(tem_x == x && tem_y == y) {
                    System.out.println(m);
                    return;
                }
            }
            for(int i = 0; i < start; i++) {
                tem_x--;
                tem_y++;
                m++;
                if(tem_x == x && tem_y == y) {
                    System.out.println(m);
                    return;
                }
            }
        }
    }
}