package Day7.Jungol;

import java.util.Scanner;

public class Main_5262 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int Multi3 = 0;
        int Multi5 = 0;

        for(int i =1;i<=10;i++){
            num = in.nextInt();
            if (num%3==0){
                Multi3++;
            }
            if (num%5==0){
                Multi5++;
            }
        }
        System.out.printf("Multiples of 3 : %d%n",Multi3);
        System.out.printf("Multiples of 5 : %d%n",Multi5);
    }
}
