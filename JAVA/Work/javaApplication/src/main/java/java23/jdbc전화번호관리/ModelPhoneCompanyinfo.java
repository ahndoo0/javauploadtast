package java23.jdbc전화번호관리;

public class ModelPhoneCompanyinfo {
    private Integer PhoneCompanyinfoid = null; // PhoneCompanyinfoid` INT(11) NOT NULL,
    private String  name               = "";   // `name` VARCHAR(50) NULL DEFAULT NULL,
    private String  phoneNumber        = "";   // `phoneNumber` VARCHAR(50) NULL DEFAULT NULL,
    private String  company            = "";   // `company` VARCHAR(50) NULL DEFAULT NULL,
    
    public ModelPhoneCompanyinfo() {
        super();
    }
    
    public ModelPhoneCompanyinfo(Integer phoneCompanyinfoid, String name,
            String phoneNumber, String company) {
        super();
        PhoneCompanyinfoid = phoneCompanyinfoid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.company = company;
    }
    
    public Integer getPhoneCompanyinfoid() {
        return PhoneCompanyinfoid;
    }
    
    public void setPhoneCompanyinfoid(Integer phoneCompanyinfoid) {
        PhoneCompanyinfoid = phoneCompanyinfoid;
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
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    @Override
    public String toString() {
        return "ModelPhoneCompanyinfo [PhoneCompanyinfoid=" + PhoneCompanyinfoid
                + ", name=" + name + ", phoneNumber=" + phoneNumber
                + ", company=" + company + "]";
    }
    
}
