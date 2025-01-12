package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JungolPrac {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in))   ;

        System.out.println("두 개의 실수를 입력하시오.");
        String str1 = br.readLine();
        double num1 = Double.parseDouble(str1);

        String str2 = br.readLine();
        double num2 = Double.parseDouble(str2);

        String str3 = br.readLine();
        double num3 = Double.parseDouble(str3);

        System.out.printf("%.3f%n",num1);
        System.out.printf("%.3f%n",num2);
        System.out.printf("%.3f%n",num3);
    }
}
