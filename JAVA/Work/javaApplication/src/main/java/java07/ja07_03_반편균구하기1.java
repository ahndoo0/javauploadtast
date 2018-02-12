package java07;

import java.util.Scanner;

public class ja07_03_반편균구하기1 {
    public static void main (String[] args){
        
        Scanner keboard =new Scanner(System.in);//키보드와 프로그램연결
        int x;;
        x=keboard.nextInt();
        int []arry =new int [x];
        
        for (int i=0; i<=arry.length-1; i=i+1){
            System.out.print("숫자를 입력하세요: ");
            arry[i]=keboard.nextInt();
        }
            
        System.out.print("배열의 값은:");
       
        
        for(int j=0; j<=arry.length-1; j=j+1){

            System.out.print(arry[j]);
            if(j<arry.length-1){
                System.out.print(", ");
            }
        }
        
    }
}
