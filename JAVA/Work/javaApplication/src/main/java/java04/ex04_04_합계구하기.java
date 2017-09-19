package java04;

import java.util.Scanner;

public class ex04_04_합계구하기 {
    public static void main(String[] args){
        
        int i,j,z;
        int sum=0;
        
        Scanner keboard =new Scanner(System.in);
        System.out.print("시작값을 입력하시오");
        z = keboard.nextInt();
       
        System.out.print("종료값을 입력하시오");
        j = keboard.nextInt();
       
        if(z>j){
            int t=z;
            z=j;
            j=t;
        }
        
        for(i=z; i<=j; i=i+1){
            sum = sum+i;
             
    }
        System.out.println(z+"부터"+j+"까지의 합은"+sum+"입니다");
    }
}
