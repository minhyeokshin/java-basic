import java.util.Scanner;

public class Main_551 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // 각 줄에 대해 출력
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

    }
}