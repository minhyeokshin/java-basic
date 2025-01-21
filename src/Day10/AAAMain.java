package Day10;

public class AAAMain {
    public static void main(String[] args) {

        AAA aaa1 = new AAA();
        System.out.println(aaa1.getDdd());
        aaa1.setName("신세계");
        aaa1.setDdd(10.20);
        String name = aaa1.getName();
        System.out.println(name);
        System.out.println(aaa1.getDdd());
    }
}
