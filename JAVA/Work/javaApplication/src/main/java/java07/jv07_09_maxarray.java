package java07;

import java.util.Arrays;

public class jv07_09_maxarray {
    public static void main (String[] args){
        int[] x={23, 96, 35, 42, 81, 19, 8, 77, 50, 64};
        for(int i=0; i<x.length; i++){
           
        }
       
        printmax(x);
        System.out.println();
       
        Arrays.sort(x);
        printmax(x);
        System.out.println();
        
        System.out.println(x[0]);
        
        System.out.println(x[x.length-1]);
        
        
    }
    public static void printmax(int[]a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        
        }
        
        
    }
    
}
