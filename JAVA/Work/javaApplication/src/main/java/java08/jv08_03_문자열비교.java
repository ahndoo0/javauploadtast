package java08;

import java.util.Scanner;

public class jv08_03_문자열비교 {
    
    public static void main(String[] args) {
       
        Scanner keborad =new Scanner(System.in);
        System.out.print("Please input first string: ");
        String s1=keborad.next();
        System.out.print("Please input second string: ");
        String s2=keborad.next();
        
        //equals을 이용하여 비교
        if(s1.equals(s2)){
            System.out.println("s1.equals(s2) : same ");
        }
        else{
            System.out.println("s1.equals(s2) : not same");
        }
        //==을 이용하여 비교
        if(s1==s2){
            System.out.println("s1==s2 : same ");
        }
        else{
            System.out.println("s1==s2 : not same");
        }
        
    }
    
}
