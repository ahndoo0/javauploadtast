package 전화번호관리4;

import java.sql.ResultSet;

public class ModelPhone {
    private Integer phoneid = null;
    private String name = "";
    private String phoneNumber = "";

    public void 일반() {
        System.out.println("ID: "+this.phoneid);
        System.out.println("이름: " + this.name);
        System.out.println("전화번호: " + this.phoneNumber);
    }

    @Override
    public String toString() {
        return "ModelPhone [phoneid=" + phoneid + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    public Integer getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(Integer phoneid) {
        this.phoneid = phoneid;
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

    public ModelPhone(Integer phoneid, String name, String phoneNumber) {
        super();
        this.phoneid = phoneid;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public ModelPhone() {
        super();
    }

   
}
