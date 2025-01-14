package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] numbers = input.split(" ");

        int num1 = Integer.parseInt(numbers[0]);

        if (num1 == 1 || num1 == 3 ||num1 == 5 || num1 == 7 ||num1 == 8 ||num1 == 10 ||num1 == 12){
            System.out.println("31");
        }else if (num1 == 2){
            System.out.println("28");
        }else {
            System.out.println("30");
        }

    }
}
