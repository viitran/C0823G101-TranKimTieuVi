package ss16_file_java.exc.bai_tap_doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            File file = new File("D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src" +
                    "\\ss16_file_java\\exc\\bai_tap_doc_file\\countries.csv");
            if (file.isFile()) {
                System.out.println("Mở file thành công!Bạn có muốn đọc file?\n" +
                        "1. Có.\n" +
                        "2. Không.\n" +
                        "3. Thoát.");
                System.out.print("Lựa chọn của bạn là: ");
                choice = ReadFile.checkExceptionChoice();
                switch (choice) {
                    case 1:
                        System.out.println("----Đang đọc file----");
                        try {
                            System.out.print("id | acronym  | full name    \n");
                            readAndProcessFile(file);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        System.out.println("Hẹn gặp lại!");
                        System.exit(1);
                        return;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ!Vui lòng chọn lại");
                }
            } else {
                System.out.println("File không tồn tại!Vui lòng kiểm tra lại");
            }
        } while (true);
    }

    private static void readAndProcessFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            printCountryData(countries(line));
        }
        bufferedReader.close();
    }

    private static List<String> countries(String line) {
        List<String> countryList = new ArrayList<>();
        String[] splitCountryList;
        if (line != null) {
            splitCountryList = line.split(",");
            for (int i = 0; i < splitCountryList.length; i++) {
                countryList.add(splitCountryList[i]);
            }
        }
        return countryList;
    }

    private static void printCountryData(List<String> country) {
        System.out.print(country.get(0) + "  | " + country.get(1) + "     | " + country.get(2) + "\n");
    }

    private static int checkExceptionChoice() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.print("Lựa chọn không hợp lệ!Vui lòng nhập lại: ");
            }
        }
    }
}

