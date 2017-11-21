package 전화번호관리3;

public class ModelPhoneUnivInfo extends ModelPhoneinfo {
    private String major = "";
    private int    year  = 0;
    
    public void 일반() {
        System.out.println("이름: " + getName());
        System.out.println("전화번호: " + getPhoneNumber());
        System.out.println("전공: " + this.major);
        System.out.println("학년: " + this.year);
    }
    
    public ModelPhoneUnivInfo() {
        super();
    }
    
    
    
    public ModelPhoneUnivInfo(Integer phoneid, String name, String phoneNumber,
            String major, int year) {
        super(phoneid, name, phoneNumber);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "PhoneUnivInfo [major=" + major + ", year=" + year
                + ", toString()=" + super.toString() + "]";
    }
    
}
