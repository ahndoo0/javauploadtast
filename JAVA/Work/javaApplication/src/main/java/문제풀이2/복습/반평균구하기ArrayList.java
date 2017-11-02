package 문제풀이2.복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 반평균구하기ArrayList {
    
    public static void main(String[] args) {
        
        List<Integer> 학생 = new ArrayList<>();
        
        Scanner key = new Scanner(System.in);
        System.out.print("학생수 : ");
        int x = key.nextInt();
        
        for (int i = 1; i <= x; i++) {
            System.out.print("성적 : ");
            int 성적 = key.nextInt();
            학생.add(성적);
        }
        학생.set(2, 100);
        학생.remove(학생.size() - 1);
        int 첫방값 = 학생.get(0);
        System.out.println("첫번째값" + 첫방값);
        int sum = 0;
        for (int i = 0; i < 학생.size(); i++) {
            sum = sum + 학생.get(i);
        }
        System.out.println("합은:" + sum);
        System.out.println("평균: " + ((double) sum / 학생.size()));
    }
}

// int 삭제할index = list.size()-1;
// list.remove(삭제할index);
//
//// 6.list에서 0번 값을 출력하시오.
// int 첫번째값 = list.get(0);
