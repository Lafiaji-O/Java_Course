package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public void setLength (double length) {

        this.length = length;

    }

    public double getLength (){

        return length;

    }

    public void setWidth (double width) {

        this.width = width;

    }

    public double getWidth () {

        return width;

    }

    public double areaOfRectangle () {

        double areaOfRectangle = (2 * length) + (2 * width);

        return areaOfRectangle;

    }

    public double perimeterOfRectangle () {

        double perimeterOfRectangle = length * width;

        return perimeterOfRectangle;

    }

}
