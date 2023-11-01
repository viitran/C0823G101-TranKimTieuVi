package ss18_regex_java.exc.bai_tap_validate_phone;

import java.util.Scanner;

public class PhoneNumberValidateTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        String[] phoneNumber;
        String input;
        do {
            System.out.println("Enter phone number(note:(xx)-(0xxxxxxxxx)): ");
            input = scanner.nextLine();
            phoneNumber = input.split(",");
            for (String phone : phoneNumber) {
                System.out.println(phoneNumberExample.validate(phone));
            }
        } while (true);

    }
}
