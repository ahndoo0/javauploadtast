package java01;

import java.util.Scanner;

public class tw01_03 {
    public static void main(String[] args){
        int salary=0;
        int deposit;
        
        
        Scanner keboad = new Scanner(System.in);
        
        System.out.print("월급을 입력하세요 :");
        salary=keboad.nextInt();
        
        deposit=12*10*salary;
        System.out.print("10년 동안의 저축액:"+deposit);
        
        
    }
    
}
