package Day6.Jungol;

import java.util.Scanner;

public class Main_133 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int score = 0;
        double avg = 0.0;
        int sum = 0;

        for (int i = 1;i<=count;i++){
            score = in.nextInt();
            sum += score;
        }
        avg = (double)sum / count;

        System.out.printf("%.2f",avg);
    }
}
