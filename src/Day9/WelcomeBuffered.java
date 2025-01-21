package Day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;

public class WelcomeBuffered {

    static int ItemCount = 0;
    static String[] item = new String[ItemCount];
    static Scanner in = new Scanner(System.in);
    static int j = 0;
    static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw =
           new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main (String[] args) throws IOException{



        bw.write("당신의 이름을 입력하세요 : ");
        bw.flush();
        String userName = in.next();
        bw.write("연락처를 입력하세요 : ");
        bw.flush();
        String userMobile = in.next();


        bw.write("*".repeat(45));
        bw.write("\n");
        bw.flush();
        Hello();
        bw.write("*".repeat(45));
        bw.write("\n");
        bw.flush();

        boolean quit = false;

        while (!quit) {
            bw.write("*".repeat(45));
            bw.write("\n");
            bw.flush();
            menuIntroduction();
            bw.write("메뉴 번호를 선택해주세요 \n");
            bw.flush();
            int n = in.nextInt();

            if (n<1 || n>8 ){
                bw.write("1부터 8까지의 숫자를 입력하세요.\n");
                bw.flush();
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


    public static void Hello() throws IOException{
        bw.write("\t\t Welcome to Shopping Mall\t\t\n");
        bw.write("\t\t Welcome to Book Marktet!\t\t\n");
        bw.flush();
    }
    public static void  menuIntroduction() throws IOException{
        bw.write("1. 고객 정보 확인하기\t\t4. 바구니에 항목 추가하기\n");
        bw.write("2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기\n" );
        bw.write("3. 장바구니 비우기\t\t\t6. 장바구니의 항목 삭제하기\n");
        bw.write("7. 영수증 표시하기\t\t\t8. 종료\n");
        bw.write("*".repeat(45));
        bw.write("\n");
        bw.flush();
    }
    public static void menuGuestInfo(String userName, String userMobile) throws IOException{
        bw.write("현재 고객 정보 :\n");
        bw.flush();
        System.out.println("이름 " + userName + "\t연락처 " + userMobile);
    }
    public static void menuCartItemList() throws IOException {
        bw.write("2. 장바구니 상품 목록 보기\n");
        bw.flush();

        for (int j = 0; j < ItemCount; j++) {
            System.out.println(item[j]);
        }
    }

    public static void menuCartClear()throws IOException{
        bw.write("3. 장바구니 비우기\n");
        bw.flush();
        ItemCount = 0;
    }
    public static void menutCartAddItem() throws IOException{
        bw.write("4. 장바구니에 항목 추가하기\n");
        bw.flush();
        bw.write("상품 몇개를 추가 하시나요?\n");
        bw.flush();

        int num = in.nextInt();
        String[] newItem = new String[num];

        for (j = 0;j<num;j++){
            System.out.printf("%d번쨰 상품 입력 : ",(j+1));
            newItem[j] = in.next();

        }
        item = newItem;
        ItemCount = num;
    }

    public static void menutCartRemoveItemCount() throws IOException{

        bw.write("5. 장바구니의 항목 수량 줄이기\n");
        bw.flush();

        if (ItemCount == 0) {
            bw.write("장바구니가 비어 있습니다.\n");
            bw.flush();
            return;}

        System.out.printf("몇 개를 줄이시겠습니까? (현재 항목 수: %d): ", ItemCount);
        int num = in.nextInt();

        if (num <= 0 || num > ItemCount) {
            bw.write("값을 잘못 입력하였습니다. 올바른 수를 입력하세요.\n");
            bw.flush();
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


    public static void menuCartRemoveItem() throws IOException{
        bw.write("6. 장바구니의 항목 삭제하기\n");
        bw.flush();
        if (ItemCount == 0) {
            bw.write("장바구니가 비어 있습니다.\n");
            bw.flush();
            return;
        }


        for (int k = 0;k<ItemCount;k++){
            System.out.println(item[k]);
        }
        System.out.printf("삭제할 항목 번호를 입력하세요 (1행~%d행): ", ItemCount);
        int num = in.nextInt();

        if (num < 1 || num > ItemCount) {
            bw.write("올바른 항목 번호를 입력하세요.\n");
            bw.flush();
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

    public static void menuCarBill() throws IOException{
        bw.write("7. 영수증 표시하기\n");
        bw.flush();
        int i = 0;
        for (i = 0;i<ItemCount;i++){
            bw.write(item[i] + " 00개  00원   ");
            bw.write("\n");
            bw.flush();
        }
        System.out.printf("총 구매 품목은 [%d]개이며 금액은 00원 입니다.%n",i);
    }
    public static void menuExit() throws IOException{
        bw.write("8. 종료\n");
        bw.flush();
    }

}