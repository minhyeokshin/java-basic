package Day13;

import java.util.Objects;

class Animal{
    void eat(){
        System.out.println("를 먹다");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("하고 울다");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("하고 짖다");
    }
}


public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal();
        Cat Objcat = new Cat();
        Dog Objdog = new Dog();
        System.out.printf("야옹");
        Objcat.meow();
        System.out.printf("먹이");
        animal.eat();
        System.out.printf("멍멍");
        Objdog.bark();
        System.out.printf("먹이");
        Objdog.eat();
    }
}
