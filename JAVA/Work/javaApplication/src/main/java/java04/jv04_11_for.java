package java04;

public class jv04_11_for {
    public static void main(String[] args){
        
        int i;
        for( i=4; i<=9; i=i+1){
            System.out.println(i);
        }
        
        int sum=0;
        for(i=1; i<=10; i=i+1){
            sum = sum +i;
            System.out.println("1부터"+ i + "까지의합:" +sum);
        }
        
    }
    
}
