package java02;

import java.util.Scanner;

public class ex02_01_면적구하기 {
    public static void main(String[]args){
 
        int w=0;//가로 
        int h=0;//세로
        int area , perimeter;
  
        Scanner keyboard =new Scanner(System.in);
       
        System.out.println("정수를 입력하세요 "+"가로: ");//키보드에서입력요청한다
        w=keyboard.nextInt();//가로의 값을 입력
        
        System.out.println("정수를 입력하세요 "+"세로: ");//키보드에서입력요청한다
        h=keyboard.nextInt();//세로의 값을 입력
        
        area = w*h; 
        System.out.println("사각형의 넓이: "+area);//가로 세로 곱한값
        
        perimeter = 2*(w+h);
        
        System.out.println("사각형의 둘레: "+perimeter);
        //가로 세로 값을더해서2를곱한다
    }
    
}
