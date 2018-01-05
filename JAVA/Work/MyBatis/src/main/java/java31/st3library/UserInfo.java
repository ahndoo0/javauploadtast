package java31.st3library;

public class UserInfo {
    private String logid = "";
    private String logpw = "";
    
    public String getLogid() {
        return logid;
    }
    public void setLogid(String logid) {
        this.logid = logid;
    }
    public String getLogpw() {
        return logpw;
    }
    public void setLogpw(String logpw) {
        this.logpw = logpw;
    }
    @Override
    public String toString() {
        return "UserInfo [logid=" + logid + ", logpw=" + logpw + "]";
    }
    public UserInfo(String logid, String logpw) {
        super();
        this.logid = logid;
        this.logpw = logpw;
    }
    public UserInfo() {
        super();
    }
    
    
    
}
