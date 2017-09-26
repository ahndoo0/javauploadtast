package jvav07;

public class jv07_02_ArrayExam {
    public static void main (String[] args){
        
        int [] size = new int[6];
        
        int sum=0;     
        for(int i=0; i<size.length; i++){
            sum=size[i]+i;
            System.out.println("size:["+sum+"]"+"=");
        }
    }
    
}
