package 전화번호관리;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        PhoneInfo phon = new PhoneInfo();
        List<PhoneInfo> 정보 = new ArrayList<>();
        
        for (;;) {
            System.out.println("선택하세요..");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터삭제");
            System.out.println("4. 프로그램종료");
            System.out.print("선택: ");
            
            int 선택 = key.nextInt();
            if (선택 == 1) {
                System.out.println("데이터 입력을 시작합니다..");
                System.out.print("name: ");
                String name = key.next();
                phon.setName(name);
                System.out.print("phone:");
                String phone = key.next();
                phon.setPhoneNumber(phone);
                System.out.print("birth: ");
                String birth = key.next();
                phon.setBirthday(birth);
                System.out.println("데이터 입력이 완료 되었습니다.");
                정보.add(new PhoneInfo(name, phone, birth));
            } else if (2 == 선택) {
                System.out.println("데이터 검색을 시작합니다..");
                System.out.print("이름: ");
                String 검색 = key.next();
                int index = -1;
                for (int i = 0; i < 정보.size(); i++) {
                    if (정보.get(i).getName().equals(검색)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("검색결과가 없습니다.");
                } else {
                    정보.get(index).showPoneInfo();
                    System.out.println("데이터 검색이 완료되었습니다.");
                }
            } else if (3 == 선택) {
                System.out.println("데이터를 삭제 합니다.");
                System.out.print("이름: ");
                String 삭제 = key.next();
                int index = -1;
                for (int i = 0; i < 정보.size(); i++) {
                    if (정보.get(i).getName().equals(삭제)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    정보.remove(index);
                    System.out.println("데이터 삭제가 완료되었습니다.");
                }
            } else if (4 == 선택) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println(선택 + " 에 해당하는 선택은 존재 하지 않습니다.");
                System.out.println("메뉴를 처음부터 다시 진행합니다.");
                continue;
            }
        }
    }
}
