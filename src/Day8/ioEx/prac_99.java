package Day8.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac_99 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int[] scores = {1, 2, 3, 4, 5};
        int num = 0;
        int student = 0;
        int sum = 0;
        int max = scores[0];
        int i = 0;


        while (true){

            System.out.println("----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------");
            num = Integer.parseInt(br.readLine());

            if (num == 5){
                System.out.println("선택> 5");
                System.out.println("프로그램 종료");
                break;}
            if(num==1){
                System.out.println("선택> 1");
                System.out.printf("학생수> ");
                student = Integer.parseInt(br.readLine());

            } else if (num==2) {
                System.out.println("선택> 2");

                for (int j = 0;j<student;j++) {
                    System.out.printf("scores[%d]> ", j);
                    scores[j] = Integer.parseInt(br.readLine());
                    sum += scores[j];
                } continue;


            } else if (num==3) {
                System.out.println("선택> 3");
                for (int k = 0; k < student; k++) {
                    System.out.printf("scores[%d]: %d%n", k, scores[k]);
                }
                continue;

            } else if (num==4) {
                System.out.println("선택> 4");
                for (i = 1; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                }
                System.out.printf("최고 점수 : %d%n",max);

                double avg = (double) sum / student;
                System.out.printf("평균 점수 : %.1f%n",avg);
            }

        }
    }
}
