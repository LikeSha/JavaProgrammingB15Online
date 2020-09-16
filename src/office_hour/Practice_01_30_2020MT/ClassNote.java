package office_hour.Practice_01_30_2020MT;

public class ClassNote {

    /**
     * Practice Topic : OOP Abstraction
     *
     * abstract : not concrete
     *
     * abstraction : focusing on the importance/Essentials , without worrying the implementation
     *                                hiding the implementation / functionality details
     *
     * class Car{
     *     start();
     *
     *
     * }
     *
     *
     *  class Tesla extends Car{
     *      start(){
     *          say"start"
     *          start engine
     *      }
     *  }
     *
     *  class Toyota extends Car{
     *      start(){
     *          push button
     *          start engine
     *      }
     *  }
     *
     *  class Jeep extends Car{
     *      start(){
     *          call the mechanic
     *          oil change
     *          jump start
     *      }
     *  }
     *
     *  abstraction method : a method without implementation (body)
     *                       method that's meant to be overridden ( cannot be overridden method is : static method, final,private)
     *
     *                       public abstract void(void is return type) methodName();
     *
     *                       if the sub class of abstract class is none abstract , then sub class MUST override the abstract method
     *
     *  two ways to achieve abstraction is : 1. Abstract class
     *                                       2. Interface
     *
     *  Abstract class :  a class that's meant to be inherited ( abstract class cannot be immutable)
     *
     *  How can you make a class immutable ? make it a final class ! String class in Java is immutable.
     *
     *     not concrete : can not create object from abstract class
     *
     *
     *
     *
     *
     *
     */
}
