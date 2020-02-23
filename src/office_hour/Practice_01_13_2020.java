package office_hour;

public class Practice_01_13_2020 {

    /**
     * Class = type
     * In real world ,we have different types of objects . Every object belong to some kind of type
     * <p>
     * In Java everything is an object
     * Every object has some properties and behaviors
     * <p>
     * What is property ?
     * height ,weight,color,name....
     * <p>
     * and then what is behavior ? lets say phone can ring , can make calls, can turn on ,turn off
     * ,take pictures ....any action is a behavior .
     * <p>
     * So to be able to create objects with same properties and behavior , we need to list them in
     * some kinds of blueprints.
     * <p>
     * To build millions of Toyota camry , Toyota needs some blueprint to make sure that every car
     * is identical
     * <p>
     * In Java, we have class, and class it's a blueprint object
     * Based on class we create objects.
     * <p>
     * Object -- it's an instance of a class ( remember this sentence ,its interview question)
     * in class ,to create properties we use instance variables:
     * <p>
     * Class{
     * private String firstName; <---they are instance variables
     * private String lastName;
     * private String DOB;
     * private int age;
     * }
     * <p>
     * instance variables always must be private
     * Every single object will have a copy of instance variable and methods
     * private means you cannot access this variable from outside
     * <p>
     * new Class<--this is how we create object
     * <p>
     * class School{
     * <p>
     * public static void main(String[] args){
     * <p>
     * Person p1 = new Person();
     * p1.firstName <--- Java will complain , because variable is private
     * }
     * <p>
     * }
     */

    private String firstName;
    private String lastName;
    private String DOB;

    public void setFirstName(String firstName) {
        if (firstName.length() < 2) {
            System.out.println("Name is too short!");
        } else {
            this.firstName = firstName;
        }
    }


    /**
     *public void printInfo(){
     *         System.out.println(String.format("String first name = %s, last name = %s, date of birth = %s",firstName, lastName, DOB));
     *     }
     *
     */





}