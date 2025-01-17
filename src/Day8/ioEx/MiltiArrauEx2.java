//package Day8.ioEx;
//
//public class MultiArrauEx2 {
//    public static void main(String[] args) {
//        // 정수형 2차원 배열 생성
//        int[][] scores = {
//                {80, 90, 96},
//                {76, 88}
//        };
//        //배열의 길이 1차원 배열의 길이(반의 수)
//        int sum = 0;
//              //for-each문을 이용하여 2반의 학생들의 점수 합산하고 평균을 구하여 출력하세요(평균은 소수점 첫째자리까지)
//        for(int num : scores[1]){
//            sum += num;
//        }
//        System.out.printf("총합 : %d%n",sum);
//        double avg = (double) sum / scores.length;
//        System.out.printf("평균 : %.1f",avg);
//
//    }
//
//}