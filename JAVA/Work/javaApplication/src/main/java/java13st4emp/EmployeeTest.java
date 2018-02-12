package java13st4emp;

import java.util.Scanner;

public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Scanner kebord = new Scanner(System.in);
        
        Employee[] emp = new Employee[3];
       
        for (int i = 0; i < emp.length; i++) {
            System.out.print("이름:");
            String name = kebord.nextLine();
            System.out.print("주소: ");
            String address = kebord.nextLine();
            System.out.print("주민번호: ");
            String rrn = kebord.nextLine();
            System.out.print("월급: ");
            int x = kebord.nextInt();
            
            emp[i].set이름(name);
            emp[i].set주소(address);
            emp[i].set주민번호(rrn);
            emp[i].set월급(x);
            
            System.out.println(emp[i]);
            
        }
        
    }
    
}
