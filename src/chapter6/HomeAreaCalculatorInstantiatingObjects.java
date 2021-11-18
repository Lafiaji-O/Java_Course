package chapter6;

public class HomeAreaCalculatorInstantiatingObjects {

    public static void main(String[] args) {

        RectangleClassesAndObjects room1 = new RectangleClassesAndObjects();

        room1.setLength(23.658);
        room1.setWidth(30.88);

        room1.perimeter();
        room1.area();

        RectangleClassesAndObjects room2 = new RectangleClassesAndObjects(29.669, 18.47);
        room2.perimeter();
        room2.area();

        double totalArea = room1.area() + room2.area();
        double totalPerimeter = room1.perimeter() + room2.perimeter();

        System.out.println("The total area and perimeter for room 1 and 2, are: " + String.format("%.2f", totalArea) + "\n" +
                "and " + String.format("%.2f", totalPerimeter));

    }
}
