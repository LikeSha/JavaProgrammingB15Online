package day19;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {

        // THIS IS THE MOST IMPORTANT AND POPULAR INTERVIEW QUESTION!

        // get the sum of numbers from 1-10
        //it's interesting (1+2=+3+4+5+6+7+8+9+10) how much is it ?

        // when we loop from 1 to 10 ,
        //int sum = 0 ;// nothing has been added yet so 0

//      sum = sum + 1      // 1
//      sum = sum + 2      // 3
//      sum = sum + 3      // 6
 //     sum = sum + 4      // 10
//      sum = sum + 5      // 15
//      sum = sum + 6      // 21
//      sum = sum + 7      // 28
//      sum = sum + 8      // 36
//      sum = sum + 9      // 45
//      sum = sum + 10     // 55
//
//      // ----->> sum = sum + i ;
        int sum = 0 ;
        for(int i = 1 ; i <= 10 ; i++){
           // System.out.println(i);
            sum = sum + i ;
            //System.out.println(sum);

        }
        System.out.println(sum);
         // if you put pint out out loop " System.out.println(sum); "
        // it will only print the final result 55
        // if you print " System.out.println(sum); " inside the loop ,it wil overlapping
        // each result by sequence

        // HOMEWORK

        // CREATE A PROGRAM TO ASK USER TWO NUMBERS
        //ADD NUMBERS WITHIN THOSE RANGE

    }
}
