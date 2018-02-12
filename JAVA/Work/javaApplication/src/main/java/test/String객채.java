package test;

public class String객채 {
    public static void main(String[] args) {
        String prov = "abc defg ijklm nop qrs wx yz";
        
        System.out.println(prov.length());// 문자열 길이
        System.out.println(prov.substring(4, 8));// 문자열 추출
        
        String prov2 = prov.replace("ijk", "*#$%^");// 문자열 바꾸기
        System.out.println(prov2);
        
        String num = "74 874 9883 73 9 73646 774";
        
        String arr[] = num.split(" ");// 문자열을 스페이스기준으로잘라서 arr배열에넣기
        int[] string = new int[arr.length];
        int max = string[0];
        for (int i = 0; i < arr.length; i++) {
            string[i] = Integer.valueOf(arr[i]);
            if (string[i] >= max) {
                max = string[i];
            }
            
        }
        java.util.Arrays.sort(string);
        System.out.println(string[string.length - 1]);
        System.out.println(max);
        
    }
    
}
