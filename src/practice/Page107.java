package practice;

public class Page107 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        b = a++;

        System.out.printf("대입 후에 증가 연산자를 사용했습니다. b의 값은 %d입니다.",b);

        b = +a;

        System.out.printf("대입 후에 증가 연산자를 사용했습니다. b의 값은 %d입니다.",b);
    }
}
