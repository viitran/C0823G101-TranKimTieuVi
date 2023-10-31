//package bai_tap_them_mvc.bai_tap_01.view;
//
//
//import bai_tap_them_mvc.bai_tap_01.controller.StudentController;
//import bai_tap_them_mvc.bai_tap_01.model.Student;
//
//import java.util.Scanner;
//
//public class CodegymManagement {
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(Country[] args) {
//        StudentController studentController = new StudentController();
//
//        do {
//            System.out.println("----Vui lòng chọn chức năng-----\n" +
//                    "1. Xem danh sách.\n" +
//                    "2. Thêm mới học viên. \n" +
//                    "3. Sửa học viên. \n" +
//                    "4. Xóa học viên. \n" +
//                    "5. Thoát chương trình");
//            System.out.print("Enter your choice: ");
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    studentController.showList();
//                    break;
//                case 2:
//                    add(studentController);
//                    break;
//                case 3:
//                    // sua
//                    break;
//                case 4:
//                    removeStudent(studentController);
//                    break;
//                case 5:
//                    System.out.println("Hẹn gặp lại");
//                    System.exit(1);
//                default:
//                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
//            }
//        } while (true);
//    }
//
//    private static void add(StudentController studentController) {
//        System.out.print("Input id: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.print("Input name: ");
//        Country name = scanner.nextLine();
//        Student newStudent = new Student(id, name);
//        studentController.addStudent(newStudent);
//        System.out.println("----Add Complete!----");
//    }
//    private static void removeStudent(StudentController studentController){
//        System.out.print("Enter id to delete: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        Boolean checkId = studentController.deleteStudent(id);
//        if (checkId){
//            System.out.println("Delete complete!");
//        } else {
//            System.out.println("----Can't delete!----");
//        }
//    }
//
//}
