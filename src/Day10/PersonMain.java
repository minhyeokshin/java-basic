package Day10;

public class PersonMain {
    public static void main(String[] args) {
        Person Shin = new Person();
        Shin.setName("신민혁");
        Shin.setAge(29);
        Shin.setPhoneNumber("010-3801-0311");


        //자신 이름의 객체 생성 , 생성자 오보로딩한 생성자 이용

        System.out.println(Shin.getName() + " 점심시간에 우동을 " + Shin.eat());
        System.out.println(Shin.getName() + " 점심시간에 " + Shin.walk());
        System.out.println(Shin.getName() + "은 " + Shin.getAge() + "살이다.");


    }
}
