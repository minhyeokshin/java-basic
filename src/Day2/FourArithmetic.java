package Day2;
/* 두개의 정수를 사칙연산(+,-,*,/)하여 출력하는 JavaSE프로그램을 만들어보자
2. 두과목의 점수를 이용하여 총점과 평균을 출력하는 프로그램을 만들어보자
 */
public class FourArithmetic {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        int sum = a+b;
        int minus = a-b;
        int multiple = a*b;
        int division = a/b;
        System.out.println("a+b= " + sum);
        System.out.println("a-b= " + minus);
        System.out.println("a*b= " + multiple);
        System.out.println("a/b= " + division);
        System.out.println("두과목의 총합은 " + sum + " 점입니다.");
        System.out.println("두과목의 평균은 " + division + " 점입니다."  );


    }
}

/*
public static void main(String[] args) {
    int a = 12;
    int b = 2;
    int result = 0;

    result = a + b;
    System.out.printf("a + b = %d%n",result);
    System.out.println("a + b = ", result);
    result = a - b;
    System.out.printf("a - b = %d%n",result);
    result = a * b;
    System.out.printf("a * b = %d%n",result);
    result = a/b
    System.out.printf("a / b = %d%n",result);
}
 */