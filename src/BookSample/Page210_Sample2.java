package BookSample;

import java.util.Scanner;

public class Page210_Sample2 {
    public static void main(String[] args) {
        System.out.println("시험 응시자 수를 입력하시오.");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int [] test = new int[num];

        System.out.println("시험 응시자 수만큼 점수를 입력하시오.");
        for (int i = 0;i<num;i++){
            int tmp = in.nextInt();
            test[i] = tmp;
        }
        for (int i = 0;i<num;i++){
            System.out.println((i+1) + "번째 사람의 점수는 " +
                    test[i] + "점 입니다.");
        }
    }
}
