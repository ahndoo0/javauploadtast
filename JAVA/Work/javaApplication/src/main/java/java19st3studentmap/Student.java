package java19st3studentmap;

public class Student {
    private int number;
    private String name ="삭제된 학생";
   
    
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "학생정보 : 학번=" + number + ", 이름=" + name ;
    }
    public Student() {
        super();
    }
    public Student(int number, String name) {
        super();
        this.number = number;
        this.name = name;
    }
    
    
    
}
