package day21;

public class DecidingWhenToStop {

    public static void main(String[] args) {

        String msg = "Hello World";

        int charCount = msg.length();

        int n= 1 ; // n = lastCountOfIterator

       // x <= charCount-n ( this is the formular !) // you may change n to any number based on requirement
        // if requirement ask you to find out 3 characters or 5 characters or just 1 character , jut
        // replace n to the requirement number .and using below formular .

        for (int x = 0; x <charCount-n  ; x++) {

            System.out.println(msg.substring(x, x+n));

        }





    }
}
