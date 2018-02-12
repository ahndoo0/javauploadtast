package java07;

import java.util.Scanner;

public class jv07_01_동적배열 {
    public static void main (String[] args){
        
        Scanner keborad =new Scanner(System.in);
        System.out.print("배열의 크기: ");
        int a =keborad.nextInt();
        
        int []x=null; 
        x = new int [a];
        
        int sum=0;
        for(int i=0; i<x.length; i=i+1){
            sum=sum+i;
            System.out.println("키보드값a: "+"["+i+"]");
        }
      
    }
    
}
