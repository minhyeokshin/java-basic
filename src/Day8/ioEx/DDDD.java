package Day8.ioEx;
//주어진 배열 항목의 전체 합과 평균을 출력하는 코드

public class DDDD {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        for(int num : array[0]){
            sum += num;
        }
        for(int num : array[1]) {
            sum += num;
        }
        for(int num : array[2]) {
            sum += num;
        }
        int a = array[0].length + array[1].length + array[2].length;
        double avg = (double)sum / a;
        System.out.printf("총합 : %d%n",sum);
        System.out.printf("평균 : %.1f",avg);
    }
    }
