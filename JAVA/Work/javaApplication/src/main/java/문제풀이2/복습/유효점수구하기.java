package 문제풀이2.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 유효점수구하기 {
    public static void main(String[] args) {
       Scanner key = new Scanner(System.in);
       System.out.print("심사위원수입력: ");
       int x=key.nextInt();
       int [] 심사위원수 = new int [x];
         
       for (int i = 0; i < 심사위원수.length; i++) {
         System.out.print("5명의 심사위원점수: ");
         int y= key.nextInt();
             심사위원수[i]=y;
       }
        java.util.Arrays.sort(심사위원수);
        System.out.print("유효점수: ");
        int 합계 = 0;
        double 평균 =0;
        for(int j =1 ; j<심사위원수.length-1; j++){
            System.out.print(심사위원수[j]+" ");
             합계 +=심사위원수[j];
                평균=심사위원수.length-2;
       }
          System.out.println();
          System.out.println("합계 :"+합계);
          System.out.printf("평균: %.2f", (합계/(double)평균));
            
          
            
        }
    

}
