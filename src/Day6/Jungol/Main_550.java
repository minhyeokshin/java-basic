package Day6.Jungol;

import java.util.Scanner;

public class Main_550 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int ii = num; ii >= 1; ii--) {
            for (int jj = 1; jj <= num; ++jj) {
                System.out.printf("*");
            }
            System.out.println();

            /*
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            }


             */

        }
    }
}
