package 전화번호관리;

public class PhoneInfo {
    private String name ="";
    private String phoneNumber="";
    private String birthday="";
    
    
    public void showPoneInfo(){
        System.out.println("name: "+this.name);
        System.out.println("Phone: "+this.phoneNumber);
        System.out.println("birth: "+this.birthday);
    }
    public PhoneInfo() {
        super();
    }
    
    public PhoneInfo(String name, String phoneNumber, String birthday) {
        super();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
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
