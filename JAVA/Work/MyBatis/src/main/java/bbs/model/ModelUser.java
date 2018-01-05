package bbs.model;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelUser {
    
      private Integer userno    = null;                                 // `userno` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
      private String userid     = "";                                 // `userid` VARCHAR(50) NOT NULL,
      private String email      = "";                                 // `email` VARCHAR(100) NOT NULL,
      private String passwd     = "";                                 // `passwd` VARCHAR(30) NULL DEFAULT NULL,
      private String name       = "";                                 // `name` VARCHAR(30) NULL DEFAULT NULL,
      private String mobile     = "";                                 // `mobile` VARCHAR(20) NULL DEFAULT NULL,
      private boolean retireYN  = false;                                 // `retireYN` TINYINT(1) NULL DEFAULT '1',
      private String InsertUID  = "";                                 // `InsertUID` VARCHAR(40) NULL DEFAULT NULL,
      private Date InsertDT     = null;                                 // `InsertDT` DATETIME NULL DEFAULT NULL,
      private String UpdateUID  = "";                                 // `UpdateUID` VARCHAR(40) NULL DEFAULT NULL,
      private Date UpdateDT     = null;                                 // `UpdateDT` DATETIME NULL DEFAULT NULL,
      
    public Integer getUserno() {
        return userno;
    }
    public void setUserno(Integer userno) {
        this.userno = userno;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public boolean isRetireYN() {
        return retireYN;
    }
    public void setRetireYN(boolean retireYN) {
        this.retireYN = retireYN;
    }
    public String getInsertUID() {
        return InsertUID;
    }
    public void setInsertUID(String insertUID) {
        InsertUID = insertUID;
    }
    public Date getInsertDT() {
        return InsertDT;
    }
    public void setInsertDT(Date insertDT) {
        InsertDT = insertDT;
    }
    public String getUpdateUID() {
        return UpdateUID;
    }
    public void setUpdateUID(String updateUID) {
        UpdateUID = updateUID;
    }
    public Date getUpdateDT() {
        return UpdateDT;
    }
    public void setUpdateDT(Date updateDT) {
        UpdateDT = updateDT;
    }
    public ModelUser(Integer userno, String userid, String email, String passwd,
            String name, String mobile, boolean retireYN, String insertUID,
            Date insertDT, String updateUID, Date updateDT) {
        super();
        this.userno = userno;
        this.userid = userid;
        this.email = email;
        this.passwd = passwd;
        this.name = name;
        this.mobile = mobile;
        this.retireYN = retireYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
    }
    public ModelUser() {
        super();
    }

      
}
