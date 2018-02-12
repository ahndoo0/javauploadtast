package test;

import java.util.Scanner;

public class tw04_04합계구하기swap {
    public static void main(String[] args){
        int sum=0;
        Scanner keboard = new Scanner(System.in);
        System.out.print("시작값: ");
        int a=keboard.nextInt();
        System.out.print("종료값: ");
        int b=keboard.nextInt();
        
        
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        
        for(int i=a;i<=b;i=i+1){
               
            sum=sum+i;
               
            
        }
        System.out.println("합계: "+sum);
          
    }
}
    

