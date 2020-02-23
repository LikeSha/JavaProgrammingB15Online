package day45;

public class WarmUpStaticInstance {

    /**
     * static VS instance field
     *
     * static field : a field market as static it has only one copy for each and every object
     * from this template | blueprint and if the value change,everyone get affected
     * we don't need an object to use static field
     * We use static way to access static members
     * ClassName.staticMemberName
     *
     * can we use object to access static field ?
     * House.neighbourhoodName
     * NOT RECOMMENDED BUT STILL COMPILE
     * assuming h1 is pointing to valid House object
     * h1.neighbourhoodName
     *
     * WHEN I MUST USE INSTANCE METHOD RATHER THAN STATIC ?
     * ANSWER : when you need to access or modify the objects's attribute ( instance field)
     *
     * CAN YOU ACCESS ANY OBJECT ATTRIBUTE USING STATIC METHODS ? IN ANOTHER WORD , CAN YOU MODIFY ANY OBJECT ATTRIBUTES
     * INSIDE A STATIC METHOD ? NO!!!!!!
     *
     *
     * instance field : each and every object get their own value and changing one object's field value does
     * not affect other objects
     *
     * what can we access in static method :
     *  only static members (filed , method)
     *
     *  what can we access in instance method:
     *    everything
     *
     *    what can we access in constructor :
     *      everything
     *
     *      -----------------Inheritance----------------------------------
     *      Super class ---general   sub class ---specific
     *      multiple inheritance is not supported in java
     *      INTERVIEW QUESTION :
     *      how many class can extends in java ? answer : 1
     *
     *      access modifier :
     *      ACCESS MODIFIER CAN ONLY BE USED IN FILED OR METHOD ,NOT YOUR LOCAL VARIABLE !!
     *
     *      private --default --protected ---public
     *      default : only same package
     *      protected : default + accessible subclasses outside package
     *      INTERVIEW QUESTION : WHAT IS DIFFERENCE BETWEEN DEFAULT MODIFIER AND PROTECTED MODIFIER?
     *
     *      // protected access modifier:
     *     // make the member accessible in subclasses of this class
     *     // in different package
     *
     *      what is inherited from super class
     *      all the visible fields
     *      all the visible methods
     *
     *      CONSTRUCTOR IS NOT INHERITED
     */
}
