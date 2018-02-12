package java04;

import java.util.Scanner;

public class jv04_21_무한입력 {
    public static void main(String[] args) {
        Scanner keborad = new Scanner(System.in);
        
        for (;;) {
            System.out.print("정수를 입력하세요: ");
            int a = keborad.nextInt();
            
            if (0 < a) {
                System.out.println("입력한 값은" + a + "입니다.");
            }
            else{
                System.out.println("정상종료합니다");
                break;
            }
        }
    }
    
}
