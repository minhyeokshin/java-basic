import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Welcome {

    static int ItemCount = 0;
    static String[] item = new String[ItemCount];
    static Scanner in = new Scanner(System.in);

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

        for (int i = 0; i < ItemCount; i++) {
            System.out.printf("%d", item[i]);
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

        for (int i = 0;i<=num;i++){
            ++ItemCount;
            System.out.printf("%d번쨰 상품 입력 : ",(i+1));
            item[i] = in.next();

        }
    }

    public static void menutCartRemoveItemCount(){
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem(){
        System.out.println("6. 장바구니의 항목 삭제하기");
    }
    public static void menuCarBill(){
        System.out.println("7. 영수증 표시하기");
    }
    public static void menuExit(){
        System.out.println("8. 종료");

    }

}