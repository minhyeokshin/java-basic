import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("x의 값 입력");
        String strx = input.nextLine();
        //strx 변수값을  숫자값으로 변경하여 int x에 저장하세요.
        int x = Integer.parseInt(strx);

        System.out.println("y의 값 입력");
        String stry = input.nextLine();
        //stry 변수값을  숫자값으로 변경하여 int y에 저장하세요.
        int y = Integer.parseInt(stry);

        System.out.println("z의 값 입력");
        String strz = input.nextLine();
        //strz 변수값을  숫자값으로 변경하여 int z에 저장하세요.
        int z = Integer.parseInt(strz);

        System.out.printf("sum = %d",x+y+z);
    }
}