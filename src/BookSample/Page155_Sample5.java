package BookSample;

import java.util.Scanner;

public class Page155_Sample5 {
    public static void main(String[] args) {
        System.out.println("정수를 입력하십시오.");

        Scanner in = new Scanner(System.in);

        int res = in.nextInt();

        switch (res){
            case 1:
                System.out.println("1이 입력되었습니다.");
                break;
            case 2:
                System.out.println("2가 입력되었습니다.");
                break;
            default:
                System.out.println("1또는 2를 입력하십시오.");
                break;
        }
    }
}
