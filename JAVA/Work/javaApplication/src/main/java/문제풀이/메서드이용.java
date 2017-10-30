package 문제풀이;

import java.util.Scanner;

public class 메서드이용 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("시작값: ");
        int x= key.nextInt();
        System.out.print("종료값: ");
        int y= key.nextInt();
        
        int sum = sum(x, y); //메서드 호출 매게변수에 키보드값 
        
        
    }
    
    public static int sum(int x , int y){
        if(x>y){
            int s=y;
            y=x;
            x=s;
         }
        int sum =0;
        for (int i = x; i <= y; i++) {
            sum= sum+i;
        }
        System.out.println(x+"부터"+y+"까지의 합계는"+sum+"입니다");
        return  sum;
    }
    
}
