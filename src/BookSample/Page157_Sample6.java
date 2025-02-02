package BookSample;

import java.util.Scanner;

public class Page157_Sample6 {
    public static void main(String[] args) {
        System.out.println("a또는 b를 입력하십시오.");
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char res = str.charAt(0);

        switch (res){
            case 'a':
                System.out.println("a가 입력되었습니다.");
                break;
            case 'b':
                System.out.println("b가 입력되었습니다.");
                break;
            default:
                System.out.println("a혹은 b를 입력하십시오.");
                break;
        }
    }
}
