package jvav07;

import java.util.Arrays;
import java.util.Scanner;

public class jv07_08_Arrays메서드 {
    public static void main (String[] args){
        
        new Scanner(System.in);
        
        //배열 만들기 
        int [] arr = new int[6];
        
        for(int i=0; i<=arr.length-1;i++){
            arr[i]=arr.length-i;
        }
        printArry(arr);
        
        
        //arrays 정렬& printArray()호출
        Arrays.sort(arr);
        printArry(arr);
        
        //arrays 검색& printArray()호출
        int Val = java.util.Arrays.binarySearch(arr,4);
        System.out.println("4값의 위치 "+Val);
        
        //arrays 초기화& printArray()호출
        Arrays.fill(arr,-1);
        printArry(arr);
        
  
    }
    public static void printArry(int[]x){
       
        for(int i=0; i<x.length; i++)
        
            System.out.print(x[i]+",");
        System.out.println();
    }
    
    
    //메서드 만들기 
    
    //메서드명 printArray
    
    //메서드 타입:void
    
    //매개변수 : 정수 배열
}
