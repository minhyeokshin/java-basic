package BookSample;

import java.util.Scanner;

public class Page130_Prac3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정사각형의 한변의 길이를 입력하십시오.");
        int num = in.nextInt();
        System.out.println("정사각형의 넓이는 " + (num*num) + "입니다.");
    }
}
