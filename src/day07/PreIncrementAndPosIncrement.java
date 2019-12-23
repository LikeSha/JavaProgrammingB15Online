package day07;

public class PreIncrementAndPosIncrement {

    public static void main(String[] args) {

         /*
        // int score = 10
        // increment and decrement operator ++ -- has two version
        //Pre-increment  ++score
        //post-increment score --

        // pre-decrement --score
        // post-decrement score--



        int apple = 8 ;
        apple++ ;

        System.out.println(apple); // printing the increase value

        //System.out.println( ++apple ); // increasing the value and print the value

        // apple++ , when ++ comes after the variable
        // it's called post increment
        // it will increase the value
        // BUT it will reflect the increase value next time the variable show up !
        System.out.println( apple++);
        System.out.println( apple );

          */

        int score = 50 ;

        System.out.println( ++score); // 51

        System.out.println( score++ ); // 51 and ready to be 52 next time shows up

        System.out.println(score );  // 52

        System.out.println(--score ); // 51

        System.out.println( score --); // still 51 and ready to be 50 next time shows up

        System.out.println( score ); // 50


    }
}
