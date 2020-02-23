package day44;

public class ReviewClass {

    /**
     * Class--blue print for an object
     *     attributes of object
     *         instance field
     *     behaviour of object
     *         instance methods
     *     constructor
     *         a special block of code that run while object is being created
     *         it has same as class name
     *         no return type (no void)
     *         It can be overloaded ( different param list)
     *
     * static members should be accessed in STATIC WAY!!!  ---->
     * ClassName.staticMethodName(....)
     *     static members
     *         static method (everything no static word is instance )
     *             a method with static keyword
     *             can be called in static way
     *             call directly in main ( if in same class)
     *             ClassName.staticMethodName(....)
     *                Arrays.toString(arrObject)
     *                  Pet.showGeneralPetInfo();(day 43)
     *
     *     static field
     *
     *     ONCE you create a class , it can a type for :
     *     reference variable
     *         Pet mypet ;
     *
     *         it an show up in couple places
     *            local variable : variable inside your method
     *            method parameter :
     *            field : outside method , under the class
     *
     *         it can also be a return type for your method
     *
     *  ------------  Constructor  VS Setters ---------------
     *
     *  constructor :
     *     good when you want to create object with initial state(attribute values given)
     *
     *  setter : good when you want to change the value of existing object fields
     *  getters and setters : we access (read and write) encapsulated data fields
     *
     *  How to create a class that generate only immutable objects:
     *
     *  create a class with private instance field , add a constructor to set the value while object is being created
     *  only provide getters for private fields but do not provide setters for private fields
     *
     *  public class Person{
     *      private String name ;
     *      private int age;
     *
     *  public Person( String name,int age){
     *      this.name = name;
     *      this.age = age;
     *  }
     *  public String getName(){
     *      return name;
     *  }
     *  public int getAge(){
     *      return age;
     *  }
     *  }
     *  Person p1 = new Person("Jon Snow",27);
     *
     *  any data type that not primitive type , it is called reference type
     *  any reference variable store :
     *  reference to the object in the heap
     *  (address of the object in the heap)
     *  (just like leash of the dog)
     *  (just like remote of the tv)
     *  (pointer to the object in the heap)
     *
     *  by its type
     *     primitive | reference variable
     *
     *  by its location
     *     local variable
     *     method parameter
     *     field
     *
     *     --------------access modifier completed -------------
     *     interview questions !!!!
     *     public --> accessible anywhere
     *
     *     protected -->>
     *         same package --->> accessible
     *         different package inside sub class--->>
     *         accessible
     *         ONLY place it can not be reached is different package , not subclass
     *
     *     default -->> no access modifier
     *            -->> only within the package , also know as package private
     *
     *     private -->> only accessible within the same class
     *
     *     private -->> default --->> protected --->> public
     *
     *
     *
     */
}
