package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] numbers = input.split(" ");

        int x = Integer.parseInt(numbers[0]);
        int y = Integer.parseInt(numbers[1]);

        if (x > y){
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.%n",x,y);
        }else {
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.%n",y,x);
        }

    }
}
