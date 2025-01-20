package Day9;

import java.util.Scanner;

public class Example05 {
    public static void cal(Double x){
        double result = x * 2 * Math.PI;
        System.out.printf("2 * %.2f * %.2f = %f%n",Math.PI,x,result);
        System.out.printf("원의 둘레는 %f입니다.",result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("원의 둘레 구하는 공식 : 2 * PI * 반지름");
        System.out.printf("반지름을 입력하세요. ");
        Double x = in.nextDouble();
        cal(x);

    }
}
