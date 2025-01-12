package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Page131_2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("과목 1~5의 점수를 점수로 입력하십시오.");

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);
        int num4 = Integer.parseInt(str4);
        int num5 = Integer.parseInt(str5);

        int sum = 0;
        sum = num1 + num2;
        sum += num3;
        sum += num4;
        sum += num5;

        double avg = (double) sum;

        System.out.printf("5과목의 합계는 %d점입니다.%n",sum);
        System.out.printf("5과목의 평균은 %.1f점입니다.",avg/5);
    }
}
