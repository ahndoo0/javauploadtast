package test;

import java.util.Scanner;

public class ex04_05_정수2개입력합계구하기 {
    public static void main(String[] args){
        
        Scanner keboard = new Scanner(System.in);
        System.out.print("정수입력: ");
        int n1=keboard.nextInt();
        int n2=keboard.nextInt();
        
        int sum=0;
        for(int i=n1; i<=n2; i=i+1){
            sum=sum+i;
            System.out.print(i);
            if(i<6)
            System.out.print("+");
        }
        System.out.print("="+sum);
    }
}
