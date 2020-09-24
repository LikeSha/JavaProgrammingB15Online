package office_hour.practice02_06_2020;

public class Test {

    public static void main(String[] args) {

        Kentucky obj1 = new Kentucky();
        obj1.KFC();
        obj1.tax();

        States obj2 = new Kentucky(); // this is polymorphism concept : parent reference to child object
        obj2.tax();//THe object type method got executed! because the method is overridden.
//        obj2.KFC();// NOT WORKS! because this object obj2 method in ONLY EXISTING in Kentucky class,
        // Kentucky class also known as the object class .the parent class
        // States ( also known as the reference class type )doesn't have this method ! so you can not access it!

//        above example :IMPORTANT CONCEPT IN POLYMORPHISM : The reference type decides what can be called !

//        the second important concept : if the method called existing in both types, which one executed ?
//        THe object type method got executed!

        States obj3 = new California();
        obj3.tax();// if the methods existing in both reference type and object class, which one gonna be return
//                   this method? The answer is : ONLY THE OVERRIDDEN ONE ! --> California();


    }
}
