package Day8.ioEx;

import java.io.*;

public class prac_999 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int[] scores = {1, 2, 3, 4, 5};
        int num = 0;
        int student = 0;
        int sum = 0;
        int max = scores[0];
        int i = 0;


        while (true){

            bw.write("----------------------------------------------\n");
            bw.write("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료\n");
            bw.write("----------------------------------------------\n");
            bw.flush();
            num = Integer.parseInt(br.readLine());

            if (num == 5){
                bw.write("선택> 5\n");
                bw.write("프로그램 종료\n");
                bw.flush();
                break;}
            if(num==1){
                bw.write("선택> 1\n");
                bw.write("학생수> ");
                bw.flush();
                student = Integer.parseInt(br.readLine());

            } else if (num==2) {
                bw.write("선택> 2\n");

                for (int j = 0;j<student;j++) {
                    bw.write(String.format("scores[%d]> ", j));
                    bw.flush();
                    scores[j] = Integer.parseInt(br.readLine());
                    sum += scores[j];
                } continue;


            } else if (num==3) {
                bw.write("선택> 3\n");

                for (int k = 0; k < student; k++) {
                    bw.write(String.format("scores[%d]: %d\n", k,scores[k]));
                    bw.flush();
                }
                continue;

            } else if (num==4) {
                bw.write("선택> 4\n");
                bw.flush();
                for (i = 1; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                }
                bw.write(String.format("최고 점수 : %d\n",max));
                double avg = (double) sum / student;
                bw.write(String.format("평균 점수 : %.1f\n ",avg));
                bw.flush();

            }

        }
    }
}
