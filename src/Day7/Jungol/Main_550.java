package Day7.Jungol;
import java.util.Scanner;

public class Main_550 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // 위쪽 삼각형 출력
        for (int i = n; i >= 1; i--) { // n부터 1까지
            for (int j = 1; j <= i; j++) { // i개의 별 출력
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        // 아래쪽 삼각형 출력
        for (int i = 1; i <= n; i++) { // 1부터 n까지
            for (int j = 1; j <= i; j++) { // i개의 별 출력
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        scanner.close();
    }
}