package BookSample;

import java.util.Scanner;

public class Page131_Prac5 {
    public static void main(String[] args) {
        System.out.println("과목 1~5의 점수를 정수로 입력하십시오.");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int num5 = in.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        double avg = (double) sum / 5;
        System.out.println("5과목의 합계는 " +  sum + "점입니다.");
        System.out.println("5과목의 평균은 " + avg + "점입니다.");
    }
}
