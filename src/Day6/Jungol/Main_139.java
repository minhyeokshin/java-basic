package Day6.Jungol;

import java.util.Scanner;

public class Main_139 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (9 >= num1 && num1 >= 2 && 9 >= num2 && num2 >= 2) {

            if (num1 > num2) {
                for (int i = num1; i >= num2; i--) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.printf("%d * %d = %2d   ",i,j,i*j);
                    }
                    System.out.println();
                }
            } else {
                for (int i = num2; i >= num1; i--) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.printf("%d * %d = %2d   ",i,j,i*j);
                    }
                    System.out.println();
                }

            }
        }
    }
}
