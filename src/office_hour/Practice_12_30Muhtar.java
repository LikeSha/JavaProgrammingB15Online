package office_hour;

import java.util.Arrays;

public class Practice_12_30Muhtar {



    /**
     * Practice topic : Wrapper class
     *
     * primitives :       byte,  short, int, long, float, double, char,      boolean
     * default value :      0     0       0   0    0.0    0.0    empty      false
     *
     * Wrapper classes :  every primitives in java has a class that's dedicated to it
     * Byte , Short, Integer, Long, Float, Double,Character, Boolean
     *
     * all those wrapper classes are presented in " java.lang"
     * default value for all wrapper class is "null"
     *
     * Auto-boxing : assigning primitive value to wrapper class
     * Un-boxing : assign wrapper class value to primitive values
     */
    public static void main(String[] args) {

        int a = 10 ;
        //Integer A = a ; you can only giving int to Integer , not any other type ,each data type correspond
        // to their own wrapper class.
        Integer A = a ;
        // Double A2 = a ;  this is not working ! compiler error ! because Double is only dedicated to double

        float f = 0.5f ;
        //Double F = f ;  each wrapper class are dedicated to their own primitives .

        Double num1 = (double)0.5f;
        Short num3 = 45 ;
        Integer num4 = 100 ;

        double num2 = num4 ;
        System.out.println(num2); // it will give you 100.0

        // Long number1 = 100 ; // wrapper class is ONLY DEDICATED TO HIS OWN primitive , 100 is considered
        // as int value ,so compiler error ! you need to do this -->> 1, assign long value ,2, casting to long

        Long number1 = 100L ; // Auto boxing

        Float f1 = 100.0f;

        double d1 = f1 ; // primitive takes any value , not like wrapper class // unboxing

        // Useful methods of wrapper class :
              //  Max_Value : returns the maximum value

             //  Min_Value : returns the minimum value

        System.out.println( Byte.MAX_VALUE ); // maximum value of byte primitive
        System.out.println(Byte.MIN_VALUE);  // minimum value of byte primitive

        System.out.println( Integer.MAX_VALUE) ;
        System.out.println( Integer.MIN_VALUE);

        // parse methods : converting String values to primitives,not case sensitive, returns primitive

        // ValueOf methods :converting String to Wrapper class (object) returns wrapper class
        // not case sensitive

        String str1 = "123";
        System.out.println(str1+1);// return 1231 concatenated  if you want to add numbers ,you need to
        // convert string to number first ,then add

        int result = Integer.parseInt(str1);
        System.out.println(result+1); // return 124 because not it become a number not string anymore.

        String str2 = "true" ; // can I change this String to primitive ? YES ! to boolean
            Boolean.parseBoolean(str2); // this one return me primitive boolean
            boolean r1 = Boolean.parseBoolean(str2) ;
            //System.out.println(r1==false);
        System.out.println(r1);

        String str3 = "FaLsE" ; // true, false
          Boolean.parseBoolean(str3);
          boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2);

        String str4 = "Parvin";
        Boolean.parseBoolean(str4);
        boolean r3 = Boolean.parseBoolean(str4);
        System.out.println(r3);

        // valueOf ;
        String s1 = "100.5" ;
           Double.parseDouble(s1);// assign primitive first step using parse method then--> print out
           Double c1 = Double.parseDouble(s1); // when you assign a primitive to Double ,its auto-boxing

        //System.out.println(c1 + 1);
        System.out.println(c1);

        Double c2 = Double.valueOf(s1); // return me a Double class
        System.out.println(c2);

        String s2 = "fAlSE";  // its ignoring case sensitive
            Boolean.valueOf(s2);
            Boolean b1 = Boolean.valueOf(s2);
            System.out.println(b1);


            int[] arr = new int[3]; // default value is 0
        System.out.println(Arrays.toString(arr));

        Boolean[] barr = new Boolean[3];
        System.out.println(Arrays.toString(barr)); //wrapper class default value is [null,null,null]


        String name = "string";
        String name1 = new String("string");

        Integer i1 = new Integer("123"); // not recommend using new keyword in this case ,its old


        System.out.println(addNum(100,200));
        System.out.println(addNum(100.50,200.80));


    }
     public static int addNum( int a , int b){

        return a+b;
     }

     public static double addNum(double a , double b){
        return a+b ;
     }

}
