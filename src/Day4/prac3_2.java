package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문제
한 개의 정수를 입력 받아서 후치증가 연산자를 사용하여 출력한 후 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.

입력
5

출력
5
7
 */
public class prac3_2 {
    public static void main(String[] args) throws IOException
    {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // 입력
        int num = Integer.parseInt(str); // 정수 변환


        System.out.println(num++); // num 출력
        System.out.println(++num);
    }
}
