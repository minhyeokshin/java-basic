package BookSample;

import java.util.Scanner;

public class Page169_Prac2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력하십시오.");
        int num = in.nextInt();

        if (num%2!=0){
            System.out.printf("%d는 홀수입니다.%n",num);
        }else {
            System.out.printf("%d는 짝수입니다.%n",num);
        }
    }
}
