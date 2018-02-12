package java07;

import java.util.Scanner;

public class ja07_03_반평균구하기 {
    public static void main (String[] args){
        
        Scanner keborad = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int x=keborad.nextInt();
        
        int [] s = new int[x];
        int sum=0;
        int z=0;
        for(int i=0; i<=s.length-1; i++){
            System.out.print("성적을 입력하시오: ");
            s[i]=keborad.nextInt();
            sum=sum+s[i];
            z=sum/x;
        }
        System.out.println("합계는: "+sum);
        System.out.println("평균은: "+z);
    }
  
    }
