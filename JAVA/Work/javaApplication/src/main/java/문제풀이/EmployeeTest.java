package 문제풀이;
import java.util.Scanner;

import 문제풀이.Employee;

public class EmployeeTest extends Employee {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        Employee[] ep = new Employee[3];
        
        
        for (int i = 0; i < ep.length; i++) {
            String name=key.next();
            String address=key.next();
            int salary=key.nextInt();
            String rrn=key.next();
        ep[i]=new Employee(name, address, salary, rrn);
        
        }
        System.out.println(ep);
    }
}
