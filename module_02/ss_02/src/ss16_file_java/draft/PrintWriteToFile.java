
package ss16_file_java.draft;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintWriteToFile {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src\\ss16_file_java" +
                    "\\draft\\testfullname");

            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String firstName = input.next();
                String midName = input.next();
                String lastName = input.next();
                String last = input.next();
                int score = input.nextInt();
                System.out.println(firstName + " " + midName + " " + lastName + " " + last + score);
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
