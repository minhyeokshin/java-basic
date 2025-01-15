package Day6.Jungol;

import java.util.Scanner;

public class Main_633 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        while (true){
            System.out.printf("1. Korea%n2. USA%n3. Japan%n4. China%nnumber? ");
            int num = in.nextInt();
            System.out.println();


            if(num == 1){
                System.out.println("Seoul");
                System.out.println();
            } else if (num == 2) {
                System.out.println("Washington");
                System.out.println();
            } else if (num == 3) {
                System.out.println("Tokyo");
                System.out.println();
            } else if (num == 4) {
                System.out.println("Beijing");
                System.out.println();
            } else {
                System.out.println("none");
                break;
            }

        }
    }
}
