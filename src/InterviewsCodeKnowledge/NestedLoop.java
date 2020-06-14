package InterviewsCodeKnowledge;

public class NestedLoop {

    public static void main(String[] args) {

        // count from 1 to 5
        // repeat this 3 times

        for( int i = 1 ; i <= 3 ; i++){// nested loop, write inside loop first , then
            // outside loop ,then put entire inside loop into outside loop
            System.out.println("ITERATION : " +i);

            for( int x = 1 ; x <= 5 ; x++){ // this is inside loop print 1-5
                System.out.print(x + " ");
            }
            System.out.println();
        }


    }
}
