package BookSample;

import java.util.Scanner;

public class Page170_Prac4 {
    public static void main(String[] args) {
        System.out.println("0에서 10까지의 수를 입력하십시오.");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num>=0 && num<=10){
            System.out.println("정답입니다.");
        }else {
            System.out.println("오답입니다.");
        }
    }
}
