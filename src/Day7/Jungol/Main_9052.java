package Day7.Jungol;

import java.util.Scanner;

public class Main_9052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score = 0;
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        for (int i = 1;i<=5;i++) {

            score = in.nextInt();
            count++;
            sum += score;
        }
        avg = (double) sum / count;
        /*
        총점 : 429
평균 : 85.8
         */
        System.out.printf("총점 : %d%n",sum);
        System.out.printf("평균 : %.1f",avg);

    }
}
