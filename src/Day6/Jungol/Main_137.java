package Day6.Jungol;

import java.util.Scanner;

public class Main_137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for(int i = 1;i<=num1;i++){
            for(int j = 1;j<=num2;j++){
                System.out.printf("%d ",i*j);
            }
            System.out.println();
        }
    }
}
