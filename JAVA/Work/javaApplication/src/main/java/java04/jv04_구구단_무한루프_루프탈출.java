package java04;

import java.util.Scanner;

public class jv04_구구단_무한루프_루프탈출 {
    public static void main(String[] args){
        Scanner keboard = new Scanner(System.in);
        int sum=0;   
        
        for(;;){
            System.out.print("시작단수: ");
            int s =keboard.nextInt();
            System.out.print("종료단수: ");
            int e =keboard.nextInt();        
            
            if(s==0 || e==0){
                
                System.out.println("종료");
                break;
            }   
            
            if(e<s){
                int t=s;
                s=e;
                e=t;
            }
                    
            for(int i=s;i<=e;i=i+1){
                for(int j=1; j<=9; j=j+1){
                    sum=j*i;
                    System.out.print(i+"*"+j+"="+sum+" ");
             
                }
                System.out.println();
            }        
        
        }
    
    }
}
