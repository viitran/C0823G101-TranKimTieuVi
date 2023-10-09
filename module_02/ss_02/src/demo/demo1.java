package demo;

import java.util.Scanner;

public class demo1 {
    //demo show lỗi vì sao nên Int.paseInt(scanner.nextIn())
    public static void main(String[] args) {
        int age;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age: ");
        age = scanner.nextInt();
        System.out.println("Input name: ");
        name = scanner.nextLine();
        System.out.println(name);
        System.out.println(age);

    }

}
