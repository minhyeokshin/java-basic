package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac5 {
    public static void main(String[] args) throws IOException {


        BufferedReader br=
                new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("주사위를 두 번 던진 결과를 입력하세요. ");

        String input = br.readLine();
        String[] numbers = input.split(" ");

        int x = Integer.parseInt(numbers[0]);
        int y = Integer.parseInt(numbers[1]);

        if (x>=4 || y>=4){
            if (x>=4 && y>=4){
                System.out.println("이겼습니다.");
            }else {
                System.out.println("비겼습니다.");
            }
        }else {
            System.out.println("졌습니다.");
        }
    }
}
