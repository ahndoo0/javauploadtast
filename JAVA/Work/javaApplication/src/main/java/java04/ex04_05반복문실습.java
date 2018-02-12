package java04;

import java.util.Scanner;

public class ex04_05반복문실습 {
    public static void main(String[] args){
        
        Scanner keboard = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요: ");
        int a= keboard.nextInt();
        int b= keboard.nextInt();
        
        int sum = 0;
        for(int i=a; i<=b; i=i+1){
            sum=sum+i;
            System.out.print(i);
            if(i!=b){
                System.out.print("+");
            }
            else{
                System.out.print("="+sum);   
            }
        }
       
       
        
    }
    
}
