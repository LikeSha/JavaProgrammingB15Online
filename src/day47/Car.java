package day47;

// I don't need to create car object using this class
//I only want this class to be super class to provide
//reusable fields and methods for sub classes
//This class is designed to be a super class
public abstract class Car {

    int year;
    String brand;

   // abstract class can have abstract method
    // it has abstract keyword
    //and it does not have body, DOES NOT HAVE {}
    // it ends with ;
    //IT'S MEANT TO BE OVERRIDDEN TO PROVIDE BODY
    //IN SUB CLASS
    public abstract void start();

    public abstract void foForward();

    public abstract void goBackward();

    public abstract void turn(String direction);

    public void doCarThing(){

    }

// final and abstract are true enemy ,final says " DO NOT EXTEND ME !"
    // abstract says " YOU MUST EXTEND ME !"
    //what else an abstract class can do ?

    // 1. how to create on abstract class ?
    //  use the word abstract in class definition

    //2. what does it do ?
     // it will prevent object being created out of this class , also known as --can not be instatiated
    // it can have abstract method and it does not have body , who needs to provide body ? concrete sub class must provide body for the methods
    //also know as implementing abstract method.

    //3 what is the different between a normal call( non-abstract ) and abstract class ?
    //a normal call( non-abstract ) ---CAN NOT HAVE ABSTRACT METHOD
    // it can have everything else

    // an abstract class can have :
    // fields :  instance field
     //           static fields
    // methods :
    //           abstract methods
     //          non-abstract methods
    //           static method

    // constructor :

        //  OF COURSE IT CAN !!!!! BUT WHY ?????
        // WE ARE NOT CRATING OBJECT  ?? YES WE ARE NOT CRATING OBJECT HERE , BUT WE CAN PROVIDE REUSABLE CODE FOR SUB CLASS
    // IN ABSTRACT CLASS CONSTRUCTOR  most of time , initializing the fields by using super(arguments...)





    //add abstract void methods:
    // add foForward
    // goBackward
    //turn(String direction)
}
