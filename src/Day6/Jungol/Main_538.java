package Day6.Jungol;

import java.util.Scanner;

public class Main_538 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.printf("number? ");
            int num = in.nextInt();

            if (num==0){
                break;
            }
            else if (num>0){
                System.out.println("positive integer");
            }else {
                System.out.println("negative number");
            }
        }

    }
}
