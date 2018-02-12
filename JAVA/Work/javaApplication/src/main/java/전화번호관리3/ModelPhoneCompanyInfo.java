package 전화번호관리3;

public class ModelPhoneCompanyInfo extends ModelPhoneinfo {
    
    private String company = "";
    
    public void 일반() {
        System.out.println("이름: " + getName());
        System.out.println("전화번호: " + getPhoneNumber());
        System.out.println("회사: " + this.company);
    }

    public ModelPhoneCompanyInfo() {
        super();
    }

    public ModelPhoneCompanyInfo(Integer phoneid, String name,
            String phoneNumber, String company) {
        super(phoneid, name, phoneNumber);
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
        return "ModelPhoneCompanyInfo [company=" + company + ", toString()="
                + super.toString() + "]";
    }

    
  
    
}
