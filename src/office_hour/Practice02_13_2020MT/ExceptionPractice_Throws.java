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
}
