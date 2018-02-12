package test;

import java.util.Scanner;

public class tw01_04 {
    public static void main(String[] args){
        int w =10;
        int h =30;
        int area,perimeter;
        
        Scanner keboard = new Scanner(System.in);
        
        System.out.print("가로: ");
        w= keboard.nextInt(); 

        System.out.print("세로: ");
        h = keboard.nextInt();
        
        area=w*h;
        perimeter=2*(w+h);
        
        System.out.println("사각형의 넓이: "+area);
        System.out.println("사각형의 둘레:"+perimeter);

    }
    
}
