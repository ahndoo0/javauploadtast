package 안도균;

import java.util.Scanner;

public class ex4  {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("First Num: ");
        int firstNum = key.nextInt();
        System.out.print("Second Num: ");
        int secondNum = key.nextInt();
        Oper oper = new Oper(firstNum, secondNum);
        System.out.println("Add: "+oper.Add());
        System.out.println("Minus: "+oper.Minus());
        System.out.println("Mul: "+oper.Mul());
        System.out.printf("Div: %6f",oper.Div());
    }
}
