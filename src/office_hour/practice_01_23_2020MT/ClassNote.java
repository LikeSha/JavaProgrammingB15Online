package office_hour.practice_01_23_2020MT;

class Test{
        public Test(String str){ // this is constructor
            System.out.println("Name is : " + str);
        }
    public void method(){
        int a = 100; // local variable
        System.out.println(a);

        //Test obj1 = new Test(); //  object MUST be created with Existing constructor

    }
    public static void main(String[] args) {
       // System.out.println(a);// a is local variable can not use in this block

         Test obj2 = new Test("Mohammed"); //

        }

    }





public class ClassNote {

    /**
     *
     * Practice Topics : Static & instance
     *                   Constructor (this)
     *
     * Static : belong to the class. can be called through the class name
     *          4 features can be static :
     *             1. static variables ( also called class variables)
     *             2.static methods.
     *             3.Static Initializer block
     *             4.static class
     *
     *
     * static variables : there is only one copy of static variables that's shared by all the objects of the class
     *
     * instance variable : belong to the object  , each object has its own copy of instance variable
     *
     * static methods : only accept class members. in order to call instances( non static) we MUST create the object
     *
     * local variables : declared within a method or block
     *                   can not be used outside method or class
     *
     * Constructor : special method . Its only used for creating object , and only get executed when you creating objects
     * creating object :  give " new " keyword .  ClassName ReferenceName = new ExistingConstructor
     * EVERY CLASS MUST HAVE A CONSTRUCTOR  if we don't create one , compiler will give no-arg constructor
     *
     * Execution depends on the creation of the object
     * declaration : Access-Modifier ClassName(Parameter){
     *
     * }
     */
        static String name;
        static int  stA = 10;

            int inB;

    public static void main(String[] args) {

        // how to declare static variables ? you can not declare static variable in main method , MUST outside the
        // method block within the class
        System.out.println(ClassNote.name);
        System.out.println(name);

        ClassNote obj1 = new ClassNote();
        obj1.stA = 20;
        obj1.inB = 200;
        ClassNote obj2 = new ClassNote();

        System.out.println(obj1.stA);//20
        System.out.println(obj2.stA);//20

        System.out.println(obj1.inB);//200
        System.out.println(obj2.inB);//0

        System.out.println("============================================");

        ClassNote Gunel = new ClassNote();
        Gunel.name = "Gunel";

        ClassNote Yana = new ClassNote();
        System.out.println(Gunel.name);// Gunel
        System.out.println(Yana.name);//Gunel
        // if the name is not static variable ,its instance ,Yana.name should print out " null" which is default value
        // this case static variable belong to class........

        // if you wanna call method1 ,you must create an object ,because its not class member
        ClassNote obj3 = new ClassNote();
        obj3.method1();


    }
    public void method1(){ // this is instance method
        // can I call static variable  in instance method ? YES !!!
        System.out.println(name);
    }




}
