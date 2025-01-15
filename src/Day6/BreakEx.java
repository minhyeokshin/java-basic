package Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakEx {

    // 주사위 6개의 면에는 1~6까지의 숫자가 있다. 1~5까지의 숫자가 나오면 계속 주사위를 던지고, 6이 나오면 게임을 종료
    // 플레이 할 때 주사위의 숫자는 예측할 수 없다.
    // 현재 num=6이면 종료되는 코드를, 사용자가 Exit 입력했을때 종료되는 코드로 바꿔주세요!

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String enter;
        System.out.println("------------------------------------------");
        System.out.println("-----------------주사위 게임-----------------");
        System.out.println("------------------------------------------");
        System.out.println("----프로그램을 종료하려면 \"exit\"를 입력하세요.----");
        System.out.println("------------------------------------------");

        while (true){
            int num = (int)(Math.random()*6)+1; // Math.random() 메소드는 0.0~1에 무한히 가까운 수를 제공
            System.out.printf("%d ",num);
            enter = br.readLine();
            if(enter.equals("exit")) {
                System.out.println("주사위 게임을 종료합니다.");
                break;
            }
        }
        System.out.printf("프로그램 종료");
    }
}
