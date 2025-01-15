package Day6.Jungol;

import java.util.Scanner;

public class Main_544 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int i = 0;
        int sum = 0;

        if (n<=100){
            for (i=n;i<=100;i++){
                sum += i;
                }
            System.out.println(sum);
            }
        }
    }

