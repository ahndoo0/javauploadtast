package java12.st1rect;

import java.util.Scanner;

public class 면적구하기tset {
    public static void main(String[] args) {
        면적구하기 a = new 면적구하기();
        
        Scanner kebored = new Scanner(System.in);
        System.out.print("입력: ");
        double w = kebored.nextDouble();
        System.out.print("입력: ");
        double h = kebored.nextDouble();
        
        a.setHeight(h);
        a.setWidth(w);
        a.printarea();
        a.printperimeter();
        
        // 필드 인스턴스 값 키보드입력값없는
        a.setHeight(5);
        a.setWidth(10);
        a.printarea();
        a.printperimeter();
        
        System.out.println(a.toString());
        
    }
}
