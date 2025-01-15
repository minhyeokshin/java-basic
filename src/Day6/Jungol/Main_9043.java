package Day6.Jungol;

import java.util.Scanner;

public class Main_9043 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int avg = 0;
        int count = 0;

        while (true){
            num = in.nextInt();

            if(num == 0){
                break;}

            if (num%2!=0){
                sum += num;
                count++;
            }
        }
        avg = sum / count;
        System.out.printf("홀수의 합 = %d%n",sum);
        System.out.printf("홀수의 평균 = %d",avg);


    }
}
