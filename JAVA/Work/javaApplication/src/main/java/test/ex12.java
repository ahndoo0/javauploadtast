package test;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner keborad =new Scanner(System.in);
        
        System.out.print("학생수를 입력하세요: ");
        int x=keborad.nextInt();
        
        int[] a=new int [x];
       
        double sum=0;
        double p=0;
        for(int i=0; i<a.length; i=i+1){
            System.out.print("성적을 입력하세요: ");
            a[i]=keborad.nextInt();
           
            sum=sum+a[i];
            p=sum/x;
        }
        
        System.out.println("합계는: "+sum);
        
        System.out.println("평균은: "+p);
        
        for(int j=0; j<a.length; j=j+1){
            System.out.print(a[j]);
        }
    }
   
    
}
