package BookSample;

import java.util.Scanner;

public class Page164_Sample8 {
    public static void main(String[] args) {
        System.out.println("몇 번째 코스를 선택하시겠습니까?");
        System.out.println("정수를 입력하십시오.");

        Scanner in = new Scanner(System.in);

        int res = in.nextInt();
        char ans = (res == 1) ? 'A' : 'B';

        System.out.println(ans + "코스를 선택하였습니다.");
    }
}
