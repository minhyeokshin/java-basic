package Day8.ioEx;

public class MultiArrayEx {
    public static void main(String[] args) {
        // 정수형 2차원 배열 생성
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };
        //배열의 길이 1차원 배열의 길이(반의 수)
        int sum = 0;
        int count = 0;

//        System.out.println(scores.length + "scores[0]" + "scores[1]");
//        System.out.println(scores[1][1]);
//
//        for (int ban = 0; ban < scores.length; ban++) {
//            for (int student = 0; student < scores[ban].length; student++) { // 해당 반의 학생 수 만큼 반복
//                System.out.println(scores[ban][student]); // 전체 scores 점수 출력
//            }
//            //for-each문을 이용하여 2반의 학생들의 점수 합산하고 평균을 구하여 출력하세요(평균은 소수점 첫째자리까지)
//        }
             for(int num : scores[1]){
                 sum += num;
             }
             System.out.printf("총합 : %d%n",sum);
             double avg = (double) sum / scores.length;
             System.out.printf("평균 : %.1f",avg);

        }

    }