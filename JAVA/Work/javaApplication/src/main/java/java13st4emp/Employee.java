package java13st4emp;

public class Employee {
    private String  이름;
    private String 주소;
    private int 월급;
    private String 주민번호;
    
    public void printname(){
        System.out.println("이름: "+이름);
    }
    public void printaddress(){
        System.out.println("주소: "+주소);
    }
    public void printsalry(int sal){
        
        System.out.println("월급: "+월급);
    }
    public void printrrn(){
        System.out.println("주민번호: "+주민번호);
    }
    
    
    
    
    public Employee() {
        super();
    }
    public Employee(String 이름, String 주소, int 월급, String 주민번호) {
        super();
        this.이름 = 이름;
        this.주소 = 주소;
        this.월급 = 월급;
        this.주민번호 = 주민번호;
    }
    @Override
    public String toString() {
        return "Employee [이름=" + 이름 + ", 주소=" + 주소 + ", 월급=" + 월급 + ", 주민번호="
                + 주민번호 + "]";
    }
    public String get이름() {
        return 이름;
    }
    public void set이름(String 이름) {
        this.이름 = 이름;
    }
    public String get주소() {
        return 주소;
    }
    public void set주소(String 주소) {
        this.주소 = 주소;
    }
    public int get월급() {
        return 월급;
    }
    public void set월급(int 월급) {
        this.월급 = 월급;
    }
    public String get주민번호() {
        return 주민번호;
    }
    public void set주민번호(String 주민번호) {
        this.주민번호 = 주민번호;
    }
    
    
    
  
    }
    
    

