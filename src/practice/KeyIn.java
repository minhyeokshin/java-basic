package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyIn {
    public static void main(String[] args) throws IOException
    {
        System.out.println("문자열을 입력하세요.");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        //입력된 문자열을 가리키는 변수 str

        System.out.println(str + "(이)가 입력되었습니다.");

    }
}
