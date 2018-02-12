package java14.st7student;

public class GraduateStudentTest {
    public static void main(String[] args) {
        GraduateStudent s1 =new GraduateStudent();
        s1.setNumber(100);
        s1.setName("안도균");
        s1.setPhone("010-3535-2595");
        s1.setLab("01");
       
        System.out.println(s1.toString());
        
        System.out.println("______________________________________________________________________________________________________________________");
        System.out.println();
        
        GraduateStudent s2 = new GraduateStudent();
        s2.setNumber(200);
        s2.name="안도균";
        s2.phone="010-3535-2595";
        s2.lab="02";
        
        System.out.println(s2.toString());
        
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.println();
        
        GraduateStudent s3 = new GraduateStudent(300,"안도균","010-3535-2595","03");
        System.out.println(s3.toString());
    }
}
