package java06;

import java.util.Scanner;

public class ex06_03_사칙연산메서드 {
    public static void main(String[] args){
        Scanner keboard = new Scanner(System.in);
        System.out.print("First num: ");
        int x=keboard.nextInt();
        System.out.print("Second num: ");
        int y=keboard.nextInt();
        
        int add =Add (x, y);
        System.out.println ("add: "+add);
        
        int minus= Minus (x,y);
        System.out.println("Minus: "+minus);
        
        int mul = Mul(x,y);
        System.out.println("mul: "+mul);
        
        double div= Div(x,y);
        System.out.println("div: "+div);
                
    }

    public static int Add(int x, int y) {
       
        int j =x+y;
        return j;
    }    
    
    public static int Minus(int x, int y ){
       
        int j= x-y;
        return j;
    }
    
    public static int Mul ( int x, int y){
        
        int j= x*y;
        return j;
    }
    
    public static double Div (double x, double y){
        
        double j= x/y;
        return j;
        
    }
    
    
}
