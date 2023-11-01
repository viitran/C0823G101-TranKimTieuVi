package ss18_regex_java.exc.bai_tap_validate_name_class;

import java.util.Scanner;

public class NameValidateTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ValidateNameClass validateNameClass = new ValidateNameClass();
        String[] strings;
        String string;
        do {
            System.out.print("Enter name class (Ex: C0223G, A0323K, P0123I): ");
            string = scanner.nextLine();
            strings = string.split(",");
            for (String strs : strings) {
                System.out.println(validateNameClass.checkValidateNameClass(strs));
            }
        } while (true);
    }
}
