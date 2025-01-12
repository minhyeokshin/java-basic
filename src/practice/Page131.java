package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Page131 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("삼각형의 밑변과 높이를 입력하십시오.");

        String str1 = br.readLine();
        String str2 = br.readLine();

        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        System.out.printf("삼각형의 넓이는 %f입니다.",num1*num2/2);
    }
}
