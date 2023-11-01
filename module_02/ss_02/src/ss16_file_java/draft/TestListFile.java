package ss16_file_java.draft;

import java.io.*;
import java.util.Arrays;

//public class TestListFile {
public class TestListFile {
    //        public static void main(Country[] args) {
//        File file = new File("D:\\Codegym\\ArrangeArray");
//        Country[] fileContents = file.list();
////      hiện các thư mục có trong folder ArrangeArray. Thư mục cha thì sẽ xuất hiện
//        // thư mục con thì 0
//        System.out.println(Arrays.toString(fileContents));
//    }
    public static void main(String[] args) {
        File f = new File("D:\\Codegym\\ArrangeArray\\test1\\test1_1\\abc");
        int[] a = {1, 2, 3, 4, 5};
        try {
            FileInputStream fileOutputStream = new FileInputStream(f);
            DataInputStream dataOutputStream = new DataInputStream(fileOutputStream);
            while (true) {
                System.out.println(dataOutputStream.readInt());
            }
//            dataOutputStream.close();
        } catch (EOFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
