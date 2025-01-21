import jdk.dynalink.beans.StaticClass;

import java.awt.event.ItemEvent;
import java.util.Map;
import java.util.Scanner;

public class Welcome {

    static int ItemCount = 0;
    static String[] item = new String[ItemCount];
    static Scanner in = new Scanner(System.in);
    static int j = 0;

    public static void main(String[] args) {

        System.out.printf("당신의 이름을 입력하세요 : ");
        String userName = in.next();
        System.out.printf("연락처를 입력하세요 : ");
        String userMobile = in.next();

        System.out.println("*".repeat(45));
        Hello();
        System.out.println("*".repeat(45));

        boolean quit = false;

        while (!quit) {
            System.out.println("*".repeat(45));
            menuIntroduction();
            System.out.printf("메뉴 번호를 선택해주세요 ");
            int n = in.nextInt();

            if (n<1 || n>8 ){
                System.out.println("1부터 8까지의 숫자를 입력하세요.");
            }else {
                switch (n){
                    case 1:
                        menuGuestInfo(userName,userMobile);
                        break;
                    case 2:
                        menuCartItemList();
                        break;
                    case 3:
                        menuCartClear();
                        break;
                    case 4 :
                        menutCartAddItem();
                        break;
                    case 5:
                        menutCartRemoveItemCount();
                        break;
                    case 6:
                        menuCartRemoveItem();
                        break;
                    case 7:
                        menuCarBill();
                        break;
                    case 8:
                        menuExit();
                        quit = true;
                        break;
                }
            }


        }
    }


    public static void Hello(){
        System.out.println("\t\t Welcome to Shopping Mall\t\t");
        System.out.println("\t\t Welcome to Book Marktet!\t\t");
    }
    public static void  menuIntroduction(){
        System.out.println("1. 고객 정보 확인하기\t\t4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기" );
        System.out.println("3. 장바구니 비우기\t\t\t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기\t\t\t8. 종료");
        System.out.println("*".repeat(45));
    }
    public static void menuGuestInfo(String userName, String userMobile){
        System.out.println("현재 고객 정보 :");
        System.out.println("이름 " + userName + "\t연락처 " + userMobile);
    }
    public static void menuCartItemList() {
        System.out.println("2. 장바구니 상품 목록 보기");

        for (int j = 0; j < ItemCount; j++) {
            System.out.println(item[j]);
        }
    }

    public static void menuCartClear(){
        System.out.println("3. 장바구니 비우기");
        ItemCount = 0;
    }
    public static void menutCartAddItem(){
        System.out.println("4. 장바구니에 항목 추가하기");
        System.out.println("상품 몇개를 추가 하시나요?");

        int num = in.nextInt();
        String[] newItem = new String[num];

        for (j = 0;j<num;j++){
            System.out.printf("%d번쨰 상품 입력 : ",(j+1));
            newItem[j] = in.next();

        }
        item = newItem;
        ItemCount = num;
    }

    public static void menutCartRemoveItemCount(){

        System.out.println("5. 장바구니의 항목 수량 줄이기");

        if (ItemCount == 0) {
            System.out.println("장바구니가 비어 있습니다.");
            return;}

        System.out.printf("몇 개를 줄이시겠습니까? (현재 항목 수: %d): ", ItemCount);
        int num = in.nextInt();

        if (num <= 0 || num > ItemCount) {
            System.out.println("값을 잘못 입력하였습니다. 올바른 수를 입력하세요.");
            return;
        }

        // 새로운 배열 생성
        String[] newItem = new String[ItemCount - num];
        for (int i = 0; i < newItem.length; i++) {
            newItem[i] = item[i]; // 기존 데이터 복사
        }

        item = newItem;
        ItemCount -= num;
        System.out.printf("%d개의 항목이 제거되었습니다. 현재 항목 수: %d%n", num, ItemCount);
    }


    public static void menuCartRemoveItem(){
        System.out.println("6. 장바구니의 항목 삭제하기");
        if (ItemCount == 0) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        System.out.printf("삭제할 항목 번호를 입력하세요 (1~%d): ", ItemCount);
        int num = in.nextInt();

        if (num < 1 || num > ItemCount) {
            System.out.println("올바른 항목 번호를 입력하세요.");
            return;
        }

        // 새로운 배열 생성
        String[] newItem = new String[ItemCount - 1];
        int index = 0;
        for (int i = 0; i < ItemCount; i++) {
            if (i != num - 1) { // 선택한 항목 제외
                newItem[index++] = item[i];
            }
        }

        item = newItem;
        ItemCount--;
        System.out.printf("%d번 항목이 삭제되었습니다. 현재 항목 수: %d%n", num, ItemCount);
    }

    public static void menuCarBill(){
        System.out.println("7. 영수증 표시하기");
        int i = 0;
        for (i = 0;i<ItemCount;i++){
            System.out.println(item[i] + " 00개  00원   ");
        }
        System.out.printf("총 구매 품목은 %d개이며 금액은 00원 입니다.%n", i);
    }
    public static void menuExit(){
        System.out.println("8. 종료");

    }

}