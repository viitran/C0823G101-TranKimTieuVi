package ss16_file_java.draft;

import java.io.*;
import java.util.Arrays;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Codegym\\C0823G101-TranKimTieuVi\\module_02\\ss_02\\src\\ss16_file_java\\practice\\ArrangeArray");
        try {
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
