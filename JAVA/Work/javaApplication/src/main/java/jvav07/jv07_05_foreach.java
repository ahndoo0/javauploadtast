package jvav07;

public class jv07_05_foreach {
    public static void main (String[] args){
        
        int [] numbers = {10,20,30};
        
        for(int i=0; i<=numbers.length-1; i=i+1){
            System.out.println(numbers[i]);
        }
        
        
        for (int value:numbers){
            System.out.println(value);
        }
    }
    
}
