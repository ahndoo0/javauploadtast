package java24.mybatis.pmodel;

public class ModelUniv extends ModelPhone {
    private Integer univid      =null;
    private String name        ="";
    private String phoneNumber ="";
    private String major       ="";
    private Integer year        =null;
    
    public void 일반() {
        System.out.println("ID: "+this.univid);
        System.out.println("이름: " + this.name);
        System.out.println("전화번호: " + this.phoneNumber);
        System.out.println("전공: " + this.major);
        System.out.println("학년: " + this.year);
    }

    public ModelUniv() {
        super();
    }

    public ModelUniv(Integer univid, String name, String phoneNumber, String major, Integer year) {
        super();
        this.univid = univid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.major = major;
        this.year = year;
    }

    public Integer getUnivid() {
        return univid;
    }

    public void setUnivid(Integer univid) {
        this.univid = univid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ModelUniv [univid=" + univid + ", name=" + name + ", phoneNumber=" + phoneNumber + ", major=" + major
                + ", year=" + year + "]";
    }
    
    
}