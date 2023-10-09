package ss3_array_method_java.practice;

import java.util.Objects;
import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Lati", "Feni", "Alvin", "Vtran", "C08", "CodeGym"};
        String inputName;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search a name's student: ");
        inputName = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Position of the students in the list " + inputName);
        } else {
            System.out.println("Not found " + inputName + " in the list");
        }
    }
}
