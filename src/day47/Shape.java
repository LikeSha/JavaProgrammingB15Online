package day47;

public abstract class Shape {

    String name;
    int area;

    // add a constructor to set these name value

    // add a abstract method called calculateArea


    public Shape(String name) {
        this.name = name;

    }

    public abstract void calculateArea();

    // I want to enforce sub classes to provide toString method!!
    public abstract String toString();

}

// add two concrete class of Shape :
//Triangle
  // instance fields : int height and base

// constructor
   //  to set name, height,base

//  implements calculateArea method  area = height *base/2

// Rectangle
  // instance fields : width and height
    // implements calculateArea method  area = height * width
      // add toString method
