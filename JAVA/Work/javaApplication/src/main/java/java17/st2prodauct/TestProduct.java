package java17.st2prodauct;

import java.util.Scanner;

public class TestProduct {
    static Scanner key    = new Scanner(System.in);
    static int     roomid = 0;
    
    public static void main(String[] args) {
        // 배열을 만들다
        Product[] pr = new Product[10];
        
        pr[0] = new Book();
        pr[1] = new CompatDisc();
        pr[2] = new ConversationBook();
        
        for (;;) {
            // 상품 추가 메뉴 출력
            System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) >>");
            int menu = key.nextInt();
            if (menu == 1) {// 상품입력
                상품입력(pr);
            } else if (menu == 2) {// 상품출력
                상품출력(pr);
            } else if (menu == 3) {// 무한루프 탈출
                break;
            } else {
                System.out.println("잘못된 입력");
            }
        }
    }
    
    // 상품종류 입력 받아 배열에 저장하는 코드 추가.
    private static void 상품출력(Product[] pr) {
        for (int i = 0; i < pr.length; i++) {
            System.out.println(pr[i].toString());
            
        }
        
    }
    
    private static void 상품입력(Product[] pr) {
        System.out.print("상품 종류 책(1), CD(2), 회화책(3) >>");
        int menu = key.nextInt();
        
        if (menu == 1) {
            Book bo = new Book();
            
            System.out.print("상품설명>> ");
            bo.set상품설명(key.next());
            System.out.print("생산자>> ");
            bo.set생산자(key.next());
            System.out.print("가격>> ");
            bo.set가격정보(key.next());
            System.out.print("책제목정보>> ");
            bo.set책제목정보(key.next());
            System.out.print("저자>> ");
            bo.set저자(key.next());
            
            pr[roomid] = new Book();
            roomid += 1;
        } else if (menu == 2) {
            CompatDisc cd = new CompatDisc();
            System.out.print("상품설명>> ");
            cd.set상품설명(key.next());
            System.out.print("생산자>> ");
            cd.set생산자(key.next());
            System.out.print("가격>> ");
            cd.set가격정보(key.next());
            System.out.print("앨범제목>> ");
            cd.set앨범제목(key.next());
            System.out.print("가수>> ");
            cd.set가수이름정보(key.next());
            
            pr[roomid] = cd;
            roomid += 1;
        } else if (menu == 3) {
            ConversationBook cbook = new ConversationBook();
            System.out.print("상품설명>> ");
            cbook.set상품설명(key.next());
            System.out.print("생산자>> ");
            cbook.set생산자(key.next());
            System.out.print("가격>> ");
            cbook.set가격정보(key.next());
            System.out.print("책제목>> ");
            cbook.set책제목정보(key.next());
            System.out.print("저자>> ");
            cbook.set저자(key.next());
            System.out.print("ISBN번호>> ");
            cbook.setISBN(key.next());
            System.out.print("언어");
            cbook.set회화책(key.next());
            
            pr[roomid] = new ConversationBook();
            roomid += 1;
        } else {
            
        }
        
    }
    
}
