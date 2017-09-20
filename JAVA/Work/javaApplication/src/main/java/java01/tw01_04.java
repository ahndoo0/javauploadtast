package java01;

import java.util.Scanner;

public class tw01_04 {
    public static void main(String[] args){
        int w=0;
        int h=0;
        int area, perimeter;
        
        Scanner keboard =new Scanner(System.in);
        
        System.out.print("가로: ");
        w=keboard.nextInt();
        System.out.print("세로: ");
        h=keboard.nextInt();
        area=w*h;
        System.out.println("면적: "+area);
        perimeter=2*(w+h);
        System.out.println("둘레: "+perimeter);
        
        
    }
    
}
