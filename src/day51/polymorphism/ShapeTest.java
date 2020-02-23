package day51.polymorphism;


import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        Shape s4 = new Square();



        s1.draw();
        s2.draw();
        s3.draw();

        System.out.println("---------------------------------");
        // please create Array of shape to stores 5 concrete Shape Object
        // and call the draw the method

        // Also try to create ArrayList of Shape
        // and store 4 concrete shape objects
        // and call the method on each of them

        //Create a different class with main method
        //and try to use the Shape ,Circle ,Triangle class from day 50
        //Create list of Shape and calculate their area




       Shape[] allShape = {s1,s2,s3,new Square(),s2};

       for(Shape each:allShape){
           each.draw();
       }

        System.out.println("------for loop-------------");

       for(int x = 0; x<allShape.length;x++){
           allShape[x].draw();
       }

        System.out.println("---------for each loop with List");
        // Quick way to create a List--> CAN WE ADD OR REMOVE ITEM FROM THIS SHORT WAY ? NO!!
        List<Shape> shapeList = Arrays.asList(s1,s2,s3,s2,s1);
        //List is an Interface ,ArrayList is a class!!!!

        // second version to create List :
        // List<Shape> shapeList = new ArrayList<>();
        //shapeList.add(s1);
        //shapeList.add(s2);
        //shapeList.add(s3);
        //shapeList.add(s4);
        //shapeList.add(s5);

        for( Shape each:shapeList){
            each.draw();
        }

        System.out.println("-----for loop with List");

        for(int x = 0 ; x<shapeList.size();x++){
            shapeList.get(x).draw();
        }

    }





}
