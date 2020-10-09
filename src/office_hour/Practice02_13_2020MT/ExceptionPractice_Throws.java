package office_hour.Practice02_13_2020MT;

public class ExceptionPractice_Throws {

    public static void main(String[] args) throws Exception{

        System.out.println("Step 1");

        Thread.sleep(4000);

        System.out.println("Step 2" + 9/0);

        System.out.println("Step 3");

        System.out.println("Step 4");

        Thread.sleep(4000);

        System.out.println("Step 5");

        /*
        by using throws keyword, we can handle all Exceptions on a same time ,suppose we have 400 test steps,
        we can no write try catch block in each exception ,its too many, so we simply using throws keyword
        to handle all potential checked and unchecked exceptions together , the syntax is just
        add "throws" inside method signature.
         */

    }

    public static void method1() throws Exception{
        main(new String[]{"A"}); // if I am calling main method here ,it still give me exception .unless I
//        handling this exceptions ,it has 2 ways ,one is throws, another is try catch block
    }

    public static void method2(){
        try{
            method1();
        }catch(Exception e){

        }
    }

    public static void method3(){

//        method1(); if method2 calling method1 in this case , method1 still give us exception since we use
        //throws keyword in method1, but its just hiding exception ,did not handle yet. thats why calling method1
        //gave us exception.but if you calling method2 here, it wont be any exception ,because method2 already
        //handled exception by using try catch block.
    }
}
