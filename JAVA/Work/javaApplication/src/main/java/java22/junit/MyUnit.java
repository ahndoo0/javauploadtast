package java22.junit;

import java.util.ArrayList;

public class MyUnit {
    public String concate(String string , String string2){
        return string+string2;
    }
    public boolean getboolean(){
        return false;
    }
    public Object getSameobject(){
        return null;
    }
    public Object getobject() {
        return null;
    }
    public String[] getStringArray() {
        return new String[]{"one", "two", "three"};
    }
    public double getException() throws ArithmeticException {
        throw new ArithmeticException("Not Implemented Exception");
    }
    public ArrayList<String> getEmptyList(){
        return new ArrayList<String>();
    }
}
