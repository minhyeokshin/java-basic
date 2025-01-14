package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditonEx2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("메뉴를 번호(1~2)로 고르세요. 1. 중식 2. 양식");
        String str = br.readLine();
        int menu = Integer.parseInt(str);

        if (menu==1){
            System.out.println("짜장면 맛있게 드세요");
        } else if (menu==2) {
            System.out.println("파스타 맛있게 드세요.");

        }else{
            System.out.println("비빔밥 맛있게 드세요.");
        }

    }
}
