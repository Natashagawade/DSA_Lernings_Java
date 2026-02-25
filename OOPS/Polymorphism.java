package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        Human h = new Human();

        d.speak();
        c.speak();
        l.speak();
        h.speak();

    }

    public static class Dog{
        void speak(){
            System.out.println("bhau bhau");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }
    }

    public static class Lion{
        void speak(){
            System.out.println("GRRRRR");
        }
    }

    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
}
