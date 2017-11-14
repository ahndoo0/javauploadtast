package 전화번호관리2;

public class PhoneInfo {
    private String name ="";
    private String phoneNumber="";
    
    public void 일반(){
        System.out.println("이름: "+this.name);
        System.out.println("전화번호: "+this.phoneNumber);
    }
    public PhoneInfo() {
        super();
    }
    
    public PhoneInfo(String name, String phoneNumber) {
        super();
        this.name = name;
        this.phoneNumber = phoneNumber;
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
    @Override
    public String toString() {
        return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }
    
    
    
}
