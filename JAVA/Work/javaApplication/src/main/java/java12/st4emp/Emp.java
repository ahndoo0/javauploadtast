package java12.st4emp;

public class Emp {
    private String name   = "";
    private double salary = 0;
    private int    count  = 0;
    
    private int mep =0;
    
    
    public Emp() {
        super();
        
    }
    
    
    public Emp(String name, double salary, int count) {
        super();
        this.name = name;
        this.salary = salary;
        this.count = count;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    
    
}
