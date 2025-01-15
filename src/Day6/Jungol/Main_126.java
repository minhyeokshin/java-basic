package Day6.Jungol;

import java.util.Scanner;

public class Main_126 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int odd = 0;
        int even = 0;
        int num = 0;

        while (true){
            num = in.nextInt();

            if (num == 0){
                System.out.println("odd : " + odd);
                System.out.println("even : " + even);
            }
            else if(num%2 == 0){
                even++;
            } else if (num%2 != 0) {
                odd++;

            }
        }
    }
}
