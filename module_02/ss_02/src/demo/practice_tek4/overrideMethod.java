package demo.practice_tek4;

import java.util.Arrays;
import java.util.Scanner;

public class overrideMethod {
    public static class Polygon {
        void displayInfo() {
            System.out.println("Quadrilateral is a polygon with 4 sides: ");
        }

        int getPerimeter(int[] sides) {
            int perimeter = 0;
            for (int side : sides) {
                perimeter = perimeter + side;
            }
            return perimeter;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Polygon polygon = new Polygon();
        int[] sides = new int[4];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = Integer.parseInt(scanner.nextLine());
        }
        int perimeter = polygon.getPerimeter(sides);
        System.out.println(perimeter);
        polygon.displayInfo();
    }

}
