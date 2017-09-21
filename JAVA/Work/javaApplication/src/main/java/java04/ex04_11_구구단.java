package java04;

import java.util.Scanner;

public class ex04_11_구구단 {
    public static void main(String[] args){
       int i, j, s, e;
       int a=0;
        Scanner keborad = new Scanner(System.in);
        System.out.print("시작단수:");
        s =keborad.nextInt();
        System.out.print("종료단수:");
        e=keborad.nextInt();
        
            if(e<s){
            int k=e;
            e=s;
            s=k;    
            }
        for( i=s; i<=e; i=i+1){
                for( j=1; j<=9; j=j+1){
                a=j*i;
                System.out.print(i+"*"+j+"="+a+" ");
                    if(j==9){
                    System.out.print(".");
                    }
                        else{
                                System.out.print(",");
                        }
                }
            
            System.out.println();
        }
    }
    }
