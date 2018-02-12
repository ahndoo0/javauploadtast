package 안도균;

public class ex2 {
    public static void main(String[] args) {
        
        int [] arr = {23, 96, 35, 42, 81, 19, 8, 77, 50};
        
        출력(arr);
     
    }
    public static void 출력(int [] arr){
        System.out.print("정렬전: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        java.util.Arrays.sort(arr);
        System.out.print("정렬후: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
