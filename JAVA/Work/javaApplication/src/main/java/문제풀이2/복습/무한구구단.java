package 문제풀이2.복습;

import java.util.Scanner;

public class 무한구구단 {
    public static void print(int s, int e) {
        
        for (int i = s; i <= e; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        for (;;) {
            System.out.print("시작단: ");
            int x = key.nextInt();
            System.out.print("종료단: ");
            int y = key.nextInt();
            if (x == 0 || y == 0) {
                System.out.print("종료합니다.");
                break;
            }
            if (x > y) {
                int s = y;
                y = x;
                x = s;
                
            }
            print(x, y);
        }
    }
}
