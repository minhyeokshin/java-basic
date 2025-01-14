package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        System.out.println(num);
        if(num>10){
            System.out.println("10보다 큰 수를 입력하셨습니다.");
        }

    }
}
