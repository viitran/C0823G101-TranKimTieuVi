package ss16_file_java.exc.bai_tap_coppy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    private static Scanner scanner = new Scanner(System.in);

    private static List<String> readFile() {
        String line;
        FileReader fileReader;
        File file;
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();
        try {
            file = new File("D:\\Codegym\\C0823G101-TranKimTieuVi\\" +
                    "module_02\\ss_02\\src\\ss16_file_java\\exc\\bai_tap_coppy_file\\sourceFile");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return stringList;
    }

    private static void writeToFile(List<String> stringList) {
        int choice;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter;
        do {
            System.out.print("Bạn có muốn copy nội dung file trên?\n" +
                    "1. Có\n" +
                    "2. Hiển thị tổng số ký tự có trong file đang được copy\n" +
                    "3. Không\n");
            System.out.print("Lựa chọn của bạn là: ");
            choice = CopyFile.checkString();
            switch (choice) {
                case 1:
                    try {
                        File newFile = new File("D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\" +
                                "ss_02\\src\\ss16_file_java\\exc\\bai_tap_coppy_file\\targetFile");
                        fileWriter = new FileWriter(newFile);
                        bufferedWriter = new BufferedWriter(fileWriter);
                        for (String str : stringList) {
                            bufferedWriter.write(str);
                            bufferedWriter.newLine();
                        }
                        System.out.println("Copy file text thành công rùi đók! Check file copy ik");
                    } catch (FileNotFoundException e) {
                        System.out.println("File không tồn tại!!");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } finally {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Tổng số ký tự có trong file đang được copy là: " + countWords(stringList));
                    break;
                case 3:
                    System.out.println("Khong thì thui. Bye");
                    return;
                default:
                    System.out.println("Vui lòng chọn 1 trong 2!");
            }
        } while (true);
    }

    private static int countWords(List<String> stringList) {
        int count = 0;
        String length;
        for (int i = 0; i < stringList.size(); i++) {
            length = stringList.get(i);
            for (int j = 0; j < length.length(); j++) {
                count++;
            }
        }
        return count;
    }

    private static int checkString() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.print("Không được nhập chữ!Vui lòng nhập lại: ");
            }
        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        List<String> strings = copyFile.readFile();
        writeToFile(strings);
    }
}
