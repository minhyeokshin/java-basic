package Day6.Jungol;

import java.util.Scanner;

public class Main_549 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum = 0;
        int count = 0;
        int i = 0;

        while (true) {
            if (sum >= num) {
                break;
            }
            i++;

            if (i % 2 != 0) {
                count++;
                sum += i;
            }
        }

        System.out.printf("%d %d", count, sum);
    }
}


