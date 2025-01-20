package Day9;

public class Example01 {
    public static void Method() {
        System.out.println("Static 메서드입니다.");
        System.out.println(5+6);
    }
    public static void Method(String message) {
        System.out.println(message);
    }
    public static void Method(int num1 , int num2) {
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        Method();
        Method("Hello");
        Method(1,2);
    }
}
