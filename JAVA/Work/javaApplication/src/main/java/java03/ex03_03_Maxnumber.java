package java03;

import java.util.Scanner;

public class ex03_03_Maxnumber {
    public static void main(String[] args){
        int a;
        int b;
        int c;
                
        Scanner keboard = new Scanner(System.in);
        System.out.print("첫번째 수를 입력: ");
        a= keboard.nextInt();
        System.out.print("두번쨰 수를 입력: ");
        b= keboard.nextInt();
        System.out.print("세번쨰 수를 입력: ");
        c= keboard.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println("입력갑중"+a+"가크다");
            }
            else{ 
                System.out.println("입력값중"+c+"가크다");
        
            }
        }
        else{
            if(b>c){
                System.out.println("입력값중"+b+"가크다");
            }
            else{
                System.out.println("입력값중"+c+"가크다");
            }
        }
    }
}

