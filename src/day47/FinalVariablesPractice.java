package day47;

public class FinalVariablesPractice {

    public static void main(String[] args) {

        int x = 10;// declaring and initializing/assigning a variable
        x = 100;// re-assigning new value to the variable //giving new value to the variable

        final int a = 20;//declaring and initializing/assigning  a final variable
        // a= 200; // re-assigning new value to the final variable ---error !!!!!

        final Student s1 = new Student(101);
        System.out.println(s1.studentID);
        // can not reassign the value because it's final
        // s1 = new Student(102);
        // s1.studentID = 200; // you can still change internal data attached
        //to the object as long as it's the same object s1 pointing to
        //as long as the address does not change
        System.out.println(s1.studentID);

        System.out.println(Student.SCHOOL);
        //can not reassign value because it's final
        //Student.school = "abc";

        // ITELLIJ AUTOMATICALLY RECOGNIZE CONSTANT (public static final field)
        //It will automatically make it italic (THis can not be done by programmer)
        //easy way to distinguish between fields and method is
        // by looking at () at the end



        System.out.println(Byte.MAX_VALUE);

        //PI in Java
        System.out.println(Math.PI);

        printDoubledNumber(12);

        final String name = "Zahra";
        // // name = "Zehra" ,this will not work , can not be reassigned


    }

    /**
     * a void method that accept a number and print out doubled number
     *
     * @param x
     */
    // anywhere we declare a variable we have option to make it final (including method parameter)
    //making method parameter final
    // it will make the method only use the argument user passed without modifying it ;

    public static void printDoubledNumber(final int x) {
//        x = x * 2 ;
//        System.out.println("x*2 = " + x );

        System.out.println("x*2 = " + x * 2);
      // any class not final can be a super class

        //final class can not be extended(inherited ) , final method can be inherited but can not be overridden
        // final keyword restrict : 1,changing value of variable , 2, method overriding 3, inheritance .

    }
}