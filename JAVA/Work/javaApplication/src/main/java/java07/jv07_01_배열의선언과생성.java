package java07;

public class jv07_01_배열의선언과생성 {
    public static void main (String[] args){
        
        int [] numbers = new int[6];
        
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        int sum= 0;
        for(int j=0; j<numbers.length; j=j+1){
            sum=sum+numbers[j];
            System.out.println(numbers[j]);
        }
        System.out.println(sum);
        
        int size=6;
        int []  numbers2 =new int[size];
        
        
    }
    
}
