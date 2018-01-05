package java31.st3library;

import java.util.Date;

public class ModelAuth {
    
     private Integer authid  = null;              // `authid` INT(11) NOT NULL,
     private String  name    = "";                // `name` VARCHAR(50) NULL DEFAULT NULL,
     private String    birth   = "";               // `birth` VARCHAR(10) NULL DEFAULT NULL, 
     private String phone = "";
     private String email = "";
     
     public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAuthid() {
        return authid;
    }
    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
        
    }
    @Override
    public String toString() {
        return "ModelAuth [authid=" + authid + ", name=" + name + ", birth="
                + birth + ", phone=" + phone + ", email=" + email + "]";
    }
    public ModelAuth(Integer authid, String name, String birth, String phone,
            String email) {
        super();
        this.authid = authid;
        this.name = name;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
    }
    public ModelAuth() {
        super();
    }


 
    
}
