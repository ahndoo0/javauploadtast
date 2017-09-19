package java03;

import java.util.Scanner;

    public class ja03_03중첩ifelse {
        public static void main(String[] args){
      
            Scanner keboard =new Scanner(System.in);
            System.out.println("정수를 입력하세요.");
            int a= keboard.nextInt();
            
            if (a>=90){
                System.out.println("학점:"+'A');
            }
            else if (a>=80){
                System.out.println("학점:"+'B');   
            }
            else if (a>=70){
                System.out.println("학점:"+'c');
            }
            else if (a>=60){
                System.out.println("학점:"+'D');
            }
            else {
                System.out.println("학점:"+'F');
            }
        }
        
    }
