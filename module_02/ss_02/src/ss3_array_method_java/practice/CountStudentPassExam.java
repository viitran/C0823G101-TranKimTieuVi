package ss3_array_method_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountStudentPassExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] students;
        int size;
        int count = 0;
        System.out.print("Nhap so luong sinh vien can nhap diem: ");
        size = Integer.parseInt(scanner.nextLine());
        if (size < 0 || size > 30) {
            System.out.println("Danh sach toi da 30 sinh vien!Vui long nhap lai");
            System.out.print("Nhap lai so luong sinh vien can nhap diem: ");
            size = Integer.parseInt(scanner.nextLine());
        }
        students = new int[size];
        for (int i = 0; i < students.length; i++) {
            System.out.print("Nhap diem cua sinh vien thu " + (i + 1) + " : ");
            students[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] >= 5 && students[i] <= 10) {
                count++;
            }
        }
        System.out.println("Diem cua cac sinh vien lan luot la: " + Arrays.toString(students));
        System.out.println("Tong cac sinh vien pass ki thi la " + count);
    }
}
