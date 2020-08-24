package office_hour.practice_01_27_2020MT;

/*

this : refer to the object instances(from current class)
       what is object instances : constructor, instance variables, instance methods

      this. : to call the instance variables and instance method

      this() : to call the constructor

      cannot be used in static methods and static blocks

      this() & super() rules: 1. ONLY THE CONSTRUCTOR CAN CALL ANOTHER CONSTRUCTOR!!
                              2. constructor can not be called by their names , you can only use this() or super() to call
                              3. constructor call MUST be at the first step in constructor body ( first line of code )
                              4. A constructor cannot call more than one constructor.

      constructor rules : 1. CONSTRUCTOR CAN NOT BE OVERRIDDEN !! but can be overloaded
                          2. Constructor execution ALWAYS depends on the object

super: refer to the object instances( from super class)
       to super keyword, the precondition is : there must be an inheritance relationship

       super. : calling instance variables and instance methods( from super class)

       super(): calling the constructor ( from the super class)
 */

class Test{
    public Test(){
        System.out.println("Hola");
    }
    public Test(String str){
        System.out.println(str);
    }

    public Test(int a){
//       Test(); constructor can not be called by their names , you can only use this() or super() to call
        this();//Hola
//        this("Muge");// you can ONLY call one constructor ,if you call more than one constructor, it will compile error.
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test obj = new Test(10);
    }
}
public class This_Keyword {

    int a = 100;

    public void method1(){
        System.out.println(this.a);// calling the instance variable
//        this.This_Super_Keyword(); // this. keyword can not call constructor!!
//        this(); // YOU CAN NOT USE this() to call constructor !
    }

    public void method2(){
        this.method1();//calling the instance method
    }

    public static void main(String[] args) {
//        this.a; // you can not use this keyword in a static method !!!!
//        System.out.println(This_Super_Keyword.a);// you can not call instance variable use static way ,because that
        // instance variable is NOT STATIC VARIABLE . THE ONLY WAY YOU CAN CALL INSTANCE VARIABLE IN A STATIC METHOD IS
        // CREATE AN OBJECT AND CALL IT:
        This_Keyword obj = new This_Keyword();
        System.out.println(obj.a);

    }


}
