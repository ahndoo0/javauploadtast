package test;

import java.util.Scanner;

public class OperTest {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.print("First num: ");
        int x=k.nextInt();
        System.out.print("Second num: ");
        int y=k.nextInt();
        Oper o =new Oper();
        o.Add(x, y);
        o.Minus(x, y);
        o.Mul(x, y);
        o.Div(x, y);
        
        
    }
}
