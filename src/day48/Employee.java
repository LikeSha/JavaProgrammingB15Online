package day48;

public abstract class Employee {

    /**
     *abstract super class called Employee
     *
     * instance fields : name ,id
     *
     * Constructor : to set all the fields
     *
     * abstract methods : calculateAnnualSalary, toString
     *
     * HourlyEmployee
     * instance fields :
     * hourlyWage, numsOfHours,
     *
     * Constructor : to set all the fields
     *
     * instance methods :
     * calculateAnnualSalary
     * toString
     *
     * ------------------------------
     * FullTimeEmployee
     *   instance fields :
     *      name , id
     *      monthlySalary
     *
     *      Constructor : to set all the fields
     *
     *   instance methods :
     *     calculateAnnualSalary
     *     toString
     *  --------------------------------------

     */

      String name;
      int id;

      public Employee(){ // put an empty constructor
                       // to avoid subclass mistake

      }
      // WHY DO WE HAVE CONSTRUCTOR HERE
    //WE CAN NOT CREATE AN OBJECT OUT OF IT?
    //WHAT IS THE POINT?
    //SO THAT SUB CLASS CAN REUSE THE CODE OF SETTING ID AND NAME
      public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void calculateAnnualSalary();

      // This is optional : the only reason we put it in here was
    //to enforce sub class to provide toString method
    public abstract String toString();

    /**
     * Source file TYPES IN JAVA
     *  class
     *    public class Person{
     *
     *    }
     *    interface
     *      public interface Flyable{
     *
     *      }
     *    enum
     *      public enum Season{
     *
     *      }
     *
     *    We can achieve abstraction using
     *        abstract class
     *        interface
     *
     *        both of them are abstract type
     *        and can not crate
     *
     *
     *
     *
     *
     *
     *
     */


}
