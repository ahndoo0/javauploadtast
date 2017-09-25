package test;

import java.util.Scanner;

public class ex01_대문자소문자변환 {
    public static void main (String[] args){
        
        Scanner keboard = new Scanner(System.in);
        System.out.print("ch: ");
        char ch1=keboard.next().charAt(0);
      
        if(ch1>='a' && ch1<='z'){
            System.out.println("ch to upperCase: "+Character.toUpperCase(ch1));
        }
        
        else if(ch1<='A' && ch1<='Z'){
            System.out.println("ch to lowerCase: "+Character.toLowerCase(ch1));
        }
        
       
    }
    
}
