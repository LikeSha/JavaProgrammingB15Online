package day36;

public class WrapperReview {

    public static void main(String[] args) {

        /**
         * Wrapper classes :
         * Boolean, Character,
         * Byte,Short,Integer,Long,Float,Double
         * These classes coming from java.lang package
         * collectively called -->> Primitive Wrapper Classes
         *
         * It has a lot of static methods built in these classes to work with
         * this type of data
         *
         * 1, parse String into primitive types value
         * "123"---> 123 Integer.parseInt("123") ;
         *
         * // This will not work !
         * //parseMethod accept String will turn it into int
         * //passing character here !!! BAD IDEA!!!!
         * Integer.parseInt('9')
         *
         * Integer.parseInt(myChar+"")--->> int 9
         *
         * Are character 9 and int 9 same thing ???
         * '9' == 9 ---->>> FALSE
         *
         * "123"--->>123L
         * Long.parseLong("123")--->123L
         * IMPORTANT POINT :
         * ALL parseX method return primitive value
         *
         * 2, Wrap up primitive value to create Object
         * // Object oName = new Object(); // new keyword is a sign an new object created
         * String str = new String("Happy New Year") ;
         * int[] nums = new int[8] ;
         *
         * Integer i1 = new Integer(123) ; deprecated ( deprecated means : old way , not recommended)
         * Integer i2 = Integer.valueOf(123);
         *

         *
         */

          Integer i1 = new Integer(1000000000);
          Integer i2 = Integer.valueOf(123);

          // auto-boxing: primitive to wrapper type conversion
          Integer i3 = 45 ;  // -->> 45 -->> new Integer(45) ;
          // this is the most easy way to create Integer value

        // is i3 primitive type variable
        // is i3 reference type variable
        // answer : anything not primitive type are reference type ,therefore Integer is
        // a class !!!

        int i4 = 54 ;
        // Auto unboxing : wrapper type to primitive type conversion
        int i5 = new Integer(100); // new Integer(100)-->100

        //AUTO BOXING AND UNBOXING IS UNIQUE FEATURE
        //OF CONVERSION BETWEEN PRIMITIVE VALUE WRAPPER CLASSES OBJECTS

    }
}
