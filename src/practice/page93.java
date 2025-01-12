package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page93 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("당신은 몇 살입니까?");

        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.printf("당신은 %d살입니다.%n",num);

        System.out.println("원주율의 값은 얼마입니까?");

        String str2 = br.readLine();
        double num2 = Double.parseDouble(str2);
        System.out.printf("원주율의 값은 %.2f입니다.%n",num2);

        System.out.println("키와 몸무게를 입력하십시오.%n");

        String str3 = br.readLine();
        String str4 = br.readLine();
        double num3 = Double.parseDouble(str3);
        double num4 = Double.parseDouble(str4);

        System.out.printf("키는 %.1f센티미터입니다.%n",num3);
        System.out.printf("몸무게는 %.1f킬로그램입니다.",num4);
    }
}
