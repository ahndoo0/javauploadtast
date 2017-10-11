package java11.st3;

public class boxtest {
    public static void main(String[] args){
        box x =new box();
        x.setWidth(100);
        x.setLength(100);
        x.setHeight(100);
        x.printVolumn();
        
        box y =new box();
        y.setWidth(50);
        y.setLength(50);
        y.setHeight(50);
        System.out.println(y.toString());
        y.printVolumn();
    }
   
    
}
