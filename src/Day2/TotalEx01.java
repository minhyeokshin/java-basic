package Day2;

import java.util.Scanner;

public class TotalEx01 {
    //멤버변수

    static Scanner input = new Scanner(System.in);

    //사칙연산 기능 메서드 fourArtimetic
    static void fourArtimetic() {
        System.out.println("첫번째 숫자를 입력해주세요");
        int a = input.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int b = input.nextInt();
        int result = a + b;

    }
    //operator 기능 메서드
    static void operator(){
        System.out.println("국어 점수 입력 : ");
        int kor = input.nextInt();
        System.out.println("영어 점수 입력 : ");
        int eng = input.nextInt();
        int total = 0;
        double avg = 0.0;

        total = kor + eng;
        avg = total / 2;

        System.out.printf("총점:%d%n",total);
        System.out.printf("평균:%.1f",avg);
    }

    //실행 메서드
    public static void main(String[] args) {
       // fourArtimetic();
        operator();
    }
}