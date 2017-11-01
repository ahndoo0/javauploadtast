package 문제풀이3.복습;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Employee [] employee=new Employee[3];
        employee[0] = new Employee();
        employee[1] = new Employee();
        employee[2] = new Employee();
        for (int i = 0; i < employee.length; i++) {
            System.out.print("이름: ");
            String name=key.next();
            employee[i].setName(name);
            System.out.print("주소: ");
            String address=key.next();
            employee[i].setAddress(address);
            System.out.print("월급: ");
            int salary=key.nextInt();
            employee[i].setSalary(salary);
            System.out.print("주민번호");
            String rrn=key.next();
            employee[i].setRrn(rrn);
       }
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
        
        
        
    }
}
