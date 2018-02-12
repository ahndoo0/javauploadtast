package java02;

import java.util.Scanner;

public class jv02_ex {
    public static void main(String[] args){
        int x=0,y=1;
        int a= ++x * 2 , b= y++ * 2;
        int c= a+b;
       Scanner hssss=new Scanner(System.in);
       a=hssss.nextInt();
       System.out.println("a의값은: "+a);
       b=hssss.nextInt();
        
        System.out.println("b의값은: "+b);
        System.out.println("c의값은: "+c);
                
    }
}
