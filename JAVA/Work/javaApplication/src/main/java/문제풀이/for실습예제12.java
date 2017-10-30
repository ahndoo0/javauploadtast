package 문제풀이;

import java.util.Scanner;

public class for실습예제12 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("시작값: ");
        int x = key.nextInt();
        System.out.print("종료값: ");
        int y= key.nextInt();
        if(x>y){
           int s=y;
           y=x;
           x=s;
        }
        int sum =0;
        for (int i = x; i <= y; i++) {
            sum= sum+i;
//            System.out.print(i);
//            if(y>i){
//                System.out.print("+");
//            }
//            else{
//                System.out.print("=");
//            }
        }
        System.out.println(x+"부터"+y+"까지의 합계는"+sum+"입니다");
    }
}
