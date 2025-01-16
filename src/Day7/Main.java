package Day7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int num = 0;
        for(int i = 1;i<=10;i++) {
            num = in.nextInt();
            if(num%2==0) {
                count++;
            }
            }

        System.out.printf("입력받은 짝수는 %d개입니다.",count);

        }
}

