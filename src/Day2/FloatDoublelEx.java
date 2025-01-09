package Day2;

public class FloatDoublelEx {
    public static void main(String[] args) {
        double x = 0.25;
        double y = -3.14; // 10진수 리터럴

        double z = 5e2; // 5.0 x 10 x 10 =500.0
        double k = 0.12E-2;//0.12 x 10^-2 = 0.0012
        // 컴파일러는 실수 리터럴을 기본적으로 double타입으로 해석하기 때문에 double 타입 변수에 대입하는 것이 기본이다.

        float o = 3.14f;
        float v = 3E5F;

        System.out.printf("%f %f %f %f %f %f",x,y,z,k,o,v);
    }
}
