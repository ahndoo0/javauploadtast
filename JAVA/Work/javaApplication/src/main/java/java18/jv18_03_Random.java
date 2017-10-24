package java18;

import java.util.Random;
import java.util.Scanner;

public class jv18_03_Random {
    public static void main(String[] args) {
        // 난수 (임의의 수 ) 만들기
        // new Random().nextDouble()는 0부터 1사이의 실수값
        Random rand1 = new Random();
        double rand2 = rand1.nextDouble();
        System.out.println(rand2);
        System.out.println("____________________");
        // 난수를 이용해서 0부터 2사이의 값을 만드시오.
        double rand3 = rand1.nextDouble() * 2;
        System.out.println(rand3);
        System.out.println("____________________");
        // 문제. 난수를 이용해서 1부터 3사이의 값을 만드시오.
        double rand4 = rand1.nextDouble() * 2 + 1;
        System.out.println(rand4);
        System.out.println("____________________");
        // 문제. 0이상 10 미만의 난수 5개를 생성해서 출력하시오.
        double[] rand5 = new double[5];
        for (int i = 0; i < rand5.length; i++) {
            rand5[i] = rand1.nextDouble() * 10 + 0;
            System.out.println(rand5[i]);
            
        }
        System.out.println("--------------------");
        
        // 문제 . 사용자로 부터 최대 정수 A와 최소정수 B를 입력 받는다.
        // 그리고 A와 B사이에 존재하는 난수 10개를 생성해서 출력하시오.
        Scanner key = new Scanner(System.in);
        System.out.print("최대갑 A: ");
        int A = key.nextInt();
        System.out.print("최소값 B: ");
        int B = key.nextInt();
        
        int[] rand6 = new int[10];
        for (int i = 0; i < rand6.length; i++) {
            rand6[i] = rand1.nextInt(A - B + 1) + B;
            System.out.println(rand6[i]);
        }
        
    }
}
