package chapter6;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length, width;

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the length of the shape, below: ");
        rectangle.setLength(length = scanner.nextDouble());

        System.out.println("Enter the width of the shape, below: ");
        rectangle.setWidth(width = scanner.nextDouble());

        // rectangle.areaOfRectangle();
        // rectangle.perimeterOfRectangle();

        System.out.println("The area of the rectangle with " + String.format("%.2f", rectangle.getLength()) + "cm length and " + String.format("%.2f", rectangle.getWidth()) + "cm width\n" +
                "is " + String.format("%.2f", rectangle.areaOfRectangle()) + "cm.");

        System.out.println("The perimeter of the rectangle with " + String.format("%.2f", rectangle.getLength()) + "cm length and " + String.format("%.2f", rectangle.getWidth()) + "cm width\n" +
                "is " + String.format("%.2f", rectangle.perimeterOfRectangle()) + "cm.");

    }
}
