package office_hour;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice_12_10 {

    public static void main(String[] args) {

        // everying in java represent numbers
        // in string ,appl watemelon .....toyota, honda ...all represent numbers.
        // bmw
        // 012
        String[] cars = {"bmw" ,"wv", "audi"};
        //                 0     1      2
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        for (int carIndex = 0; carIndex <=2 ; carIndex++) {
            System.out.println("Here is your car " + cars[carIndex]);

        }

        //for each loop

        // temporary variable : array name
        for( String carModel : cars ){

            System.out.println("I am done assigning the car " + carModel);
        }

        /**String carModel : cars
         *  carModel = "bmw"
         *   System.out.println("I am done assigning the car " + carModel);
         *  carModel = "wv"   this three lines means "for( String carModel : cars ){"
         *   System.out.println("I am done assigning the car " + carModel);
         *  carModel = "audi"
         *   System.out.println("I am done assigning the car " + carModel);
         *
         *
          */
        System.out.println("===========================");
        int[] ages = {23,43,5,7,87};
        System.out.println(ages[2]);

        System.out.println(ages[3]- ages[2]); // the result is 2
     //                      (7   -    5)
     //                            2
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        for( int ageOfStudent   :   ages){

            System.out.println("this student age is " + ageOfStudent);
            System.out.println("I am done");

        }

        System.out.println(Arrays.toString(ages));
        /*int ageOfStudent = 23
          int ageOfStudent = 43
          int ageOfStudent = 5
          int ageOfStudent = 7
          int ageOfStudent = 87
         */



    }
}
