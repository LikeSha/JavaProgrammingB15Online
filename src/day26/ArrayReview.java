package day26;

public class ArrayReview {

    public static void main(String[] args) {

        /**Array: is an object that can hold multiple items/elements of same type
         * array has fixed size ,once created with certain size it(size) can not be changed
         * we can change the value inside the array
         *
         * Default value for array item if it is empty
         *
         * byte short int long-->> 0
         * float double -->> 0.0
         * char   -------'' empty char
         * boolean ----false
         *
         * what about non-primitive type  : reference type
         *    String --->> null
         *
         *
         * 3 ways to create an array object and assign it to variable
         *
         * first way :
         * int[] myNumbers = new int[4]  4 is item count
         *
         * We assign value using array variable and its index
         * myNumbers[0] = 10 ;
         * myNumbers[1] = 40;
         * myNumbers[2] = 30;
         * myNumbers[3] =7;
         *
         * // 2nd way of crating an array
         * int[] myNumbers = new int []{10,40,30,7} ;
         * // 3rd way
         * int[] myNumbers = {10,40,30,7} ;
         *
         * // how do we ge the size of an array
         * int size = myNumbers.length  ; // 4
         * int lastIndex = size - 1  // myNumber.length-1(this is location ,is index ,not item itself)
         *
         * How do we get last iem of any array
         * I want to save last item into a variable
         * //short lastItemValue = myNumbers[lastIndex] ;
         * //short lastItemValue = myNumber[myNumbers.length-1]
         *
         * // print third item
         * print(myNumber[2] ) ; // 30
         *
         * 1.1 I want to add 1 to the second item value
         * myNumbers[1] = myNumbers[1] + 1 //  40 + 1 = 41 .
         *                                  by doing so ,we changed original value
         *                                  original value gone
         *
         * 1.2 I want to double the second item value
         * myNumbers[1] = myNumbers[1] * 2 ; 41 *2 = 82 original value gone
         *
         * 1.3 I want to assign 3 item value to sum of first and second item.
         * Just change my short array data type to int to avoid issue
         *
          int myNumbers[2] = myNumbers[0] + myNumbers[1]
         *
         * */
         // 1.4 Swap the first item value with last item value
          // int temp = myNumbers[0]
          // myNumbers[0] = myNumbers[3]
          // myNumbers[3] = temp








    }
}
