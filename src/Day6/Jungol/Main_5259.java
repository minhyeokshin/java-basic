package Day6.Jungol;

import java.util.Scanner;

public class Main_5259 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;

        while (true) {
            str = in.nextLine();

            if (str.equals("A")) {
                System.out.println("Perfect!");
            } else if (str.equals("B")) {
                System.out.println("Good!");
            } else if (str.equals("C")) {
                System.out.println("Bad");
            } else {
                System.out.println("What?");
                break;
            }

        }
    }
}
