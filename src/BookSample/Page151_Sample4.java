package BookSample;

import java.util.Scanner;

public class Page151_Sample4 {
    public static void main(String[] args) {
        System.out.println("정수를 입력하십시오.");
        Scanner in = new Scanner(System.in);

        int res = in.nextInt();

        if (res == 1){
            System.out.println("1이 입력되었습니다.");
        } else if (res == 2) {
            System.out.println("2가 입력되었습니다.");
        }else {
            System.out.println("1 혹은 2를 입력하십시오.");
        }
    }
}
