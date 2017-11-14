package 전화번호관리2;

public class PhoneCompanyInfo extends PhoneInfo {
    private String company     = "";
    
    public void 일반(){
        System.out.println("이름: "+getName());
        System.out.println("전화번호: "+getPhoneNumber());
        System.out.println("회사: "+this.company);
    }
    
    public PhoneCompanyInfo() {
        super();
    }

    public PhoneCompanyInfo(String name, String phoneNumber, String company) {
        super(name,phoneNumber);
        
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "PhoneCompanyInfo [company=" + company + ", toString()="
                + super.toString() + "]";
    }

    
}
