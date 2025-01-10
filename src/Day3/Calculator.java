package Day3; // 패키지 이름을 정의합니다. Java에서는 클래스들을 논리적으로 묶기 위해 패키지를 사용합니다.

import java.util.Scanner; // 사용자로부터 데이터를 입력받기 위해 Scanner 클래스를 가져옵니다.

public class Calculator { // Calculator라는 클래스의 시작입니다.

    // 요구사항
    // 1. 두 개의 정수와 연산자(+,-,*,/)를 입력받아서 결과를 계산하고 출력합니다.
    // 2. "exit" 문자가 입력되기 전까지 계산을 반복합니다.

    public static void main(String[] args) {
        // 프로그램이 시작되는 메인 메소드입니다.
        calculator(); // calculator() 메소드를 호출하여 프로그램을 시작합니다.
    }

    static void adder(int num1, int num2) {
        // 두 숫자를 더하는 메소드입니다.
        int result = num1 + num2; // 두 숫자를 더한 결과를 저장합니다.
        System.out.printf("결과 : %d + %d = %d", num1, num2, result);
        // 결과를 형식에 맞게 출력합니다.
    }

    static void minus(int num1, int num2) {
        // 두 숫자를 빼는 메소드입니다.
        int result = num1 - num2; // 두 숫자의 차를 저장합니다.
        System.out.printf("결과 : %d - %d = %d", num1, num2, result);
        // 결과를 형식에 맞게 출력합니다.
    }

    static void multiply(int num1, int num2) {
        // 두 숫자를 곱하는 메소드입니다.
        int result = num1 * num2; // 두 숫자를 곱한 결과를 저장합니다.
        System.out.printf("결과 : %d * %d = %d", num1, num2, result);
        // 결과를 형식에 맞게 출력합니다.
    }

    static void div(int num1, int num2) {
        // 두 숫자를 나누는 메소드입니다.
        if (num2 == 0) {
            // 만약 두 번째 숫자가 0이라면 나눗셈은 불가능합니다.
            System.out.println("0으로 나눌 수 없습니다. ");
        } else {
            double result = (double) num1 / num2;
            // 두 숫자를 나눕니다. 결과는 소수점 포함 가능하도록 double로 변환합니다.
            System.out.printf("결과 : %d / %d = %.1f", num1, num2, result);
            // 결과를 형식에 맞게 출력합니다.
        }
    }

    static void calculator() {
        // 계산기 프로그램의 주요 동작을 담당하는 메소드입니다.
        Scanner input = new Scanner(System.in);
        // 사용자 입력을 받기 위해 Scanner 객체를 생성합니다.

        System.out.println("========계산기 프로그램=========");
        // 프로그램의 시작을 알리는 메시지를 출력합니다.

        // 아래 메시지는 사용자에게 입력 방법을 안내합니다.
        System.out.print("숫자, 연산자(+,-,*,/ 중), 숫자 순서대로 입력해 주세요: ");

        int num1 = input.nextInt(); // 첫 번째 숫자를 입력받습니다.
        char operator = input.nextLine().charAt(0);
        // 연산자를 입력받습니다. 연산자는 문자 하나이므로 첫 번째 문자를 가져옵니다.
        int num2 = input.nextInt(); // 두 번째 숫자를 입력받습니다.

        // 입력받은 연산자에 따라 해당 메소드를 호출하여 연산을 수행합니다.
        if (operator == '+') {
            adder(num1, num2); // 덧셈 메소드 호출
        } else if (operator == '-') {
            minus(num1, num2); // 뺄셈 메소드 호출
        } else if (operator == '*') {
            multiply(num1, num2); // 곱셈 메소드 호출
        } else if (operator == '/') {
            div(num1, num2); // 나눗셈 메소드 호출
        } else {
            // 연산자가 사칙연산에 포함되지 않으면 메시지를 출력합니다.
            System.out.println("잘못된 연산자를 입력하셨습니다.");
        }

        input.close(); // Scanner 객체를 닫아줍니다. 자원을 정리하기 위함입니다.
    }
}