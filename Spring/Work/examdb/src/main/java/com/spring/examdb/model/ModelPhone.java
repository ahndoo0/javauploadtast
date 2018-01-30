package com.spring.examdb.model;

public class ModelPhone {
   private String phname     ;      //` VARCHAR(20) NOT NULL,
   private String phfactory  ;      //` VARCHAR(40) NOT NULL,
   private Integer phprice   ;       //` INT(11) NOT NULL DEFAULT '0'

   
   
public String getPhname() {
    return phname;
}
public void setPhname(String phname) {
    this.phname = phname;
}
public String getPhfactory() {
    return phfactory;
}
public void setPhfactory(String phfactory) {
    this.phfactory = phfactory;
}
public Integer getPhprice() {
    return phprice;
}
public void setPhprice(Integer phprice) {
    this.phprice = phprice;
}
public ModelPhone() {
    super();
}
public ModelPhone(String phname, String phfactory, Integer phprice) {
    super();
    this.phname = phname;
    this.phfactory = phfactory;
    this.phprice = phprice;
}
@Override
public String toString() {
    return "ModelPhone [phname=" + phname + ", phfactory=" + phfactory
            + ", phprice=" + phprice + "]";
}
   
   
}
