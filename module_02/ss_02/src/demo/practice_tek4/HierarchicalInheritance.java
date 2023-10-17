package demo.practice_tek4;

public class HierarchicalInheritance {
    static class Person {
        void displayInfo(){
            System.out.println("I am a person.");
        }
    }
    static class Student extends Person{
        void displayInfo(){
            super.displayInfo();
            System.out.println("I am a student.");
        }
    }
    static class Employee extends Student{
        void displayInfo(){
            System.out.println("I amm an employee.");
        }
    }

    public static void main(String[] args) {
        Student a = new Student();
        Employee b = new Employee();
        a.displayInfo();
        b.displayInfo();
    }
}
