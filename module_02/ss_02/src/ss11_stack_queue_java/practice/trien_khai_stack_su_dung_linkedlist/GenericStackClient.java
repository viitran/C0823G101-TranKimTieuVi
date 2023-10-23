package ss11_stack_queue_java.practice.trien_khai_stack_su_dung_linkedlist;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Vtran");
        stack.push("Lati");
        stack.push("KK");
        stack.push("Alvin");
        System.out.println("Before pop: ");
        System.out.println(stack.size());
        System.out.println("After pop: ");
        stack.pop();
        System.out.println(stack.size());
    }

    private static void stackOfInteger() {
        MyGenericStack<Integer> integerStack = new MyGenericStack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(5);
        integerStack.push(9);
        System.out.println("Before pop: ");
        System.out.println(integerStack.size());
        integerStack.pop();
        System.out.println("After pop: ");
        System.out.println(integerStack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of string: ");
        stackOfStrings();
        System.out.println("-----------");
        System.out.println("Stack of Integer: ");
        stackOfInteger();
    }

}
