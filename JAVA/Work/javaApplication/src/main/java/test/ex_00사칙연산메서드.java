package test;

import java.util.Scanner;

public class ex_00사칙연산메서드 {
    public static void main (String[] args){
        Scanner keborad=new Scanner(System.in);
        System.out.print("Firsr num: ");
        int y=keborad.nextInt();
        System.out.print("Second num: ");
        int x=keborad.nextInt();
        
        int add=Add(x,y);
        System.out.println("Add: "+add);
        
        int minus=Minus(x, y);
        System.out.println("Minus: "+minus);
        
        int mul=Mul(x,y);
        System.out.println("Mul: "+mul);
        
        double div=Div(x, y);
        System.out.println("Div: "+div);
        
    }
    public static int Add(int x, int y){
        int b=x+y;
        return b;
    }
    public static int Minus(int x, int y){
        int b=y-x;
        return b;
    }
    public static int Mul(int x, int y){
        int b=x*y;
        return b;
    }
    public static double Div(int x, int y){
        int b=x/y;
        return b;
    }
    
}
