package day21;

public class NumberStairCase {

    /*1234
          1234           // count from 1 to 4
          1234           // count from 1 to 4
          1234           // count from 1 to 4
          1234           // count from 1 to 4


          1             // count from 1 to 1
          12            //count from 1 to 2
          123           //count from 1 to 3
          1234          //count from 1 to 4
          12345         //count from 1 to 5

          do this 5 times

         */

    public static void main(String[] args) {


        for (int x = 1; x <= 10; x++) {


            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");

//
            }
            System.out.println();


            //       for (int y = 1 ; y <= 1 ; y++){
            //           System.out.print(y + " ");
            //       }
//        System.out.println();

//        for (int y = 1 ; y <= 2 ; y++){
            //           System.out.print(x + " ");
            //       }
            //       System.out.println();

            //       for (int y = 1 ; y <= 3 ; y++){
            //           System.out.print(x + " ");
            //       }
            ///       System.out.println();

            //       for (int y = 1 ; y <= 4 ; y++){
//            System.out.print(x + " ");
            //       }
            //       System.out.println();

            //       for (int y = 1 ; y <= 5 ; y++){
            //           System.out.print(x + " ");
            //       }
            //       System.out.println();


        }
    }
}