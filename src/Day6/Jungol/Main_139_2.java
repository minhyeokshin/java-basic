package Day6.Jungol;
/*2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
구구단 사이의 공백은 3칸이다.

 */
import java.util.Scanner;

public class Main_139_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt(); // num1 값 입력
        int num2 = in.nextInt(); // num2 값 입력

        int max = Math.max(num1,num2);  // num1 , num2 큰값 찾기
        int min = Math.min(num1,num2);  // num1, num2 작은값 찾기

        if (9 >= num1 && num1 >= 2 && 9 >= num2 && num2 >= 2) {

            // num1이 클때
            if(num1>num2) {
                for (int i = 1; i <= 9; i++) {
                    for (int j = max; j >= min; j--) {
                        System.out.printf("%d * %d = %2d   ", j, i, i * j);}
                    System.out.println();}}

            // num2가 클떄
            if(num2>=num1) {
                for (int i = 1; i <= 9; i++) {
                    for (int j = min; j <= max; j++) {
                        System.out.printf("%d * %d = %2d   ", j, i, i * j);}
                    System.out.println();}}
        }
    }
}