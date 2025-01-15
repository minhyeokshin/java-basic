package Day6.Jungol;

import java.util.Scanner;

public class Main_9055 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum = 0;
        int i = 0;

        while (true){
            if (sum>num){
                break;}

            i++;
            sum += i;
        }
        System.out.printf("%d %d",i,sum);

    }
}
