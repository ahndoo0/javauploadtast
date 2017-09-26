package java06;

import java.util.Scanner;

public class jv06_exisNumber {
    public static void main(String[] args){
        Scanner kebord = new Scanner(System.in);
        
        String a=kebord.next();
        System.out.println(isNumber(a));
        
    }
    public static boolean isNumber(String a){
        boolean b;
       
        if(" "==a ||a==null ){
           b=false;
        }
        
        else{
           b= true;
        }
        return b;
    }
    
}
