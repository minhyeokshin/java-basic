package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JungolPrac {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in))   ;

        System.out.println("당신의 나이는 몇살입니까?");

        String str = br.readLine();
        int num = Integer.parseInt(str);

        System.out.printf("당신의 나이는 %d살이군요.",num);
    }
}
