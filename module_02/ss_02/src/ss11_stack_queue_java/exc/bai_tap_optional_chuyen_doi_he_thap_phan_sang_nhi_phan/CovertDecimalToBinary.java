package ss11_stack_queue_java.exc.bai_tap_optional_chuyen_doi_he_thap_phan_sang_nhi_phan;

import java.util.LinkedList;
import java.util.Scanner;

public class CovertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> stackNumber = new LinkedList<>();
        System.out.println("Nhap so muon chuyen doi: ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number != 0) {
            int result = number % 2;
            stackNumber.addFirst(result);
            number = number / 2;
        }
        System.out.println(stackNumber);
    }
}
