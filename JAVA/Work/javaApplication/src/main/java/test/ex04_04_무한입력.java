package test;

import java.util.Scanner;

public class ex04_04_무한입력 {
    public static void main (String[] args){
        
        Scanner keboard =new Scanner(System.in);
       
        int a=-0;
        
        for(;;){
            System.out.print("정수를 입력하세요 :");
            int x= keboard.nextInt();
            System.out.println("입력한 값은 :"+x+"입니다.");
           
                if(x<a){         
                    System.out.println("정상종료합니다.");
                    break;
                }
            
        }
           
    }

}
