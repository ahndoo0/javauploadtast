package 전화번호관리;

public class PhoneInfo {
    private String name ="";
    private String phoneNumber="";
    private String birthday="";
    
    
    
    public PhoneInfo() {
        super();
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
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber
                + ", birthday=" + birthday + "]";
    }
    
    
    
}
