package java02;

public class ja02_21_형변환 {
    public static void main(String[]args){
        
        int i = 43;
        
        double d = (double)i ;
        System.out.println(d);
        
        char a = (char)i ;
        System.out.println(a);
        
        boolean c= (i !=0)  ;
        System.out.println(c);
        
        String w = Integer.toString(i) ;
        System.out.println(w);
        
        
    }
}
