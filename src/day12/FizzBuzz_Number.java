package day12;

public class FizzBuzz_Number {

    public static void main(String[] args) {

        // TASK 3 :
        //Given a number
        // If this number can divided by 5 without remainder lets print it Fizz number
           // For example . 5 , 15 , 25 ,100
        //If this number can divided by 3 without remainder lets print it Buzz number
          // For example 3, 15 ,9,27
        //If this number can divided by both 3 and  5 lets print it FizzBuzz number
          // For example  15, 45, 30 ,90

        // If no match , just say NOT MY NUMBER !!!

         int myNumber = 45 ;
         if(myNumber%5 == 0 && myNumber%3 == 0){
             System.out.println("FizzBuzz number");
         }else if(myNumber%5 == 0){
             System.out.println("Fizz number");
         }else if(myNumber%3 == 0 ){
             System.out.println("Buzz number");
         }else {
            System.out.println(" NOT MY NUMBER !!!");
        }
           // this case very important ! pay attention the logic behind it , you must put fizzbuzz
           // first to test , if you first test "fizz " or " buzz " , if it match , it will never
           // have chance to move down  to check condition " fizzbuzz"  !! because program test from
           // top to last ! Therefore ,
           // check the most complicated condition FIRST !

    }
}
