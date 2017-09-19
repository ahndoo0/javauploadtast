package test;

import java.util.Scanner;

public class tw01_02 {
    public static void main(String[] args){
        
        Scanner keboard=new Scanner(System.in);
        System.out.println("정수를 입력받고 출력하시오");
        int a=keboard.nextInt();
        System.out.println(a);
        
        System.out.println("문자열을 입력 받고 출력");
        String b= keboard.next();
        System.out.println(b);
    
    }
}
