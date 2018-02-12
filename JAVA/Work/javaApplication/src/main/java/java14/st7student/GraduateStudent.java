package java14.st7student;

public class GraduateStudent extends Student {
    public String lab = "";

    
    public void test(){
       
        System.out.print("lab: "+lab+" \t");
        System.out.print("number: "+getNumber()+" \t");
        System.out.print("name: "+name+" \t");
        System.out.print("phone: "+phone+" \n");
        
    }
    
    
    
    
    public GraduateStudent() {
        super();
    }




    public GraduateStudent(int number, String name, String phone, String lab) {
        super(number, name, phone);
        this.lab = lab;
    }




    @Override
    public String toString() {
        return "GraduateStudent [lab=" + lab + ", name=" + name + ", phone="
                + phone + ", toString()=" + super.toString() + "]";
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }
    
    
    
}
