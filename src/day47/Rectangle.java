package day47;

public class Rectangle extends Shape {

    // String name;
    // int area;
    int height;
    int width;

    public Rectangle(int width, int height) {
        // I want to set the name to word Rectangle;
        //I am reusing the functionality of super class
        // to set the name to rectangle
        super("rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}