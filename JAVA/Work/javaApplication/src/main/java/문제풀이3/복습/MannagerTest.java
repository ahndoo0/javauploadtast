package 문제풀이3.복습;

import java.util.Scanner;

public class MannagerTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Mannager[] mg = new Mannager[3];
        for (int i = 0; i < mg.length; i++) {
            mg[i] = new Mannager();
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
//        System.out.println(mg[0]);
//        System.out.println(mg[1]);
//        System.out.println(mg[2]);
        for (int i = 0; i < mg.length; i++) {
            mg[i].test();
        }
     }
}
