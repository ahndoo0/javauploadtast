package test;

public class 저녁복습 {
    
    public static void main(String[] args) {
        for (int i = 2; i <= 19; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + (j * i) + " ");
               if(j==9){
                   System.out.print(".");
               }
               else{
                   System.out.print(",");
               }
            }
            System.out.println(" ");
        }
        
    }
    
}
