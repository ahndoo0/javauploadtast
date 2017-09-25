package java06;

public class jv06_02_왜메서드를만드는가2 {
    
    public static int getsum (int start, int end){
       
        int sum=0;
        
        for(int i=start; i<=end; i=i+1){
            sum=sum+i;
        }
        
        return sum;
    }

    public static void main (String[] args){
        
         int sum=getsum(1,10);
         System.out.println("sum의값: "+sum);
        
         int sum2=getsum(1,100);
         System.out.println("sum2의값: "+sum2);
         
         int sum3=getsum(100, sum2);
         System.out.println("sum3의값: "+sum3);
    }
               
}
    
