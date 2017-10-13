package java13.st1var;

public class Var {
   
    public void sub(int...v){
        System.out.println("인수의 개수 : "+v.length);
        for (int x:v){
            System.out.print(x+" ");
        }
        System.out.println();
        
        
        
        for(int j=0; j<v.length; j++){
            System.out.print(v[j]+" ");
        }
        System.out.println();
        System.out.println("******************");
    }
    
}
