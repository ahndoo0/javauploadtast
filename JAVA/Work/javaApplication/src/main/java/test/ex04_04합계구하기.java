package test;

import java.util.Scanner;

public class ex04_04합계구하기 {
    public static void main(String[] args){
        
        Scanner kebodad = new Scanner(System.in);
        System.out.print("시작값");
        int s = kebodad.nextInt();
        System.out.print("종료값");
        int e= kebodad.nextInt();
        
        if(s>e){
            int t=e;
            e=s;
            s=t;
        }
        
        int sum=0;
        for(int i=s; i<=e; i=i+1){
            sum=sum+i;
        }
        
        System.out.println(s+"부터"+e+"까지의 합계는 "+sum+"입니다.");
    }
    
}
