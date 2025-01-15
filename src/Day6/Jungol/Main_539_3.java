package Day6.Jungol;

import java.util.Scanner;

/*
문제
정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 첫째자리까지 출력한다.)
 */
public class Main_539_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        double avg = 0.0;
        int count = 0;

        while (true) {
            num = in.nextInt();
            sum += num;
            count++;

            if (num >= 100) {
                break;
            }
        }


        avg = (double) sum / (double) count;
        System.out.println(sum);
        System.out.printf("%.1f",avg);

    }
}

