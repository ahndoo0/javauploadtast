package 전화번호관리4;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class PhoneBook {
   private static Connection conn= DBConnect.makeConnection();
   private static DaoPhone daophone = new DaoPhone(conn);
   private static DaoUniv daouniv = new DaoUniv(conn);
   private static DaoCompany daocompany = new DaoCompany(conn);
    public static void main(String[] args) throws SQLException {
         Scanner key = new Scanner(System.in);
         ModelPhone phon = new ModelPhone();              
         ModelCompany company = new ModelCompany();         
         ModelUniv univ = new ModelUniv();               
         List<ModelPhone> info = new ArrayList<>();        
        
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
                    Integer id = key.nextInt();
                    phon.setPhoneid(id);
                    System.out.print("이름: ");
                    String name = key.next();
                    phon.setName(name);
                    System.out.print("전화번호: ");
                    String phoneNumber = key.next();
                    phon.setPhoneNumber(phoneNumber);
                    System.out.println("데이터 입력이 완료되었습니다.");
                    info.add(new ModelPhone(id, name, phoneNumber));
                    daophone.insertphone(phon);

                } else if (선택2 == 2) {
                    System.out.print("ID: ");
                    Integer id = key.nextInt();
                    univ.setPhoneid(id);
                    System.out.print("이름: ");
                    String name = key.next();
                    univ.setName(name);
                    System.out.print("전화번호: ");
                    String phoneNumber = key.next();
                    univ.setPhoneNumber(phoneNumber);
                    System.out.print("전공: ");
                    String major = key.next();
                    univ.setMajor(major);
                    System.out.print("학년: ");
                    int year = key.nextInt();
                    univ.setYear(year);
                    System.out.println("데이터 입력이 완료되었습니다.");
                    info.add(new ModelUniv(id, name, phoneNumber, major, year));
                    daouniv.insertBook(univ);
                } else if (선택2 == 3) {
                    System.out.print("ID: ");
                    Integer id = key.nextInt();
                    company.setPhoneid(id);
                    System.out.print("이름: ");
                    String name = key.next();
                    company.setName(name);
                    System.out.print("전화번호: ");
                    String phoneNumber = key.next();
                    company.setPhoneNumber(phoneNumber);
                    System.out.print("회사: ");
                    String companys = key.next();
                    company.setCompanys(companys);
                    System.out.println("데이터 입력이 완료되었습니다.");
                    info.add(new ModelCompany(id, name, phoneNumber, companys));
                    daocompany.insertCompany(company);
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
                for (int i = 0; i < info.size(); i++) {
                    if (info.get(i).getName().equals(검색)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("검색결과가 없습니다.");
                } else {
                    info.get(index).일반();
                    System.out.println("데이터 검색이 완료되었습니다.");
                }
            } else if (3 == 선택) {
                System.out.println("데이터를 삭제 합니다.");
                System.out.print("이름: ");
                String 삭제 = key.next();
                int index = -1;
                for (int i = 0; i < info.size(); i++) {
                    if (info.get(i).getName().equals(삭제)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    info.remove(index);
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
