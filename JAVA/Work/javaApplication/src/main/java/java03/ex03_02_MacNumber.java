package java03;

import java.util.Scanner;

public class ex03_02_MacNumber {
    public static void main(String[] args){
        int x, y;
        
        Scanner keboard = new Scanner(System.in);

        System.out.print("x입력값: ");
        x = keboard.nextInt();
        
        System.out.print("y입력값: ");
        y = keboard.nextInt();
        
        if (x>y){
            System.out.println("x: "+x);
        }
        else if (x<y){
            System.out.println("y: "+y);
        }
        else if(x==y){
            System.out.println("x=y:"+x);
        }
    }
    
}
