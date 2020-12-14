package InterviewsCodeKnowledge;

public class NestedLoopMultiVersion {

    public static void main(String[] args) {

        // nested for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(); // this two lines of code is looping rows

            for (int j = 0; j < 3; j++) {
                System.out.print("|Row" + i +"-Column" + j);// this two lines of codes is looping columns
            }
        }




    }
}
