package test;

public class String객체2 {
    public static void main(String[] args) {
        String num = "74 874 9883 73 9 73646 774";
        String arr[] = num.split(" ");// 문자열을 스페이스기준으로잘라서 arr배열에넣기
        int[] string = new int[arr.length];
        int max = string[0];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            string[i] = Integer.valueOf(arr[i]);
            sum = sum+string[i];
            
        }
        System.out.println(sum);
        System.out.println(sum/string.length);
        
    }
}
