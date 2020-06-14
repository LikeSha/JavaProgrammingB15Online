package InterviewsCodeKnowledge;

public class NumberStairCase {

    public static void main(String[] args) {

        // this topic is from java class day 21 , nested loop

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
