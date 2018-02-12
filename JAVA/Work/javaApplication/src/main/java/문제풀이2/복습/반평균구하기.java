package 문제풀이2.복습;


import java.util.Arrays;
import java.util.Scanner;

public class 반평균구하기 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
         System.out.print("학생수를 입력하세요: "); 
         int x = key.nextInt();
         int [] 학생수 = new int [x];
        
         int sum= 0;
         for (int i = 0; i < 학생수.length; i++) {
         System.out.print("성적을 입력하세요: ");
         int y= key.nextInt();
         학생수[i]=y;
         sum = sum+ 학생수[i];
         }
         System.out.println("합계는: "+sum);
         System.out.println("평균은: "+sum/x);
       
        
       
    }
    
}
