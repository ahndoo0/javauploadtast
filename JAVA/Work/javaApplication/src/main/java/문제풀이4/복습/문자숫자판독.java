package 문제풀이4.복습;

import java.util.Scanner;

public class 문자숫자판독 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        for (;;) {
            System.out.print("문자 하나 입력: ");
            String input = key.next();
            char 문자 = input.charAt(0);
            
            // 문자로 산술연산을 하는 경우 정수로 형변환이 되어 출력한다.
            if (('a' <= 문자 && 문자 <= 'z') || ('A' <= 문자 && 문자 <= 'Z')) {
                System.out.println("영문자 입니다.");
            }
            
            // '0' == 48 '9'==57
            // 문자로 산술연산을 하는 경우 정수로 형변환이 되어 출력한다.
            if ('0' <= 문자 && 문자 <= '9') {
                System.out.println("숫자 입니다.");
            }
        }
    }
}
