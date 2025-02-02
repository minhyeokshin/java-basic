package BookSample;

import java.util.Scanner;

public class Page169_Sample3 {
    public static void main(String[] args) {
        System.out.println("2개의 정수를 입력하십시오.");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1==num2){
            System.out.println("두 숫자는 같습니다.");
        } else if (num1>num2) {
            System.out.printf("%d보다 %d(이)가 큽니다.",num2,num1);
        }else {
            System.out.printf("%d보다 %d(이)가 큽니다.",num1,num2);
        }
    }
}
