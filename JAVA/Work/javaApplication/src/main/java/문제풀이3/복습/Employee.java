package 문제풀이3.복습;

public class Employee {
    private String name="";
    private String address="";
    private int salary=0;
    private String rrn="";
   
    
    
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public int getSalary() {
        return salary;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }



    public String getRrn() {
        return rrn;
    }



    public void setRrn(String rrn) {
        this.rrn = rrn;
    }



    public Employee() {
        super();
    }



    public Employee(String name, String address, int salary, String rrn) {
        super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }



    @Override
    public String toString() {
        return "직원정보- 이름: " + name + " 주소:" + address + " 월급:"
                + salary + " 주민번호:" + rrn ;
    }
    
}
