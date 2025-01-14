package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("두 개의 수를 입력하시오. ");

        String input = br.readLine();
        String[] numbers = input.split(" ");


        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
        System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
        System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
        System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
        System.out.println(num1 + " % " + num2 + " = " + num1%num2);


    }
}