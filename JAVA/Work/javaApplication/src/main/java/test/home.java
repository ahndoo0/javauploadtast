package test;

import java.util.Scanner;

public class home {
    public static void main(String[] args) {
       
        Scanner keboerd = new Scanner(System.in);
       
        System.out.print("시작값 :");
        int x = keboerd.nextInt();
        System.out.print("종료값 :");
        int y = keboerd.nextInt();
    
        if(x>y){
        System.out.println(y);
        int temp;
        temp=y;
        x=y;
        x=temp;
        }
        int sum=0;
        for(int i=x; i<=y; i=i+1){
        sum = sum+i;
        System.out.println(sum);
        }
    }

}
