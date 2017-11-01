package java19;

import java.util.*;

public class jv10_03_HashMap {
    public static void main(String[] args) {
        String val = "";
        Map<String, String> map = null;
        
        map = new HashMap<String, String>();
//        map = new HashMap<>();
//        map = new TreeMap<>();
        //map = new Hashtable<String, String>();
        //map = new TreeMap<String, String>();

        /* C: 추가. 검색: "자바 HashMap 추가"
         *
         * 송중기
         * 이광수
         * 송혜교
         * */
        map.put("c01", "송중기");
        map.put("c02", "이광수");
        map.put("c03", "송혜교");
        System.out.println(" C: 추가 >> " + map.toString()); // 모든 항목을 출력한다.        
        
        /* C: 삽입. 검색: "자바 HashMap 삽입"
         *
         * 유재석 삽입 되나 안되나? X
         * */
        System.out.println(map.toString()); // 모든 항목을 출력한다.  

        /* R: 읽기
         *
         * 송혜교만  출력
         * */
        val=map.get("c03");
        System.out.println("R: 읽기 송혜고만 출력>>"+ val/* 송혜고만 출력 */ );

        /* U: 수정.변경. 검색: "자바 HashMap 수정"
         * 이광수의 key값을 찾으시오.
         * 이광수를 하하로 변경
         * */
        
        map.put("c02", "하하");
        System.out.println("U:이광수를 하하로 변경>>"+map.toString());
        
        /* D: 키 값으로 삭제. 검색: "자바 HashMap 삭제"
         *
         * 송혜교를 삭제
         * */
        map.remove("c03");
        System.out.println("D:송혜교를 삭제>>"+map.toString());

        
        // for문으로 Map 출력하기. 방법1
        // iterator()를 이용하는 방식은 루프안에서 map 데이터를 삭제할때 사용.
        // 
        // http://stove99.tistory.com/96        
        

        // foreach문으로 Map 출력하기. 방법2
        // Entry 를 이용
        // http://stove99.tistory.com/96
        System.out.print("foreach문으로Entry 를 이용하여 Map출력하기 >>");
        for (Map.Entry<String, String> elem : map.entrySet()) {
            System.out.print(elem.getKey()+";"+elem.getValue()+",");
        }
        System.out.println();

        // foreach문으로 Map 출력하기. 방법3
        //keySet() 을 이용
        // http://stove99.tistory.com/96
        System.out.print("foreach문 keySet() 을 이용하여 map 출력하기>> ");
        for (String key : map.keySet()) {
            System.out.print(key +","+map.get(key)+",");
        }
        System.out.println();
        
        // for 문으로  iterator()를 이용하여 map출력하기"
        // iterator()를 이용 
        // http://huskdoll.tistory.com/5/
        
        System.out.print("for 문으로  iterator()를 이용하여 map출력하기>> ");
        Iterator<String> keys = map.keySet().iterator();
        for(;keys.hasNext();){
            String key = keys.next(); //iterator에서 키값 가져오기
            System.out.print(key+";"+map.get(key)+",");
           }
        System.out.println();
        
        // S: entrySet을 이용한 TreeMap 오름차순 정렬"
        // 정렬을 위해서는 TreeMap으로 바꾼다.
        // http://huskdoll.tistory.com/5/
        
        System.out.print("오름차순 정렬>>  ");
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.putAll(map); // HashMap-->TreeMap 으로 변환
        Iterator<String>treeMapIter = treeMap.keySet().iterator();
        for (;treeMapIter.hasNext();) {
            String key = treeMapIter.next();
            String value = treeMap.get(key);
            System.out.print(key+":"+ value + ", ");
        }
        System.out.println();
        
        
        // S: HashMap 내림차순 정렬. 검색: "자바 HashMap 내림차순 정렬"
        // http://huskdoll.tistory.com/5
        System.out.print("내림차순 정렬>>  ");
        TreeMap<String, String> treeMapReverse = new TreeMap<String, String>(Collections.reverseOrder());
        treeMapReverse.putAll(map);
 
        Iterator<String> treeMapReverseIter = treeMapReverse.keySet().iterator();
         for( ; treeMapReverseIter.hasNext(); ) {
 
            String key = treeMapReverseIter.next();
            String value = treeMapReverse.get( key );
 
            System.out.print(key+" : "+value+", ");
        }        
         System.out.println();

        // S: HashMap 검색. "자바 HashMap 검색"  
        // S: 키로 검색 containsKey() 사용
        
         if(map.containsKey("c01")){
             System.out.println(map.get("c01"));
         }
        // S: 값으로 검색 containsValue() 사용
      // c11 하하 추가 
         map.put("c11", "하하");
         if(map.containsValue("하하")){
             System.out.println(map.values());
         }
    }    
}