package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("점수를 입력하세요.");
        String str = br.readLine();
        int grade = Integer.parseInt(str);

        if (100 >= grade && grade >=90){
            System.out.println("A학점");
        } else if (89 >= grade && grade >=80) {
            System.out.println("B학점");
        }else if (79 >= grade && grade >=70) {
            System.out.println("C학점");
        }else if (69 >= grade && grade >=60) {
            System.out.println("D학점");
        }else{
            System.out.println("F학점");
        }
    }
}
