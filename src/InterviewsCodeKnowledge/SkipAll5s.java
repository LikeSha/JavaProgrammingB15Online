package InterviewsCodeKnowledge;

public class SkipAll5s {

    public static void main(String[] args) {

        // count 1 to 100
        // skip all the numbers divisible by 5

        //x%5 == 0

        for (int i = 1; i <=100 ; i++) {
            if(i % 5 ==0){
                System.out.println("skip " + i);
                continue;
            }
            System.out.println(i);
        }


        /// without continue statement
        for (int x = 1; x <= 100; x++) {

            if( x %5 != 0){
                System.out.println(x);
            }else{
                System.out.println("SKIPPING " + x);
            }
        }
        // if interview ask you " how do you get out the loop ? one answer is
        // put break condition ( by using if statement inside loop )
        // using continue is not necessary ,can be using if statement with relational operators


    }
}
