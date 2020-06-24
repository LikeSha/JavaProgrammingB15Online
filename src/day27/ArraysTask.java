package day27;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class ArraysTask {

    public static void main(String[] args) {

        // write  a program that can find the minimum numbers from an
        // int array  // find out largest and minimum number is interview
        //question !

        // Task 01 :
          // write a program tha can find the minimum number for an array
          // DO NOT USE SORT METHOD

        int[] scores ={100,897,654,32,1231,224,556,7,1,2,3,4} ;
        int min = scores[0] ;

        for (int i = 0; i <scores.length ; i++) {

            if(scores[i]<min){
                min = scores[i] ;
            }

        }
        System.out.println("minimum number : " + min);

        // find the second minim number

        int secondMin = scores[0] ;
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i] == min){
                continue ;
            }
            if(secondMin > scores[i]){
                secondMin = scores[i] ;
            }
        }
        System.out.println("Second minimum number is : " + secondMin);

            // find out 3rd minimum number
        int thirdMin = scores[0] ;
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i] == min || scores[i] == secondMin){
                continue;
            }
            if(thirdMin > scores[i]){
                thirdMin = scores[i] ;
            }
        }
        System.out.println("Third minimum number is : " + thirdMin);




    }
}
