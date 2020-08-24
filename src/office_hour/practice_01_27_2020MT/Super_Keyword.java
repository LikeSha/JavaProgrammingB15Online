package office_hour.practice_01_27_2020MT;

/*
this() & super() rules: 1. ONLY THE CONSTRUCTOR CAN CALL ANOTHER CONSTRUCTOR!!
                        2. constructor can not be called by their names , you can only use this() or super() to call
                        3. constructor call MUST be at the first step in constructor body ( first line of code )
                        4. A constructor cannot call more than one constructor.
                        5. Constructor cannot call or contain itself
                        6. super class constructor MUST BE CALLED IN SUB CLASS
                        7. super class default constructor is called by default in sub class

      constructor rules : 1. CONSTRUCTOR CAN NOT BE OVERRIDDEN !! but can be overloaded
                          2. Constructor execution ALWAYS depends on the object
                          3. Every class must have constructor
                          4. Constructor name MUST be same with class name
                          5. Constructor does not have return type and specifier
                          6. class object MUST be created with existing constructor

super: refer to the object instances( from super class)
       to super keyword, the precondition is : there must be an inheritance relationship

       super. : calling instance variables and instance methods( from super class)

       super(): calling the constructor ( from the super class)
 */

class TestData{
    public TestData(){
        System.out.println("A");
    }
    int a = 100;

    public void method1(){
        System.out.println("super class instance methods");
    }

}
public class Super_Keyword extends TestData{

    public Super_Keyword(){
        super(); // A
        System.out.println("B");
    }
    public void method1(){ // we overriding the method in superclass TestData
        System.out.println("sub class instance methods");
    }

    public static void main(String[] args) {

//        super.a=300;// this one give me compile error
//        super.method1();// this one give me compile error  we can not use super keyword inside static method, because
        // super: refer to the object instances( from super class)
        //mm();
          Super_Keyword obj = new Super_Keyword();
          obj.mm();
    }

    public void mm(){
        System.out.println("super.a = " + super.a);
        super.method1(); // but if i use this.method1(), it will calling current class( the subclass)
        // method which is printout :System.out.println("sub class instance methods");

    }
}
