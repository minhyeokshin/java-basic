package Day6.Jungol;

import java.util.Scanner;

public class Main_139_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);

        if (9 >= num1 && num1 >= 2 && 9 >= num2 && num2 >= 2) {

            if(num1>num2) {
                for (int i = 1; i <= 9; i++) {
                    for (int j = max; j >= min; j--) {
                        System.out.printf("%d * %d = %2d   ", j, i, i * j);
                    }
                    System.out.println();
                }
            }
            if(num2>num1) {
                for (int i = 1; i <= 9; i++) {
                    for (int j = min; j <= max; j++) {
                        System.out.printf("%d * %d = %2d   ", j, i, i * j);
                    }
                    System.out.println();
                }

            }
            if (num1==num2){
                for (int i = 1; i <= 9; i++) {
                    for (int j = min; j <= max; j++) {
                        System.out.printf("%d * %d = %2d   ", j, i, i * j);
                    }
                    System.out.println();
                }

            }

        }

    }

}


