package Day3;

import com.sun.jdi.CharValue;

public class Test {
    public static void main(String[] args) {
        String str = "서식 문자로 출력하는 방법입니다.\n이것은 문자열을 나타냅니다.";
        System.out.println(str);

        String str2 = "수를 출력할 때는 따옴표를 생략합니다.\n123\n6.500000";
        System.out.println(str2);

        String str3 = "수식을 출력하면 계산 결과가 출력됩니다.";
        int a = 10;
        int b = 5;
        String str4 = "내 생일은 2005년 6월 17일 입니다.";
        System.out.printf(" %s%n %d +  %d = %d%n %s",str3,a,b,a+b,str4);

        // Java13부터 텍스트 블록 문법을 제공함
        String str5 = """
                subject score
                ==============
                  korean    90 
                 english   100 
                computer    80
                김진수 학생의 점수는\
                최우수로 졸업하였습니다.
                """;
        System.out.println(str5);

        byte bb= 10;
        int cc = bb;
        long dd = cc;
        float ff = dd;
        double doub = ff;
        System.out.printf("%f%n",doub);

        char charValue = 'A';
        int intValue = charValue;
        System.out.println(charValue);
        System.out.println(intValue);
    }
}

