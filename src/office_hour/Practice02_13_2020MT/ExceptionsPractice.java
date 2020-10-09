package office_hour.Practice02_13_2020MT;

public class ExceptionsPractice {

    public static void main(String[] args) {

        String str = "Batch15";

        try {
            char ch1 = str.charAt(10); // unchecked exception
            System.out.println(ch1);
        }catch(StringIndexOutOfBoundsException e){// we either give the specific Exception class name or its parent classname
            // we can put class name here: RuntimeException or Exception
            //because Exception is the parent class of entire checked and unchecked exception !!
            //and RuntimeException is the parent class of entire unchecked exception!!!
            System.out.println("String index out of bound exception");
        }
        try{
            Thread.sleep(3000);
        }catch(Exception e){

        }

        System.out.println("Test Completed");
        /*
        if we give (ClassCastException e) , the exception still be threw it  so if the exception still be threw
        on line 10, I am not be able to execute the line 16 anymore .because the exception haven't been handle yet!

         */




//        printHello();

        //        int a = 9/0; // unchecked exception ( runtime exception) its compile but error when run.

    }

    public static void printHello() throws InterruptedException{//throws keyword MUST be used within method signature.

        Thread.sleep(3000); // how do I handle this exception except using try catch block? USE "throws" keyword!
        System.out.println("Hello");
    }
    //If I calling this method somewhere else, for example : in main method , it still give me exception
    //printHello(); so what we need to do is : add exception to the method-->
    // either use try catch block ,or use throws keyword.CALLER WILL BE RESPONSIBLE FOR HANDLING THE EXCEPTION
    // if I use try catch block handing this exception like this : and wherever I call this method, it WON'T
    //give me exception error anymore ,because try catch block already handled the issue.
//
//        public static void printHello(){
//            try{
//                Thread.sleep(3000);
//                System.out.println("Hello");
//            }catch(Exception e){
//
//            }
//        }




}
