package Day4;
/*
문제
정수형 변수 a와 b를 만들고 각각 10으로 초기화한 후 다음과 같이 출력하는 프로그램을 작성하시오.

출력
최초값 a = 10, b = 10

a++ = 10, ++b = 11
실행후 a = 11, b = 11

a-- = 11, --b = 10
실행후 a = 10, b = 10
 */
public class prac3 {

        public static void main(String[] args) {

            int a = 10; // a = 10 초기화
            int b = 10; // b = 10 초기화

            System.out.printf("최초값 a = %d, b = %d%n%n",a,b);
            //최초값 a = 10, b = 10

            ++b;
            System.out.printf("a++ = %d, ++b = 11%n",a,b);
            //a++ = 10, ++b = 11
            a++;
            System.out.printf("실행후 a = %d, b = %d%n%n",a,b);
            //실행후 a = 11, b = 11

            --b;
            System.out.printf("a-- = %d, --b = %d%n",a,b);
            //a-- = 11, --b = 10
            a--;
            System.out.printf("실행후 a = %d, b = %d",a,b);
            //실행후 a = 10, b = 10
        }
    }
