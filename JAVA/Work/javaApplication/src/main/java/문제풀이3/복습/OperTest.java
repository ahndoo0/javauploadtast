package 문제풀이3.복습;

import java.util.Scanner;

public class OperTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("First num: ");
        int Firstnum = key.nextInt();
        System.out.print("Second num: ");
        int Secondnum= key.nextInt();
        
        
        
        System.out.println("Add: "+Oper.Add(Firstnum, Secondnum));
        System.out.println("Minus: "+Oper.Minus(Firstnum, Secondnum));
        System.out.println("Mul: "+Oper.Mul(Firstnum, Secondnum));
        System.out.printf("Div:%.6f ",Oper.Div(Firstnum, Secondnum));
    }
}
