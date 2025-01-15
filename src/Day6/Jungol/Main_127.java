package Day6.Jungol;

import java.util.Scanner;

/*0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 
그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 첫째자리까지 출력한다.)
 */
public class Main_127 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        double avg = 0.0;
        int count = 0;

        while (true) {
            num = in.nextInt();

            if (num > 100 || num < 0) {
                break;
            } else {
                count++;
                sum += num;
            }
        }

        avg = (double)sum / (double)count;
        System.out.printf("sum : %d%n",sum);
        System.out.printf("avg : %.1f",avg);
        }


    }
