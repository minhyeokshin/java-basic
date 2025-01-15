package Day6.Jungol;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Main_545 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int Multiples3 = 0;
        int Multiples5 = 0;
        int count = 0;

        while(count < 10) {
            num = in.nextInt();
            count++;

            if(num%3==0){
                Multiples3++;
            }
            if(num%5==0){
                Multiples5++;
            }

        }

        System.out.println("Multiples of 3 : " + Multiples3);
        System.out.println("Multiples of 5 : " + Multiples5);

    }
}

