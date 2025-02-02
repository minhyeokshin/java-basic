package BookSample;

import java.util.Scanner;

public class Page177_Sample4 {
    public static void main(String[] args) {
        System.out.println("숫자 몇까지의 합을 구하시겠습니까?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1;i<=num;i++){
            sum += i;
        }
        System.out.println("숫자의 합은 " + sum + "입니다.");
    }
}
