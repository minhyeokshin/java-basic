package BookSample;

import java.util.Scanner;

public class Page131_Prac4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("삼각형의 밑변과 높이를 입력하십시오.");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        double area = (double)(num1*num2) / 2;
        System.out.println("삼각형의 넓이는 " + area + "입니다.");
    }
}
