package Day6.Jungol;

import java.util.Scanner;

public class Main_540 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0; // 3의 배수일 경우 3으로 나눈 몫을 저장

        while (true){
            int num = in.nextInt();

            result = (num/3);

            if(num == -1){
                break;
            }if(num % 3 ==0){
                System.out.println(result);
            }
        }
    }
}
