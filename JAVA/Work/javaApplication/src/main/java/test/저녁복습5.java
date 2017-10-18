package test;

import java.util.Scanner;

public class 저녁복습5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("시작값을 입력하세요: ");
        int x = k.nextInt();
        System.out.print("종료값을 입력하세요: ");
        int y = k.nextInt();
        x(x, y);
    }
    public static void x(int x ,int y){
        
        if(x>y){
            int t=y;
            y=x;
            x=t;
       }
        int sum=0;
        for(int i=x; i<=y;i++){
            sum=sum+i;
        
        }
        System.out.println(x+"부터"+y+"까지의 합계는"+sum+"입니다.");
            
    }
}
