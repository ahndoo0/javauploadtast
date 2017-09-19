package test;

import java.util.Scanner;

public class tw01_03 {
    public static void main(String[] args){
        int salary = 0;
        int deposit= 0;
        
        Scanner keboard = new Scanner(System.in);
        System.out.println("월급을 입력하세요: ");
        salary = keboard.nextInt();
        
        deposit =12*10*salary;
        System.out.println("10년동안의 저축액: "+deposit);
        
    }
    
}
