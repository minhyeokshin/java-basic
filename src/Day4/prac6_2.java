package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac6_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] numbers = input.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if (a > b) {
            System.out.printf("%d > %d --- 1",a,b);
        } else {
            System.out.printf("%d > %d --- 1",a,b);
        }

    }
}
