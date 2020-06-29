package day31;

public class MethodIntro {

   // WHY DO WE NEED TO HAVE A METHOD
    // REUSABLE CODE !!! AVOID CODE DUPLICATED
    public static void main(String[] args) {

        /** Method is a kind of action.
         * Method we already know so far :
         * println(something to print )
         * print (something to print )
         *
         * Scanner methods :
         * Scanner scan = new Scanner(System.in) ;
         *
         * String name = scan.next() ; // we are using object to calling it " scan ",  " scan " is not
         * that object itself, it is something that represent that object , in another word ,
         * it is dog lish  , that tv remote , pointer ....
         *  we are using an object to calling "next(),nextInt(_)
         * int age = scan.nextInt()
         *
         * String methods :
         *
         * String str = "Hello" ;
         * str.charAt(0)  // char firstcharacter = str.charAt(0)
         * str.toLowercase()
         * and so on .............
         *
         * Arrays class method :  // Arrays is a class name,
         *                        // Arryas is NOT an object .
         *
         *Arrays.toString( your array object here ) ;
         * Arrays.sort(your array object here) // it doesn't return anything , just sort it , you need to
         * print it out
         * Arrays.deepToString ( your multi d array object here )
         *
         * Arrays , is not an object ,it is class name , wo don't need to put an object to call
         *
         * // observation :
         * method that accept external data when being called
         * method that does not accept external data when being called
         *
         * ----------
         * method that generate some type of result that can be saved
         * method that does not generate any result , just plain action.
         *
         * ----------
         * method that need an object when being called
         * method that does not need an object when being balled
         *

         ** public  : access modifier; open to public everyone can see
         * *static  : no object needed to call ; // don't need an object
         * *void    : return type(none in this case) void mean nothing in english just takes action
         * *main    : method name can be anything hold your horse for ex
         * *()      : method parameters(none in this case)

         **/


       // two ways to call static methods
        // ClassName.methodName(external data if needed)
        //if you are in same class
        // you can directly called them
        //methodName(external data if needed)

 //       MethodIntro.sayHello();// Optional if you are in same Class
        System.out.println("Begin");
        MethodIntro.sayHello();
        System.out.println("-----------");
        sayHello();
        System.out.println("THE END");
        // program flow : start from line 68--69---( 78,80,81,82)---70---71 ----(78,80,81,82)---72--DONE !

    }   // MAIN METHOD ENDS HERE !!!!!
        // DO NOT CREATE A METHOD INSIDE MAIN METHOD // BUT MUST INSIDE CLASS
       // IT CAN BE ANYWHERE INSIDE THE CLASS OUTSIDE MAIN METHOD
        public static void sayHello(){

            System.out.println("Hello World");
            System.out.println("My Name is Juma");
            System.out.println("I love Java");

        }




}
