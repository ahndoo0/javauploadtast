package java06;

import java.util.Scanner;

public class jv06_02_inputVal {
    public static void main (String[] args){
        Scanner keborad = new Scanner(System.in);
        System.out.print("입력: ");
        String x=keborad.next();
        
        boolean isnumber= isNumber(x);
        System.out.print("String: "+isnumber);
    }
    
    public static boolean isNumber(String x){
        boolean result;
        
        if(x==null || x==""){
            result= false;
        }
        
        else {
            result =true;
        }
        
        return result;
    }
    
}
