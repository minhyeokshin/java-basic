import java.util.Scanner;

public class ATH_Cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("구매 갯수 입력");
        int num = in.nextInt();
        System.out.println("ATH 가격입력");
        double ATHprice = 0.06129;


        double sum = (double) num * ((2112*ATHprice)+950);
        System.out.printf("가격 : %f%n",sum);

        double num2 = sum / 28.5;
        System.out.printf("목표 SOL 가격 : %f%n",num2);

        System.out.printf("현재 솔라나 가격 입력 : ");
        double solprice = in.nextDouble();
        System.out.printf("%n현재 솔 가격 : %f%n",solprice);
        System.out.println();
        double num4 = sum - (28.5 * solprice);
        if (num4>=0) {
            System.out.printf("부족 : %f%n", num4);
            System.out.println("기기 가격 : " + 950 * num);
            System.out.println("staking 가격 : " + (ATHprice * 2112 * num));
        }
        else if (num4<0){
            System.out.printf("남음 : %f%n", (num4*(-1)));
            System.out.println("기기 가격 : " + 950 * num);
            System.out.println("staking 가격 : " + (ATHprice * 2112 * num));
        }
    }
}
