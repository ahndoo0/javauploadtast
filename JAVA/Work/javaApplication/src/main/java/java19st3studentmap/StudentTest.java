package java19st3studentmap;

import java.util.HashMap;
import java.util.Map;


public class StudentTest {
    public static void main(String[] args) {
        Student s;
        // HashMap 인스턴스 생성
        Map<Integer, Student> st = new HashMap<Integer,Student>();
        //Map에 추가
        //key   -->(이름 학번)
        //170101, new Student(170101,"구준표")
        //170102, new Student(170102,"금잔디")
        //170103, new Student(170103,"윤지후")
        st.put(170101, new Student(170101,"구준표"));
        st.put(170102, new Student(170102,"금잔디"));
        st.put(170103, new Student(170103,"윤지후"));
        
        //entrySet , foreach map 에 항목 출력
        for (Map.Entry<Integer, Student> elem : st.entrySet()) {
            System.out.println(elem.getKey()+":"+elem.getValue());
        }
        
        //학번 170102 를 삭제
        st.remove(170102);
        s=st.get(170103);
        System.out.println(s);
        //윤지후 이름이 "윤후"로 개명
        st.put(170103, new Student(170103,"윤후"));
        System.out.println(st);
        
        //entrySet , foreach map 에 항목 출력
        for (Map.Entry<Integer, Student> entry : st.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
            
        }
    }
}
