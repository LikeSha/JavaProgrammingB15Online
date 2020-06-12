package InterviewsCodeKnowledge;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        // Java Day 19 class

        // THIS IS VERY VERY POPULAR QUESTION
        // from 1--100  print out all the numbers can be divided by 15 without remainder
        // TASK 2 :
        // from 1--100 count how many numbers can be divided by 15

        // TASK 2 is below :

        int count = 0 ;

        for (int i = 1; i <=100 ; i++) {
            if( i % 15 ==0 ){
                System.out.println(i);
                ++count; // count = count + 1; count +=1;
            }
        }

        System.out.println("count = " + count);

        System.out.println("-----------------------------------------------------------");

        // Task 3 :
        /// given a string with value
        // find out how many "a" showed in this String

        String name = "Esra Fidan";

        int countOfA = 0 ;

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'a'){
                System.out.println("Found a ");
                ++ countOfA;
            }
        }

        System.out.println("countOfA = " + countOfA);




    }
}
