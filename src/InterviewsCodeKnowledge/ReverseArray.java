package InterviewsCodeKnowledge;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

       /*
       reversing array using swap method :

         int[] myNumbers = new int[]{10,40,30,7};
         System.out.println("myNumbers = " + Arrays.toString(myNumbers));

         int temp = myNumbers[0]; // temp now has 10
         myNumbers[0] = myNumbers[3] ; // first item value become 7
         myNumbers[3] = temp ; // last item now become 10

         // the result of swapping -->> reversed array

         // How did I come up with 0     and     3
         // How did I come up with 0+1   and     3-1=2

         //reversing array using swap method
        */

        /*
        this top is very important , also watch JavaProgramming Day 26 class
        ReverseArrayBySwapping
         */

        int[] myNumbers = new int[]{34,65,31,5,56,88,9};

        int size = myNumbers.length ;
        int lastIndex = size- 1 ;
        int middleIndex = size/2;

                             //middleIndex
        for (int i = 0; i < myNumbers.length / 2; i++) {
            int temp = myNumbers[i];
            myNumbers[i]=myNumbers[lastIndex-i];
            myNumbers[lastIndex-i]=temp;
            System.out.println( "after swap " + myNumbers[i] +  " --- " +myNumbers[lastIndex-i]   );
        }

        System.out.println("myNumbers = " + Arrays.toString(myNumbers));

    }
}
