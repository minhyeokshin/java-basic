package Day3;

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
    }
}


/*
수식을 출력하면 계산 결과가 출력됩니다.
10 + 5 = 15
내 생일은 2005년 6월 17일 입니다.
 */