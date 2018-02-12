package java13st4emp;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class EmployeeTest2 {
    
    public static void main(String[] args) {
        
        Scanner kebord = new Scanner(System.in);
        
        Employee[] emp = new Employee[3];
        
        for (int i = 0; i < emp.length; i++) {
            System.out.println("직원정보"+(i+1));
            System.out.print("이름:");
            String g = kebord.next();
            System.out.print("주소: ");
            String g1 = kebord.next();
            System.out.print("주민번호: ");
            String g2 = kebord.next();
            System.out.print("월급: ");
            int x = kebord.nextInt();
            
            Employee employee = new Employee(g, g1, x, g2);
            
            emp[i]=employee;
            System.out.println(emp[i]);
        }
        System.out.println();
        
        for(Employee 직원:emp){
            System.out.println(직원.toString());
        }
    }
    
}
