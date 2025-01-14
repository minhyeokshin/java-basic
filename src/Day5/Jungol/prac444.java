package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac444 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int end = Integer.parseInt(str);

        for (int i = 1; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        int i = 0;
        do{
            System.out.println("Hello World");
            i++;
        }

        while(i<6);


        String str2 = br.readLine();
        int x = Integer.parseInt(str2);

        int sum = 0;

        do {

            sum += x;
            x--;
        }
        while (x>=10);
        System.out.println("합계 : " + sum);
    }
}
