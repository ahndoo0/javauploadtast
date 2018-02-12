package java23.jdbc전화번호관리;

public class ModelPhoneUnivinfo {
    private Integer PhoneUnivinfoid = null; // PhoneUnivinfoid` INT(11) NOT NULL,
    private String  name            = "";   // `name` VARCHAR(15) NULL DEFAULT NULL,
    private String  phoneNumber     = "";   // `phoneNumber` VARCHAR(50) NULL DEFAULT NULL,
    private String  major           = "";   // `major` VARCHAR(50) NULL DEFAULT NULL,
    private String  year            = "";   // `year` INT(3) NULL DEFAULT NULL,
    
    
    public ModelPhoneUnivinfo() {
        super();
    }


    public ModelPhoneUnivinfo(Integer phoneUnivinfoid, String name,
            String phoneNumber, String major, String year) {
        super();
        PhoneUnivinfoid = phoneUnivinfoid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.major = major;
        this.year = year;
    }


    public Integer getPhoneUnivinfoid() {
        return PhoneUnivinfoid;
    }


    public void setPhoneUnivinfoid(Integer phoneUnivinfoid) {
        PhoneUnivinfoid = phoneUnivinfoid;
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


    public String getYear() {
        return year;
    }


    public void setYear(String year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "ModelPhoneUnivinfo [PhoneUnivinfoid=" + PhoneUnivinfoid
                + ", name=" + name + ", phoneNumber=" + phoneNumber + ", major="
                + major + ", year=" + year + "]";
    }
    
    
    
}
