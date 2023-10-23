package ss11_stack_queue_java.exc.bai_tap_dao_nguoc_element_trong_array_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseTheElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int[] newArray;
        System.out.println("Enter length: ");
        int length = Integer.parseInt(scanner.nextLine());
        array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element [" + (i + 1) + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Default Array: ");
        System.out.print(Arrays.toString(array));

        Stack<Integer> arrayStack = new Stack<>();
        newArray = new int[length];

        for (int i = 0; i < array.length; i++) {
            arrayStack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            newArray[i] = arrayStack.pop();
        }

        System.out.println("After Reverse: ");
        System.out.println(Arrays.toString(newArray));
    }
}
