package 안도균;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Employee[] ep = new Employee[3];//크기가 3일배열 만들기
        int num = 1;
        for (int i = 0; i < ep.length; i++) {
            System.out.println(num + "번째 사원 입력");
            ep[i] = new Employee();//인트턴스 생성후 배열 에 넣는다.
            System.out.print("이름: ");
            String name = key.next();
            ep[i].setName(name);
            System.out.print("주소: ");
            String addr = key.next();
            ep[i].setAddr(addr);
            System.out.print("월급: ");
            int salary = key.nextInt();
            ep[i].setSalary(salary);
            System.out.print("주민번호: ");
            String rrn = key.next();
            ep[i].setRrn(rrn);
            num++;
        }
        for (Employee employee : ep) {// 배열에 저장된 모든데이터 출력
            System.out.println(employee);
        }
    }
}
