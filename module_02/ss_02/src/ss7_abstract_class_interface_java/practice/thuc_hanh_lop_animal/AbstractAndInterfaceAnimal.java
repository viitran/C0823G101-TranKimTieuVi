package ss7_abstract_class_interface_java.practice.thuc_hanh_lop_animal;

public class AbstractAndInterfaceAnimal {
    public static void main(String[] args) {
        //cach 1
//        Animal animal = new Chicken();
//        animal.makeSound();
//        Animal animal1 = new Tiger();
//        animal1.makeSound();

        //cach 2: dua vao mang
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());
        }
        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit:fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
