package Day6.Jungol;

import java.util.Scanner;

public class Main_131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                System.out.printf("%d ", i);
            }
        } else {
            for (int i = num1; i <= num2; i++) {
                System.out.printf("%d ", i);
            }

        }
    }
}