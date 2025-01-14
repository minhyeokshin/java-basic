package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=
                new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("세 수를 입력하세요. ");

        String input = br.readLine();
        String[] numbers = input.split(" ");

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);
        int num3 = Integer.parseInt(numbers[2]);

        if (num1>num2 && num1>num3){
            System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.%n",num1);
        } else if (num2>num3) {
            System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.%n",num2);
        }else {
            System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.",num3);
        }
    }
}
