package 문제풀이;

import java.util.Scanner;

public class 사칙연산메서드 {
    public static void main(String[] args) {
        oper oper = new oper();
        Scanner key = new Scanner(System.in);
        System.out.print("First num: ");
        int x= key.nextInt();
        System.out.print("Second num: ");
        int y= key.nextInt();
        
        oper.Add(x, y);
        oper.Minus(x, y);
        oper.Mul(x, y);
        oper.Div(x, y);
        
        
    }
    
  
    
}
