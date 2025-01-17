package Day8.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac_9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int[] scores = new int[3];
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
                System.out.printf("scores[0]> ");
                scores[0] = Integer.parseInt(br.readLine());
                sum += scores[0];
                System.out.printf("scores[1]> ");
                scores[1] = Integer.parseInt(br.readLine());
                sum += scores[1];
                System.out.printf("scores[2]> ");
                scores[2] = Integer.parseInt(br.readLine());
                sum += scores[2];
            } else if (num==3) {
                System.out.println("선택> 3");
                System.out.printf("scores[0]: %d%n",scores[0]);
                System.out.printf("scores[1]: %d%n",scores[1]);
                System.out.printf("scores[2]: %d%n",scores[2]);
            }else if (num==4) {
                System.out.println("선택> 4");
                for (i = 1; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                }
                System.out.printf("최고 점수 : %d%n",max);
                double avg = (double) sum / scores.length;
                System.out.printf("평균 점수 : %.1f%n",avg);
            }





        }
    }
}
