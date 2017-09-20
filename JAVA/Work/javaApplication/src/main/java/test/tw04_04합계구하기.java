package test;

import java.util.Scanner;

public class tw04_04합계구하기 {
    public static void main(String[] args){
        int i=1 ;
        int sum=0 ;
        
        Scanner keboard = new Scanner(System.in);
        
        System.out.print("시작값");
        int stat= keboard.nextInt();
        
        System.out.print("종료값");
        int end= keboard.nextInt();
        
        if (stat <end) {
            for(i=stat; i<=end; i=i+1){
                sum=sum+i;
            }
            System.out.println("합계: "+"end+" +" stat+"+" ="+ sum);
        }
        else {
            for(i=end; i<=stat; i=i+1){
                sum=sum+i;
                
            }
            System.out.println("합계: "+"end+" +" stat+"+" ="+ sum);
        }
    }
    
}
