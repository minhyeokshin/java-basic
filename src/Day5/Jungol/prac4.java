package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("점수를 입력하세요.");
        String str = br.readLine();
        int score = Integer.parseInt(str);

        if (score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {
            System.out.println("C");
        } else if (score>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
