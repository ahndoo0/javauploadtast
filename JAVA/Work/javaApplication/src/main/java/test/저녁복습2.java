package test;

import java.util.Scanner;

public class 저녁복습2 {
    public static void main(String[] args) {
        Scanner kebored = new Scanner(System.in);
        System.out.print("시작 단수를 입력하세요: ");
        int s = kebored.nextInt();
        System.out.print("종료 단수를 입력하세요: ");
        int e = kebored.nextInt();
        int sum = 0;
        if (s > e) {
            int t = e;
            e = s;
            s = t;
        }
        
        for (int i = s; i <= e; i = i + 1) {
            for (int j = 1; j <= 9; j = j + 1) {
                sum = i * j;
                System.out.print(i + "*" + j + "=" + sum + " ");
                
                if (j == 9) {
                    System.out.print(". ");
                } else {
                    System.out.print(", ");
                }
            }
         
            System.out.println();
        }
    }
}
