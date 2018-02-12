package 문제풀이;

import java.util.Scanner;

public class 무한구구단 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        for (;;) {
            System.out.print("시작단: ");
            int x = key.nextInt();
            System.out.print("종료단: ");
            int y = key.nextInt();
            if (x > y) {
                int s = y;
                y = x;
                x = s;
            }
            if (x == 0 || y == 0) {
                System.out.println("종료합니다.");
                break;
            }
            for (int i = x; i <= y; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + "*" + j + "=" + (i * j));
                }
                
            }
            
        }
    }
}
