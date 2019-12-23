package day18;

public class ForLoopIntro {

    public static void main(String[] args) {

        // count 1 to 5

        // for loop () has 3 parts separated by ;
        // first part initialization :
              // it will run only once when you enter the loop
        // second part termination condition ;
              // loop will stop if it's false
              // it will be checked every time
        // third part increment or decrement to change condition eventually
          // it will run after each iteration

        for(int i = 1 ; i<=5 ; i++      ){//++i or i++ doesn't matter ,you will always get the same result

            System.out.println("i = " + i);
            System.out.println("Happy Birthday Roksana Botcieva");


        }

        for( int counter = 10 ; counter>0 ; counter--){

            System.out.println("counter " + counter);

        }



    }
}
