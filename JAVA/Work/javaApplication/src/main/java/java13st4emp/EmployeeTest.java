package java13st4emp;

import java.util.Scanner;

public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Scanner kebord = new Scanner(System.in);
        Employee [] emp = new Employee[3];
       
        
        emp[0]=new Employee();
        emp[1]=new Employee();
        emp[2]=new Employee();
        
        for(int i=0; i<emp.length; i++){
            
            System.out.println(emp[i]);
                    
        }
        
    }
    
}
