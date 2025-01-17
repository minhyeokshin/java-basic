package Day8;

public class StringBufferEx {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(); //StringBuffer클래스 생성
        StringBuffer sb1 = new StringBuffer();
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        String result = sb.toString();
        System.out.println(result);
        System.out.println(sb.capacity()); // StringBuffer  변수의 배열 용량의 크기 반환
        sb1.append("111111");
        System.out.println(sb1.capacity());
        result = sb1.toString();
        System.out.println(result);


    }
}
