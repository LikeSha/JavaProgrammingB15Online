package day51.polymorphism;



public abstract class Shape {

    public abstract void draw();


}
class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing triangle");
    }
}

class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing recgangle");
    }
}

class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Square extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing square");
    }
}