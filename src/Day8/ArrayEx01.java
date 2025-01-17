//package Day8;
//
//import java.util.Scanner;
//
//// 변수는 하나의 값만 저장한다. 저장해야 할 값들이 늘어난 만큼 변수도 늘어나야 한다.
//// 많은 양의 값을 좀 더 효율적으로 관리, 운영할수없을까? 배열
//// 배열은 연속된(index,방번호) 공간에 값을 나열시킨다.
////배열은 연속된 공간에 값을 나열시키고, 각 값에 인덱스를 부여한 자료구조이다.
//// 학생 30명의 성적을 저장하고 평균을 구하는 프로그램
//public class ArrayEx01 {
//    public static void main(String[] args) {
//
//       int sum = 0;
//       int[] scores;
////       scores = new int[10];
////       scores[0] = 90;
////        scores[1] = 90;
////        scores[2] = 90;
////        scores[3] = 90;
////        scores[4] = 90;
////        scores[5] = 90;
//
//        Scanner in = new Scanner(System.in);
//       //int[] scores = new int[10]; //   정수형 배열은 선언, 생성, 초기화
//       for(int i = 1;i<10;i++){
//           System.out.printf("%d 번쨰 학생의 성적을 입력해주세요.%n",i);
//           int score = in.nextInt();
//           sum += score;
//
//           if(i == 9){
//               System.out.println("성적입력 완료");
//           }
//       }
//       double avg = (double)sum / scores.length;
//
//        System.out.printf("10명 학생의 총합 : %d , 평균 : %.1f",sum,avg);
//
//        //1. 정수형 배열 arr을 선언하시오.
//        int[] arr = new int[5];
//        // 배열은 생성할때 . 몇개의 데이터를 저장해야 하는지 정해주어야한다. 고정길이 자료구조
//
//    }
//}
