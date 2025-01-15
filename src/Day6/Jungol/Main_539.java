package Day6.Jungol;

import java.util.Scanner;

public class Main_539 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //평균값 연산을 위한 수의 개수를 세어야 한다.
        int count = 0;
        //입력되 수의 합계 저장
        int total = 0;
        //평균
        double avg = 0.0;

        while (true){
            int num = in.nextInt(); // 100이상의 수가 나오기 전까지의 입력된 수를 저장
            count++; // count = count + 1
            total += num; // total = total + num;
            if(num>100) break;
        }
        avg = (double) total / count;
        System.out.printf("%d%n %.1f",total,avg);  // 소수2째자리에서 반올림한 후, 소수 첫째자리까지 출력
    }
}
