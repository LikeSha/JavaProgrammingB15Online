package RebootCamp1.day1_StringAndLoops;

public class Day1May20Finra {

    public static void main(String[] args) {

        /*
        Write a program that prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN"
         instead of the number and for numbers which are multiple of 5, print"RA" instead of number.
         For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
         */

        for (int i = 1; i <= 30; i++) {
            String print = "";

            if (i % 3 == 0) print = "FIN";

            if (i % 5 == 0) print += "RA";

            if (print.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(print);
            }


        }

        // BELOW IS THE SECOND SOLUTION
        for (int j = 1; j <= 30; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.println(j + "FINRA");
            } else if (j % 5 == 0) {
                System.out.println(j + "RA");
            } else if (j % 3 == 0) {
                System.out.println(j + "FIN");
            }


        }


        // task 2  :
        //Write a program that will count how many times "java" is found in any given String

    }

}