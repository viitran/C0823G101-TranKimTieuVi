package demo.practice_tek4;

public class OverrideParentClass {
    public static class Vehicle {
        private void display() {
            System.out.println("Four wheeler or two wheeler.");
        }
    }
    public static class Car extends Vehicle{
        public void display(){
            System.out.println("Cars are Four wheeler.");
        }
    }
}
