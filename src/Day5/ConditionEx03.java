package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionEx03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));


        System.out.println("숫자를 입력하세요");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        if (num==10){
            System.out.println("숫자가 10입니다.");
        } else if (num==15) {
            System.out.println("숫자가 15입니다.");
        } else if (num==20) {
            System.out.println("숫자가 20입니다.");
        }else {
            System.out.println("숫자가 존재하지 않습니다.");
        }


    }
}
