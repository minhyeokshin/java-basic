package Day6.Jungol;

import java.util.Scanner;

public class Main_135 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = 0;
        int count = 0;
        double avg = 0;
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
                sum += i;
            }
        }
                System.out.printf("sum : %d%n", sum);
                avg = (double) sum / count;
                System.out.printf("avg : %.1f", avg);}
        }
