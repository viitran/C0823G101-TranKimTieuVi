package demo.practice_tek4;

public class Super {
    public static class Person{
        void speak(){
            System.out.println("I am a person.");
        }
    }

    public static class Student extends Person{
        void speak(){
            super.speak();
            System.out.println("I am a student.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.speak();
    }
}
