package Day6.Jungol;

import java.util.Scanner;

/*0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
 */
public class Main_128 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        int count = 0;

        while (true) {
            num = in.nextInt();


            if (num % 3 != 0 && num % 5 != 0) {
                count++;
            }

            if (num == 0) {
                break;
            }
        }
        System.out.println(count);

    }
}