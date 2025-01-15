package Day6.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_539_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        // 평균값 연산을 위한 수의 개수를 세어야 한다.
        int count = 0;
        // 입력된 수의 합계를 저장
        int total = 0;
        // 평균
        double avg = 0.0;

        while (true) {
            String str = br.readLine(); // 공백으로 구분된 숫자 입력받기
            String[] numbers = str.split(" "); // 입력을 공백 기준으로 나누기

            for (String numStr : numbers) {
                int num = Integer.parseInt(numStr.trim()); // 숫자로 변환

                count++; // 숫자 개수 증가
                total += num; // 합계 계산

                if (num > 100) { // 100 초과 숫자가 나오면 종료
                    avg = (double) total / count; // 평균 계산
                    System.out.printf("%d%n%.1f", total, avg); // 결과 출력
                    return; // 프로그램 종료
                }
            }
        }
    }
}