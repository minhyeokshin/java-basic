package Day6.Jungol;

import java.util.Scanner;

/*삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고,
"Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고
 다른 문자이면 종료하는 프로그램을 작성하시오.
 (넓이는 반올림하여 소수 첫째자리까지 출력한다.)
 */
public class Main_129_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Base = 0;
        int Height = 0;
        double width = 0;
        String str;

        while (true){
            Base = in.nextInt();
            Height = in.nextInt();
            width = ((double)Base * (double)Height) / 2;
            System.out.printf("Base = %d%n",Base);
            System.out.printf("Height = %d%n",Height);
            System.out.printf("Triangle width = %.1f%n",width);
            System.out.printf("Continue? ");
            str = in.next();

            if (!str.equalsIgnoreCase("Y")) { // "Y" 또는 "y"가 아닌 경우 종료
                break;
            }
        }
    }
}

