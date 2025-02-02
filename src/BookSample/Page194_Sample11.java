package BookSample;

import java.util.Scanner;

public class Page194_Sample11 {
    public static void main(String[] args) {
        System.out.println("몇 번쨰 처리를 건너뛰시겠습니까?(1~10)");
        Scanner in = new Scanner(System.in);

        int res = in.nextInt();

        for (int i = 1;i<=10;i++){
            if (i == res)
                continue;
            System.out.println(i + "번째 처리입니다.");
        }
    }
}
