package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException
    {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] numbers = input.split(" ");


        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        --b;
        int c = a * b;
        a++;



        System.out.printf("%d,  %d,  %d",a,b,c);
    }
}
