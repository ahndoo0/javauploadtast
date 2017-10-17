package test1;

public class Employee {
    
    private String name="";
    private String address ="";
    protected int salary=0;
    private String rrn="";
    
    
    
    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }
    
   
    
}
