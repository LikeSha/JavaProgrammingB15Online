package day47;

public class Review {

    /**
     * when I MUST USE INSTANCE METHOD RATHER THAN STATIC ?
     * when you need to access or modify the object's attribute ( instance field)
     * static method has nothing to do with objects
     *
     * access modifier sequence from low to high : public ---default ---protected ---private
     *
     * constructor is not inherited !!!
     * how can we reuse the logic defined in super class constructor
     * we can call using super (arguments..)
     *
     * method overriding :
     * sub class can override the contend of inherited super class instance method to provide its own implementation
     * ONLY INSTANCE METHODS CAN BE OVERRIDDEN
     *
     * @Override is called annotation
     * it will ensure the method is correctly overridden once being used and its optional to use
     * but highly recommended
     * // super class method
     * private void doSomething(){
     * //doing  bunch of stuff
     *

     *  }
     *  // sub class method
     *  private void doSomething(){
     *      //doing bunch of stuff
     *
     *
     */

      // above are not valid method overriden because they are in different class , no " extends " keyword

    public class Practice {
        // this is not inherited
        private void doSomething() {

        }


    }


    class JavaPractice extends Practice {

        // this is just another method that happen to have same name
        private void doSomething() {

        }

    }
/*
*
WHEN I MUST USE INSTANCE METHOD RATHER THAN STATIC ?
when you need to access or modify
the object's attribute (instance field)
Inheritance
IS-A Relationship :
public class Car{ }
public class ElectricCar extends Car{
}
-- THIS IS A VALID STATEMENT
ElectricCar is a Car
Dog is a Animal
Employee is a Person
SalariedEmployee is a Employee
--- THIS IS NOT VALID !!!
Car is a ElectricCar
Person is a Teacher

* ----  WE CAN INHERITE --
as long its visible|accessible
fields ( instance and static )
methods ( instance and static )
constructor is not inherited !!!!
how can we reuse the logic defined in super class constructor
we can call using super(arguments..) arguments are the actual things that you passed to the methods

* method overriding :
sub class can override the content of
inherited super class instance method
to provide its own implementation
* there is no overrding if you dont have parent child relationship
* ONLY THE INSTANCE METHOD CAN BE OVERRIDDEN !!!!!

* @Override is called annotation
it will ensure the method is correctly overridden once being used
and its optional to use
but highly recommended

* // super class method
 private void doSomething(){
 	// doing bunch of stuff
 }
 // sub class method
 private void doSomething(){
 	// doing bunch of stuff
 }
ABOVE IS NOT OVERRIDING BECAUSE THEY DON'T SEE EACH OTHER AT ALL
IT WILL COMPILE
// super class method
 void doSomething(){
 	// doing bunch of stuff
 }
 // sub class method
 private void doSomething(){
 	// doing bunch of stuff
 }
ABOVE IS NOT A VALID OVERRIDING BECAUSE ACCESS MODIFIER
IN SUB CLASS SHOULD BE SAME OR MORE VISIBLE
default --->> default, protected , public
// super class method
 public void doSomething(){
 	// doing bunch of stuff
 }
 // sub class method
 public void doSomething(){
 	// doing bunch of stuff
 }
ABOVE IS VALID OVERRIDING
// super class method
 private void doSomething(){
 	// doing bunch of stuff
 }
 // sub class method
 //@Override /-->> error!!!!!!!
 public void doSomething(){
 	// doing bunch of stuff
 }
IS IT A OVERRIDING???  NO@@!!!!!!!
DOES IT COMPILE ???
*
* */

// how to create abstract class ?
    // use the word abstract in class definition
    // what does it do ?
    // it will prevent object being created out of this class also known as --can not be instantiated
    // it can have abstract method and it does not have body concrete sub class mut provide body for the methods
    //also know as implementing abstract method
    // wha is the difference between a normal (non abstract )class and abstract class ?
    // a normal ( non abstract ) class CAN NOT HAVE ABSTRACT METHOD , it can have everything else

    // an abstract class can have :

    // fields :
      // instance field
      // static field

    // methods :
       //abstract methods
      // non-abstract instance methods --> can be in a abstract class .
    // static methods

    //constructor :
      // OF COURSE IT CAN !!  BUT WHY ??????? WE ARE NOT CREATING OBJECT ??
    // YES WE ARE NOT CREATING OBJECT HERE BUT WE CAN PROVIDE REUSABLE CODE FOR SUB CLASS IN ABSTRACT CLASS CONSTRUCTOR
    //most of time ,initializing the fields by using super(arguments..)

    // SO THE BOTTOM LINE IS :
     // ABSTRACT CLASS CAN NOT BE INSTANTIATED (NO OBJECT)
    // IT CAN HAVE EVERYTHING A NORMAL CLASS CAN HAVE , PLUS IT CAN HAVE ABSTRACT METHODS


    // public interface Edible{
    //    public abstract void eat();
    // }
    //  Edible e1 = new Edible();  NO OBJECT !!!
    // ABSTRACT class also dont have object !

    /**
     * where else have we seen default :
     *
     * switch statement
     *    String season = "winter";
     *    switch(season){
     *        case"spring":
     *           // ski
     *           ......
     *           default:
     *           // if nothing match come here !!!
     *    }
     *

     *
     *  Jan 29,2020 day50 classnote  summary for " default"
     * access modifier for
     *        fields, methods,constructor
     *        if there is no visible access modifier like public protected private
     *        it means it has default access modifier
     *        IT IS INVISIBLE , WE DON'T SEE THE WORD DEFAULT HERE
     *
     * Interface
     *    default method ;
     *    a method that have default keyword in method declaration
     *     and has default implementation ( body)
     *     THIS IS THE ONLY PLACE DEFAULT METHOD CAN EXIST !!!!!
     *
     * Constructor
     *   default constructor that given by compiler when a class does not have any constructor
     *   WE DO NOT SEE THE WORD DEFAULT HERE , It's just a way to call it
     *
     * default values for
     *    array items get default values
     *    int[] nums = new int[5]; [0,0,0,0,0]
     *    double[] nums = new double[3] ; [0.0,0.0,0.0]
     *    boolean[] bools = new boolean[2]; [false,false]
     *    .....
     *    what about for reference type
     *    String[] names = new String[2]    [ null,null]
     *
     *    fields : instance or static field also gets default values
     *       for whole numbers--->0
     *       for fractional numbers---> 0.0
     *       for boolean--> false
     *       for char-->empty char
     *       for any non-primitive types we get null!!!
     *
     *       ------------------------------------------------------------------------------------------
     *   day 50 content:
     *  We will create 2nd grade math Question program
     *
     *  Question is abstract idea
     *     and we will represend it by Abstract class here
     *
     *     it has below fields :
     *         int num1
     *         int num2
     *         String operator
     *         int answer
     *         boolean calculated
     *         String questionType = "Unknown"
     *
     *         abstract void method calculate();
     *
     *         Constructor to set
     *            Question type and Operator
     *
     *         toString method to return this question is + questionType
     *
     *         Create sub class Addition
     *              it has one constructor to set num1 and num2
     *              it should also set questionType to "addition"
     *                                 operator to "+"
     *              it should implement calculate method
     *              toString method in below format
     *                 return num1 + operator + num2 = "" if not calculated yet
     *                 return num1 + operator + num2 = answer if already calculated
     *
     *
     */









}
