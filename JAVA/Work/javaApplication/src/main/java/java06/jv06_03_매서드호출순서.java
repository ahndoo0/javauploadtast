package java06;

public class jv06_03_매서드호출순서 {
    
    public static void main(String[] args){
        int a=3, b=4;
        int value = Add (a,b );
        
        System.out.println(value);
    }
    
   
    public static int Add(int i, int j){
        int result = i+j;
        
        return result;
    }
    
}
