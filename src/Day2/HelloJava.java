package Day2;

import java.util.Scanner;

/*
1."Hello Java"문자열을 출력하는 HelloJava 클래스를 작성하세요.
2."Hello Java"를 출력한 후 사용자에게 일므을 입력받아 "Hello 000"출력하세요
 */
public class HelloJava {
    public static void main(String[] args) {

        System.out.println("Hello Java"); // Hello Java = Parameter
        System.out.println("당신의 이름을 입력해 주세요.");
        Scanner input = new Scanner(System.in);
        /*Scanner Class는 Command+Enter로 입력
        input = instance veriable
        System.in -> Keyboard에서 입력된 Data
         */
        String name = input.nextLine();

        System.out.println("당신의 이름은 " + name);
        callName();
        callName();
        callName();
        callName();
    }

    public static void callName(){
        System.out.println("내이름을 불러줘");
    }
}
