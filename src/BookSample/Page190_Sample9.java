package BookSample;

import java.util.Scanner;

public class Page190_Sample9 {
    public static void main(String[] args) {
        System.out.println("몇 번째에서 루프를 빠져나가시겠습니까?(1~10)");

        Scanner in = new Scanner(System.in);
        int res = in.nextInt();

        for (int i =1 ; i<10;i++){
            System.out.println(i + "번째 처리입니다.");
            if (i == res)
                break;;
        }
    }
}
