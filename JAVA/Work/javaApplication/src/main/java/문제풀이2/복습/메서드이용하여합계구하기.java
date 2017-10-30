package 문제풀이2.복습;

import java.util.Scanner;

public class 메서드이용하여합계구하기 {
public static void main(String[] args) {
    
    Scanner key = new Scanner(System.in);
    System.out.print("시작값을 입력하세요: ");
    int s = key.nextInt();
    System.out.print("종료값을 입력하세요: ");
    int e = key.nextInt();
    //sum(s, e);
    print(s, e, sum(s,e));
    
}    
public static int sum(int s , int e){
    if(s>e){
        int t =e;
        e=s;
        s=t;
    }
    int sum= 0;
    for (int i = s; i <= e; i++) {
        sum= sum+i;
    }
    return sum;
}

public static void print(int s, int e , int sum) {
    
    System.out.println(s+"부터"+e+"까지의 합계는"+sum);
    
}
}
