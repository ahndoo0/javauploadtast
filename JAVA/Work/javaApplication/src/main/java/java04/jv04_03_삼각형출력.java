package java04;

public class jv04_03_삼각형출력 {
    public static void main(String[] args) {
       
        for(int i=1; i<=10; i=i+1){
           for(int j=1; j<=10; j=j+1) {
               if(i>=j)
            System.out.print("*");
           }
           System.out.println();
        }
        
    }
    
}
