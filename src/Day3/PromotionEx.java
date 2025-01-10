package Day3;

public class PromotionEx {
    public static void main(String[] args) {

        char charValue = '가';
        int intValue = charValue;
        char charValue1 = (char)intValue;
        // char타입의 경우 int 타입으로 자동변환되면 유니코드 값이 int타입에 대입된다.
        System.out.println("\'가\'의 유니코드 값 : "+intValue);
        System.out.println(charValue1);

        intValue = 100;
        long longValue = intValue;


        float floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println(floatValue);
        System.out.println(doubleValue);
    }
}
