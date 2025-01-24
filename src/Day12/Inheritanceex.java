package Day12;

class Calculator{
    int a = 20;
    int b = 10;
    int additon = a + b;
    int subtraction = a- b;

    void method1(){
        System.out.println("두수의 덧셈" + additon);
        System.out.println("두수의 뺄셈" + subtraction);
    }
}

class Inheritance01 extends Calculator {
    int a = 20;
    int b = 10;
    int multiplication = a * b;
    void method2(){
        System.out.println("두수의 곱셈 : " + multiplication);
    }
}

public class Inheritanceex {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Inheritance01 obj = new Inheritance01();
        obj.method1();
        obj.method2();

    }
}
