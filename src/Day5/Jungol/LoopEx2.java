package Day5.Jungol;

import java.util.Scanner;
//for문 작성 시 주의할 점: 초기화 식에서 부동소수점 float 타입을 사용하지 말아야한다.
//부동소수점 float타입은 연산 과정에서 정확히 0.1을 표현하지 못하기 때문에 증감식에서
//x에 더해지는 실제값은 0.1보다 약간 클 수 있다. 따라서 최종 반복횟수가 우리가 의도한 10번이 아닌 9번이 된다.
public class LoopEx2 {
    public static void main(String[] args) {
        int sum = 0; // 누적값 저장
        System.out.println("5개의 숫자를 입력");

        for (int n =1;n <= 5;n++){
            Scanner input = new Scanner(System.in);
            System.out.println(n + "번째 숫자를 입력해 주세요.");
            int num = input.nextInt();
            sum += num;
        }

        System.out.println("합계 ; " + sum);
    }
}
