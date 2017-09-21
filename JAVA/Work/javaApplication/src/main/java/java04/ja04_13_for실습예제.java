package java04;

import java.util.Scanner;

public class ja04_13_for실습예제 {
    public static void main(String[] atgs){
        Scanner keboard = new Scanner(System.in);
        int sum=0;
    
        for(int i=1; i<=9; i=i+1 ){
            sum= 2*i;
            System.out.print("2*" + i+"="+sum);
            if(i!=9){
                System.out.print(", ");
            }
            else{
                System.out.print(". ");
            }
        }   
    }   
}
