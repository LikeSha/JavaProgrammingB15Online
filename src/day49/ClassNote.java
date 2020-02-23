package day49;

public class ClassNote {

    /**
     * 2 way to achieve abstraction in Java
     *
     * Abstract class
     *  can have :
     *  everything a normal class can have + abstract methods - no object can be created from abstract class
     *
     *
     *Interface
     *   public static final field : CONSTANT
     *   abstract methods
     *   ------------------------------------------
     *   default method
     *   static method
     *
     *   if a class does not explicitly (visibly)
     *     extends another class, it will implicitly( automatically) extends Object class
     *
     *     public class Car{}
     *
     *   public class SpyCar extends Car{
     *
     *   }
     *
     *   Object --Car--SpyCar
     *
     *   TASK :
     *      Create an Interface called Autonomous
     *         it has a single abstract method
     *            selfDrive()
     *
     *      Create an abstract class called Vehicle
     *         it has 1 field
     *            brand
     *         add a constructor to set the field
     *         abstract method start();
     *
     *         non-abstract method instance method
     *            foForward()
     *
     *       Create a concrete class called Tesla
     *          add instance field horsePower as int
     *
     *       Tesla extends Vehicle and implements Autonomous
     *
     *           add constructor to set all fields
     *           implement all abstract methods
     *           add toString methods
     *
     *       Create main method to test your code
     *
     *       OPTIONALLY : Create Chargable interface that have charge method let Tesla implements Chargable
     *
     *
     *
     * TASK 2
     *
     *     Create an Interface called Drawable
     *            it has draw method
     *
     *     Create an abstract class called Shape
     *     it implements Drawable interface
     *
     *     it has 2 fields : String name, double area
     *     abstract method calculateArea();
     *
     *     Create 2 concrete Shape classes called
     *        Square
     *          field : length
     *          instance methods : ( implement all abstract methods)
     *          toString method
     *
     *          Circle
     *            field : radius
     *            instance methods : ( implement all abstract methods)
     *            toString method
     *
     *
     *
     *
     */
}
