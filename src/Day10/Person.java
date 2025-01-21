package Day10;

public class Person {
    private String name;
    private int age;
    private String PhoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Person(){} // default constructor 기본생성자 : 만약 개발자가 기술해 놓지 않으면 컴파일러가 자동으로 생성
    public Person(String name, int age, String PhoneNumber){
        this.name = name;
        this.age = age;
        this.PhoneNumber = PhoneNumber; // 생성자 오버로딩
    }

    public String play(){
        return "운동하다";
    }
    public String eat(){
       return "먹다";
    }
    public String walk(){
        return "걷다";
    }
}
