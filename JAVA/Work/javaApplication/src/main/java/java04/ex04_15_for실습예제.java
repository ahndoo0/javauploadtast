package java04;

import java.util.Scanner;

public class ex04_15_for실습예제 {
    public static void main(String[] args){
        Scanner keborad = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n1=keborad.nextInt();
        int n2=keborad.nextInt();
        int sum=0;
        for(int i=n1; i<=n2; i=i+1){
            sum=sum+i;
            System.out.print(i);
            if (i<6){
                System.out.print("+");
            }
        }
        System.out.print("="+sum);
    
    }    
    }
