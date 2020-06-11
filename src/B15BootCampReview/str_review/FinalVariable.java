package B15BootCampReview.str_review;

public class FinalVariable {

    public static final String BOOTCAMP = " b15 bootcamp " ; // constant
    //CONSTANT : public static final field  the variable name always capital letters

    public static void main(String[] args) {

        final int i = 10;

        /*
        Final variable can not be reassigned
        Final methods can not be overriden
        Final class can not be extended
         */

        /*
        Finally
        and the try catch finally block
        finally block always get executed no matter what exception is thrown
         */
        try{
            System.out.println(4/0);
        }catch(Exception e){
            System.out.println("Caught the fish");
//            System.exit(0); this is the case that it does not go to finally ,you just
               // shut down your program at this point
        }finally{
            System.out.println("finally");
        }

        // what are the different ways to print msgs on the console?
        //
        //o if I cannot System.out, I'll have to look up Logger and LoggerFactory.
        //Also it is useful for debugging purpose and find the rootcause the failure of test case



    }
}
