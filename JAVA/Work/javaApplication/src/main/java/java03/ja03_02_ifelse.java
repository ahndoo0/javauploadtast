package java03;

import java.util.Scanner;

public class ja03_02_ifelse {
    public static void main(String[] args){
        
        int grade =40;
        
        Scanner keboard = new Scanner(System.in);
        System.out.println("정수 값을 입력하세요.");
        grade=keboard.nextInt();
        
        if(grade>=60){
            System.out.println("합격입니다.");
            System.out.println("장학금도 받을 수 있습니다.");
        }
        else{
            System.out.println("불합격입니다.");
            System.out.println("장학금도 받을 수 없습니다.");
        }
    }
    
}
