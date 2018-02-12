package java23.jdbc전화번호관리;

public class ModelPhoneinfo {
    private Integer phoneinfoid = null; // phoneinfoid INT(11) NOT NULL,
    private String  name        = "";   // name` VARCHAR(50) NULL DEFAULT NULL,
    private String  phoneNumbe  = "";   // phoneNumbe` VARCHAR(15) NULL DEFAULT NULL,
    
    public ModelPhoneinfo() {
        super();
    }
    
    public ModelPhoneinfo(Integer phoneinfoid, String name, String phoneNumbe) {
        super();
        this.phoneinfoid = phoneinfoid;
        this.name = name;
        this.phoneNumbe = phoneNumbe;
    }
    
    public Integer getPhoneinfoid() {
        return phoneinfoid;
    }
    
    public void setPhoneinfoid(Integer phoneinfoid) {
        this.phoneinfoid = phoneinfoid;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhoneNumbe() {
        return phoneNumbe;
    }
    
    public void setPhoneNumbe(String phoneNumbe) {
        this.phoneNumbe = phoneNumbe;
    }
    
    @Override
    public String toString() {
        return "ModelPhoneinfo [phoneinfoid=" + phoneinfoid + ", name=" + name
                + ", phoneNumbe=" + phoneNumbe + "]";
    }
    
}
