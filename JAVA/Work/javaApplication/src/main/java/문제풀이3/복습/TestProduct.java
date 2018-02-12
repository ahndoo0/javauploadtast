package 문제풀이3.복습;

import java.util.Scanner;

public class TestProduct {
    static int count = 0;
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Product[] pr = new Product[10];
        for (;;) {
            System.out.print("상품추가(1), 모든상품조회(2), 끝내기(3)>>>");
            int x = key.nextInt();
            if (x == 1) {
                if (count >=10) {
                    System.out.println("입력불가");
                    continue;
                }
                System.out.print("상품종류:책(1), 음악(2), 회화책(3)>>>");
                int 상품종류 = key.nextInt();
                if (상품종류 == 1) {
                    System.out.print("고유식별자: ");
                    String 상품고유식별자 = key.next();
                    System.out.print("상품설명: ");
                    String 상품설명 = key.next();
                    System.out.print("생산자: ");
                    String 생산자 = key.next();
                    System.out.print("가격: ");
                    String 가격 = key.next();
                    System.out.print("ISBN번호: ");
                    String Isbn = key.next();
                    System.out.print("저자: ");
                    String 저자 = key.next();
                    System.out.print("책제목정보: ");
                    String 책정보 = key.next();
                    pr[count++] = new Book(상품고유식별자, 상품설명, 생산자, 가격, Isbn, 저자, 책정보);
                } else if (상품종류 == 2) {
                    System.out.print("고유식별자: ");
                    String 상품고유식별자 = key.next();
                    System.out.print("상품설명: ");
                    String 상품설명 = key.next();
                    System.out.print("생산자: ");
                    String 생산자 = key.next();
                    System.out.print("가격: ");
                    String 가격정보 = key.next();
                    System.out.print("앨범제목 : ");
                    String 앨범제목 = key.next();
                    System.out.print("가수이름정보 : ");
                    String 가수이름정보 = key.next();
                    pr[count++] = new CompactDisc(상품고유식별자, 상품설명, 생산자, 가격정보, 앨범제목,
                            가수이름정보);
                } else if (상품종류 == 3) {
                    System.out.print("고유식별자: ");
                    String 상품고유식별자 = key.next();
                    System.out.print("상품설명: ");
                    String 상품설명 = key.next();
                    System.out.print("생산자: ");
                    String 생산자 = key.next();
                    System.out.print("가격: ");
                    String 가격정보 = key.next();
                    System.out.print("ISBN번호: ");
                    String iSBN번호 = key.next();
                    System.out.print("저자: ");
                    String 저자 = key.next();
                    System.out.print("책제목정보: ");
                    String 책제목정보 = key.next();
                    System.out.print("언어명정보: ");
                    String 언어명정보 = key.next();
                    pr[count++] = new ConversatinBook(상품고유식별자, 상품설명, 생산자, 가격정보,
                            iSBN번호, 저자, 책제목정보, 언어명정보);
                }
                
            } else if (x == 2) {
                System.out.print("상품ID: ");
                int z = key.nextInt();
                System.out.println(pr[z]);
                
            } else if (x == 3) {
                System.out.println("종료합니다.");
                break;
            } else {
                
            }
        }
    }
}
