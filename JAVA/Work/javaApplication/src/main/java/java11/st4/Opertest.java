package java11.st4;

import java.util.Scanner;

public class Opertest {
    public static void main(String[] args) {
        Scanner keborad = new Scanner(System.in);
        Oper o = new Oper();
        int x= keborad.nextInt();
        int y= keborad.nextInt();
        
       
       
        o.setA(x);
        o.setB(y);
       
        o.add();
        o.minus();
        o.mul();
        o.div();
    }
}
