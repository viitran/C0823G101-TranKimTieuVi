package ss7_abstract_class_interface_java.practice.thuc_hanh_lop_animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck - cluck";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
