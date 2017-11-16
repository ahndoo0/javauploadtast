package 전화번호관리3;

import java.sql.Connection;
import java.util.*;

public class PhoneBook {
    private static Connection conn=DBConnect.makeConnection();
    private static DaoPhoneinfo 일반 = new DaoPhoneinfo(conn);
    private static DaoPhoneCompanyInfo 회사 =  new DaoPhoneCompanyInfo(conn);
    public static void main(String[] args) throws Exception {
        Scanner key = new Scanner(System.in);
        ModelPhoneinfo 일반phon = new ModelPhoneinfo();
        ModelPhoneCompanyInfo 회사phon = new ModelPhoneCompanyInfo();
        PhoneUnivInfo 대학phon = new PhoneUnivInfo();
        List<ModelPhoneinfo> 일반정보 = new ArrayList<>();
        
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
                System.out.println("1.일반 2.대학 3.회사");
                System.out.print("선택: ");
                int 선택2 = key.nextInt();
                if (선택2 == 1) {
                    System.out.print("ID: ");
                    Integer ID =key.nextInt();
                    일반phon.setPhoneid(ID);
                    System.out.print("이름: ");
                    String name = key.next();
                    일반phon.setName(name);
                    System.out.print("전화번호: ");
                    String phoneNumber = key.next();
                    일반phon.setPhoneNumber(phoneNumber);
                    System.out.println("데이터 입력이 완료되었습니다.");
                    일반정보.add(new ModelPhoneinfo(ID,name, phoneNumber));
                    일반.insertphoneinfo(일반phon);
                    
                } else if (선택2 == 2) {
                    System.out.print("ID: ");
                    Integer ID =key.nextInt();
                    일반phon.setPhoneid(ID);
                    System.out.print("이름: ");
                    String name = key.next();
                    대학phon.setName(name);
                    System.out.print("전화번호: ");
                    String phoneNumber = key.next();
                    대학phon.setPhoneNumber(phoneNumber);
                    System.out.print("전공: ");
                    String major = key.next();
                    대학phon.setMajor(major);
                    System.out.print("학년: ");
                    int year = key.nextInt();
                    대학phon.setYear(year);
                    System.out.println("데이터 입력이 완료되었습니다.");
                    일반정보.add(new PhoneUnivInfo(ID,name, phoneNumber, major, year));
                    
                } else if (선택2 == 3) {
                    System.out.print("ID: ");
                    Integer ID =key.nextInt();
                    일반phon.setPhoneid(ID);
                    System.out.print("이름: ");
                    String name = key.next();
                    회사phon.setName(name);
                    System.out.print("전화번호: ");
                    String phoneNumber = key.next();
                    회사phon.setPhoneNumber(phoneNumber);
                    System.out.print("회사: ");
                    String company = key.next();
                    회사phon.setCompany(company);
                    System.out.println("데이터 입력이 완료되었습니다.");
                    일반정보.add(new ModelPhoneCompanyInfo(ID,name,phoneNumber,company));
                    회사.insertphoneinfo(회사phon);
                } else {
                    System.out.println(선택2 + " 에 해당하는 선택은 존재 하지 않습니다.");
                    System.out.println("메뉴를 처음부터 다시 진행합니다.");
                    continue;
                }
                
            } else if (2 == 선택) {
                System.out.println("데이터 검색을 시작합니다..");
                System.out.print("이름: ");
                String 검색 = key.next();
                int index = -1;
                for (int i = 0; i < 일반정보.size(); i++) {
                    if (일반정보.get(i).getName().equals(검색)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("검색결과가 없습니다.");
                } else {
                    일반정보.get(index).일반();
                    System.out.println("데이터 검색이 완료되었습니다.");
                }
            } else if (3 == 선택) {
                System.out.println("데이터를 삭제 합니다.");
                System.out.print("이름: ");
                String 삭제 = key.next();
                int index = -1;
                for (int i = 0; i < 일반정보.size(); i++) {
                    if (일반정보.get(i).getName().equals(삭제)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    일반정보.remove(index);
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
