package Day6;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {

        Random random = new Random(); // Random 클래스를 실체화(instance : 메모리생성) 하였다.
        //0~3까지의 범위의 난수 생성
        int n1 = random.nextInt(4);
        for (int i = 1; i <= 2; i++) {
            int n2 = random.nextInt(10); // 4미만의 랜덤 정수를 리턴한다.
            int n3 = random.nextInt(4);
            System.out.println(n2 + " " + (n3 + 1));
        }

        //int, long, float, double, boolean 타입의 무작위 값 생성
        long l = random.nextLong();
        float f = random.nextFloat();
        double d = random.nextDouble();
        boolean b = random.nextBoolean();
        System.out.println(l + " " + f + " " + d + " " + b);


        // Math.random() 사용 하는 법 : 0.0 ~ 1.0 사이의 난수가 1개 발생

        // 0~10 사이의 값
        int num1 = (int) (Math.random() * 10);
        // 0~100 사이의 값
        int num2 = (int) (Math.random() * 100);
        // 1~10 사이의 값
        int num3 = (int) (Math.random() * 10) + 1;
        // 10~20 사이의 값
        int num4 = (int) (Math.random() * 10) + 10;

        System.out.printf("%d %d %d %d",num1,num2,num3,num4);
    }
}
