package BookSample;

import java.util.Scanner;

public class Page197_prac2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("시험 점수를 입력하십시오.(0을 입력하면 종료)");
        int num = 0;
        int sum = 0;
        while (true){
            num = in.nextInt();
            sum += num;
            if (num == 0){
                System.out.printf("시험 점수의 함계는 %d점입니다.",sum);
                break;
            }
        }
    }
}
