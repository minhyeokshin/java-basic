package Day12;

class Singleton{
    private static Singleton object = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return object;
    }

}
public class SingletonEx {

    public static void main(String[] args) {
        //Singleton obj1 = new Singleton();

        //정적메소드 getInstance()해서 싱글톤 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();


        if (obj1 == obj2) {
            System.out.println("같은 객체 참조 " + obj1.toString() + " " + obj2.toString());
        }else {
            System.out.println("다른 객체");
        }

        System.out.println(obj1);
        System.out.println(obj2);
    }

}


/*
 public class 클래스{

 private class 클래스 singleton = new 클래스(){} // private 접근 권한을 갖는 정적 필드(singleton) 선언 및 초기화

 private 클래스() {}// private 접근 권한을 갖는 생성자 선언 : 외부 객체 생성 불가


 public static 클래스 getInstance(){  // 외부에서 객체를 얻는 유일한 방법은 getInstance() 메소드를 호출하는 것이다.
 // 정적필드(singleton)값을 리턴하는 getInstance() 정적 메소드를 public선언하여 외부에서 해당 객체를 간접적으로 얻을 수 있도록 만듬
 return singleton;
 }

 }
 */