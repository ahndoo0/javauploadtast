package 안도균;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        for (;;) {
            System.out.print("시작단: ");
            int 시작단 = key.nextInt();
            System.out.print("종료단: ");
            int 종료단 = key.nextInt();
            if (시작단 == 0 || 종료단 == 0) {
                System.out.print("종료합니다.");
                break;
            }
            출력(시작단, 종료단);
            continue;
        }
    }
    
    public static void 출력(int 시작단, int 종료단) {
        if (시작단 > 종료단) {
            int 스왑 = 종료단;
            종료단 = 시작단;
            시작단 = 스왑;
        }
        for (int i = 시작단; i <= 종료단; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}
