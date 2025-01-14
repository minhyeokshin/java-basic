package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("1. 삽입%n2. 수정%n3. 삭제%n숫자를 선택하세요. ");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        if (num==1){
            System.out.println("삽입을 선택하셨습니다.");
        } else if (num==2) {
            System.out.println("수정을 선택하셨습니다.");
        }else {
            System.out.println("삭제를 선택하셨습니다.");
        }
    }
}
