package java03;

import java.util.Scanner;

public class ex03_01_LargeSmall {
    public static void main(String[] args){
    
        int n=50 ;
    
        Scanner keboard=new Scanner(System.in);
        System.out.println("정수 값 입력: ");
        n=keboard.nextInt();
    
        if (n>=100){
            System.out.println("Large");
        }
        else {
            System.out.println("Small");
        }
    }
}
