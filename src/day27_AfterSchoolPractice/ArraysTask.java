package day27_AfterSchoolPractice;

public class ArraysTask {

    public static void main(String[] args) {

        // write  a program that can find the minimum numbers from an
        // int array  // find out largest and minimum number is interview
        //question !

        // Task 01 :
        // write a program tha can find the minimum number for an array
        // DO NOT USE SORT METHOD

        int[] scores = {1210,23817,654,482,1231,224,556,19,1,761,3,97};
        int min = scores[0] ;
        for (int i = 0; i <scores.length ;  i++) {
            if(min > scores[i]){
                min = scores[i] ;
            }

        }
        System.out.println("mininum number = " + min);

      // find out the second minimum number out ;
        System.out.println("=======below is the second minimum number========");

         int secondMin = scores[0] ;
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i] == min){
                continue;
            }
             if( secondMin > scores[i]){
                 secondMin = scores[i] ;
             }
        }
        System.out.println("second Mininum number is  = " + secondMin);

        System.out.println("===below is the third minimum number=====");

        int thirdMin = scores[0] ;
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i] == min || scores[i] == secondMin){
                continue;
            }
            if(thirdMin > scores[i]){
                thirdMin = scores[i] ;
            }
        }
        System.out.println("third Mininum number = " + thirdMin);

    }
}
