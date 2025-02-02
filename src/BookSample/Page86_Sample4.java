package BookSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Page86_Sample4 {
    public static void main(String[] args) throws IOException {
        System.out.println("문자열을 입력하십시오.");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(str + "이 입력되었습니다.");
    }
}
