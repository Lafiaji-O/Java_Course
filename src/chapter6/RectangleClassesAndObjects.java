package chapter6;

public class RectangleClassesAndObjects {

    private double length;
    private double width;

    public RectangleClassesAndObjects () {

        length = 0;
        width = 0;

    }

    public RectangleClassesAndObjects (double length, double width) {

        setLength(length);
        this.width = width;

    }

    public double getLength () {

        return length;

    }

    public void setLength (double length) {

        this.length = length;

    }

    public double getWidth () {

        return width;

    }

    public void setWidth (double width) {

        this.width = width;

    }

    public double perimeter () {

        return (2* length) + (2 * width);

    }

    public double area () {

        return length * width;

    }

}
