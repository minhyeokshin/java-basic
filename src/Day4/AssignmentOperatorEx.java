package Day4;

public class AssignmentOperatorEx {

    public static void main(String[] args) {

        int result = 10;

        result += 10; // result = result + 10
        result -= 10; // result = result - 10
        result *= 10; // result = result * 10
        result /= 10; // result = result / 10



        //삼항(조건) 연산자 : (변수 비교연산자 변수)? 값1 : 값2

        int score = 80;
        char grade = (score >= 90)? 'A' : (score >= 80)? 'B' : 'C';
        System.out.printf("%d점은 %s 입니다.",score,grade);

    }
}
