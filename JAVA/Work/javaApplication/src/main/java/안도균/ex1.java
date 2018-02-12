package 안도균;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("시작값을 입력하세요:");
        int num1 = key.nextInt();
        System.out.print("종료값을 입력하세요: ");
        int num2 = key.nextInt();
        입력출력(num1, num2);
        
    }
    public static int 입력출력(int num1, int num2) {
        if (num1 > num2) {
            int num3 = num2;
            num2 = num1;
            num1 = num3;
        }
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum = sum + i;
            System.out.print(i);
            if (i < num2) {
                System.out.print("+");
            } else {
                System.out.print("=");
            }
        }
        System.out.print(sum);
        return sum;
    }
}
