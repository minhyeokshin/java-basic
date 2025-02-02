package BookSample;

import java.util.Scanner;

public class Page162_Sample7 {
    public static void main(String[] args) {
        System.out.println("당신은 남성입니까?");
        System.out.println("Y 또는 N을 입력하십시오.");

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char res = str.charAt(0);

        if (res == 'Y' || res == 'y'){
            System.out.println("당신은 남성이군요.");
        } else if (res == 'N' || res == 'n') {
            System.out.println("당신은 여성이군요.");
        }
        else {
            System.out.println("Y또는 N을 입력하십시오.");
        }
    }
}
