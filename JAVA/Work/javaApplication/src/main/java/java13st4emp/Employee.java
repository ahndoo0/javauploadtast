package java13st4emp;

public class Employee {
    private String  name="";
    private String address="";
    private int salary=0;
    private String rrn="";
    
    public void printname(){
        System.out.println("이름: "+name);
    }
    public void printaddress(){
        System.out.println("주소: "+address);
    }
    public void printsalry(int sal){
        
        System.out.println("월급: "+salary);
    }
    public void printrrn(){
        System.out.println("주민번호: "+rrn);
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
    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }
    
    
}
