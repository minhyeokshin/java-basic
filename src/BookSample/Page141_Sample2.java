package BookSample;

import java.util.Scanner;

public class Page141_Sample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력하십시오.");

        int res = in.nextInt();
        if (res == 1){
            System.out.println("1이 입력되었습니다.");
            System.out.println("1이 출력되었습니다.");
        }
        System.out.println("처리를 종료합니다.");
    }
}
