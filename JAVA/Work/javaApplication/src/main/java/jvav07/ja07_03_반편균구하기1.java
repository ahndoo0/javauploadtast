package jvav07;

import java.util.Scanner;

public class ja07_03_반편균구하기1 {
    public static void main (String[] args){
    Scanner keboard =new Scanner(System.in);
    
    System.out.print("숫자를 입력하세요: ");
    int x=keboard.nextInt();
    System.out.print("숫자를 입력하세요: ");
    int y=keboard.nextInt();
    System.out.print("숫자를 입력하세요: ");
    int s=keboard.nextInt();
    
    int [] a = new int[x];
    int [] b = new int[y];
    int [] c = new int[s];
    
    System.out.println("배열의 값은: "+a.length+","+b.length+","+c.length);
    }
}
