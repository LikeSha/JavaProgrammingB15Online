package office_hour.Practice_02_12_2020MT;

public class ExceptionsPractice {

    public static void main(String[] args) {


        // the order must be subclass to parent class order , if you use parent class in the beginning ,then you can not use
        // child class to catch for the next statement .

        try {
            //   System.out.println(9/0);

        } catch (IndexOutOfBoundsException e) { // if you use this IndexOutOfBoundsException class in the first line ,
            // the next line（catch statement) you can not use his child class ex :ArrayIndexOutOfBoundsException
            System.out.println("Exception is handled");

        } catch (ClassCastException e) { //paraten class can handle child class
            System.out.println("class cast exception is handled");

        } catch (ArithmeticException e) {
            System.out.println("Arithmatic exception is handled");

        } catch (IllegalStateException e) {
            System.out.println("Illigal State exception");

        }


        System.out.println("Test Completed");

        // catch(ArrayIndexOutOfBoundsException e){
        // sout();                                            this is good ！ but if you up side down the order of this code, it IS WRONG!
    // }catch(IndexOutOfBoundsException e) { //
        // sout();

        // the order must be subclass to parent class order , if you use parent class in the beginning ,then you can not use
        // child class to catch for the next statement .

        // Catch（Exception){
        // sout()：            ---》 YOU CAN NOT USE NEXT CATCH STATEMENT IF YOU USE EXCEPTION CLASS FIRST !　he is parent class !



    }

}
