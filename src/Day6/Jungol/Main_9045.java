package Day6.Jungol;

import java.util.Scanner;

public class Main_9045 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        int num = 0;

        while (true){
            System.out.printf("1. 입력하기 \n" +
                    "2. 출력하기 \n" +
                    "3. 삭제하기 \n" +
                    "4. 끝내기 \n" +
                    "작업할 번호를 선택하세요. ");
            num = in.nextInt();
            System.out.println();

            if(num == 1){
                System.out.println("입력하기를 선택하였습니다.");
                System.out.println();
            }
            else if(num == 2){
                System.out.println("출력하기를 선택하였습니다.");
                System.out.println();
            }
            else if(num == 3){
                System.out.println("삭제하기를 선택하였습니다.");
                System.out.println();
            }else if(num == 4){
                System.out.println("끝내기를 선택하였습니다.");
                break;
            }else{
                System.out.println("잘못 입력하였습니다.");
                System.out.println();
            }

        }
    }
}
