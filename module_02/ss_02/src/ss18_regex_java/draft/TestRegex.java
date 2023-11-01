package ss18_regex_java.draft;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("^[0-9 ]{6,}$");
//        do {
//            String number = scanner.nextLine();
//            if (pattern.matcher(number).find()){
//                System.out.println("ok");
//            } else {
//                System.out.println("k");
//            }
//        }while (true);

        //vdu nhập nhiều chữ A-Z và a-z và 0-9 và space
//        Pattern pattern = Pattern.compile("^[a-zA-Z0-9 ]+$");
//        do {
//            String number = scanner.nextLine();
//            if (pattern.matcher(number).find()){
//                System.out.println("ok");
//            } else {
//                System.out.println("k");
//            }
//        }while (true);
//    }
//        System.out.println("Java Java Java".replaceAll("J\\j", "ja")); -> KQ lỗi vì ko cho J thành thường - nếu thường thành thường thì oke
        String str = "Welcome to gpcoders";

// Ký tự bất kỳ xuất hiện nhiều lần lần và kết thúc là r
        String regex = ".*r$";

// Tạo đối tượng Pattern thông qua method tĩnh.
        Pattern pattern = Pattern.compile(regex);

// Lấy ra đối tượng Matcher
        Matcher matcher = pattern.matcher(str);

// Kiểm tra có khơp với regex không
        boolean match = matcher.matches();
        System.out.println("Match = " + match); // Match = true
    }
}
