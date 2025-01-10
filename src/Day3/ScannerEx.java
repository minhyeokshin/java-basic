package Day3;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("x의 값 입력");
        String strx = input.nextLine();
        //strx 변수값을  숫자값으로 변경하여 int x에 저장하세요.
        int x = Integer.parseInt(strx);

        System.out.println("y의 값 입력");
        String stry = input.nextLine();
        int y = Integer.parseInt(stry);


        //문자열은 연산이 되지 않기 때문에 알맞은 타입으로 캐스팅기능을 제공하는 각 래퍼클래스를 활용하여 변경

        while(true){ // while문을 무한히 반복실행 한다.
            System.out.println("입력기능을 종료하고 싶으면 \"quit\"를 입력하세요!");
            System.out.println("입력 문자열: ");
            String data = input.nextLine();
            if(data.equals("quit")){
                break;     //"quit" 문자열이 입력되었다면, while문을 종료하세요
            }

            System.out.println("입력된 문자열 출력 :" + data);
        }
        System.out.println("프로그램 종료");
    }

}
