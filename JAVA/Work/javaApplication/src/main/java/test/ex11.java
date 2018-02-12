package test;

import java.util.Scanner;

public class ex11 {
    public static void main (String[] args){
    
        Scanner keborad =new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int y=keborad.nextInt();
       

        int [] a= new int [y];
    
        
        for (int j=0; j<a.length; j=j+1){
            
            System.out.print("숫자를 입력하세요: ");
            a[j]= keborad.nextInt();  
          
        }
        
        
        
        System.out.print("배열의 값은: ");
        for(int i=0; i<a.length; i=i+1){
            
            System.out.print(a[i]);
            
            if(i!=a.length-1){
                System.out.print(",");
            }
            
            else {
                System.out.print(".");
            }
            
        }
        
    }
    
    }
    

