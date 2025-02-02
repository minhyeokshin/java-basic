package BookSample;

import java.util.Scanner;

public class Page176_Sample3 {
    public static void main(String[] args) {
        System.out.println("몇 개의 *를 출력하시겠습니까?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1 ; i<=num ; i++){
            System.out.printf("*");
        }
    }
}
