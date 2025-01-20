package Day9;
// 짝홀수를 판별하는 코드를 메서드 두가지 유형으로 작성해보자
// 1. 메소드의 반환값이 있는 경우
// 2. 메소드의 반환값이 없는 경우
// 3. 메소드의
import java.util.Scanner;

public class Example00 {
    public static void method(int num) {
        if (num%2==0) System.out.println("짝수입니다.");
        else System.out.println("홀수입니다.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("정수를 입력하세요. 0을 넣으면 종료됩니다.");

        while (true){
            num = in.nextInt();

            if (num==0){
                System.out.println("프로그램 종료");
                break;
            }
            method(num);
        }
    }
}
