package test;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        List<Integer>list = new java.util.ArrayList<>();
        System.out.println("학생수를 입력하세요: ");
        int x = key.nextInt();
        
        list.add(x);
    }
}
