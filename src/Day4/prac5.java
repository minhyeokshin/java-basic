package Day4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] numbers = input.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a == b) {
            System.out.printf("1 ");
        } else {
            System.out.printf("0 ");
        }

        if (b == c) {
            System.out.printf("1 ");
        } else {
            System.out.printf("0 ");
        }

        if (a != b) {
            System.out.printf("1 ");
        } else {
            System.out.printf("0 ");
        }

        if (b != c) {
            System.out.printf("1 ");
        } else {
            System.out.printf("0 ");
        }

    }

}
