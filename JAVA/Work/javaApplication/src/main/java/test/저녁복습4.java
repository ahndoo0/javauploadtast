package test;

import java.util.Scanner;

public class 저녁복습4 {
    public static void main(String[] args) {
        
    
    Scanner kebored = new Scanner(System.in);
    
    for(;;){
        System.out.print("시작단 입력: ");
        int s = kebored.nextInt();
        System.out.print("종료단 입력: ");
        int e = kebored.nextInt();
        
        if(s>e){
          int t =e;
          t=s;
          s=e;
        }
        if(s==0||e==0){
            break;
        }
        for(int i=s; i<=e; i=i+1){
            for(int j=1; j<=9;j=j+1){
                System.out.print(i+"*"+j+"="+(i*j)+" ");    
            }
            System.out.println();
        }
        
    }
    }
}
