package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("점수를 입력하세요. ");
        String str = br.readLine();
        int score = Integer.parseInt(str);

        if (score>=80){
            System.out.println("축하합니다. 합격입니다.");
        }else {
            System.out.println("죄송합니다. 불합격입니다.");
        }
    }
}
