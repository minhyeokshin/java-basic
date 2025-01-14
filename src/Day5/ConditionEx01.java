package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionEx01 {
    public static void main(String[] args) throws IOException

    {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        boolean rainStatus = false;
        //rainStatus = true;

        if(rainStatus==true){
            System.out.println("우산을 챙기세요");
        }else{
            System.out.println("우산을 집에 두고가세요");
        }

        System.out.println("숫자를 입력하세요.");

        String str = br.readLine();
        int num = Integer.parseInt(str);

        if (num>15){
            System.out.println("숫자가 15보다 큽니다.");
        }
        System.out.println("이 문장은 if문 외부에 있습니다.");
    }
}
