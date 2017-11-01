package 문제풀이3.복습;

import java.util.Scanner;

public class MannagerTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Mannager[] mg = new Mannager[3];
        Mannager mannager = new Mannager();
        mg[0] = mannager;
        mg[1] = mannager;
        mg[2] = mannager;
        for (int i = 0; i < mg.length; i++) {
            System.out.print("이름: ");
            String name = key.next();
            mg[i].setName(name);
            System.out.print("주소: ");
            String address = key.next();
            mg[i].setAddress(address);
            System.out.print("월급: ");
            int salary = key.nextInt();
            mg[i].setSalary(salary);
            System.out.print("주민번호: ");
            String rrn = key.next();
            mg[i].setRrn(rrn);
            System.out.print("보너스: ");
            int bonus = key.nextInt();
            mg[i].setBonus(bonus);
        }
        for (int i = 0; i < mg.length; i++) {
            mannager.test();
        }
        
    }
}
