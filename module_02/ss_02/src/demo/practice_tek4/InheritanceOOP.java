package demo.practice_tek4;

public class InheritanceOOP {
    static class Animal {
        public void eat() {
            System.out.println("I can eat.");
        }
    }

    static class Dog extends Animal {
        public void dane() {
            System.out.println("Dancing Dog.");
        }
    }

    public static void main(String[] args) {
        Dog a = new Dog();
        a.eat();
        a.dane();

    }
}
