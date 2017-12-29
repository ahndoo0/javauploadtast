package java24.mybatis.pmodel;

public class ModelCompany extends ModelPhone {
    private Integer companyid   =null;
    private String name       ="";
    private String phoneNumber ="";
    private String companys = "";

    public void 일반() {
        System.out.println("ID: "+this.companyid);
        System.out.println("이름: " + this.name);
        System.out.println("전화번호: " + this.phoneNumber);
        System.out.println("회사: " + this.companys);
    }

    @Override
    public String toString() {
        return "ModelCompany [companyid=" + companyid + ", name=" + name + ", phoneNumber=" + phoneNumber + ", company="
                + companys + ", toString()=" + super.toString() + "]";
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
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

    public String getCompanys() {
        return companys;
    }

    public void setCompanys(String company) {
        this.companys = company;
    }

    public ModelCompany(Integer companyid, String name, String phoneNumber, String company) {
        super();
        this.companyid = companyid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companys = company;
    }

    public ModelCompany() {
        super();
    }

  
   

}
