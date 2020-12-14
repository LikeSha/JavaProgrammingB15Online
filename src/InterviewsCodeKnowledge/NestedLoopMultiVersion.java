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

        // nested for each loop

        System.out.println();

        System.out.println("#########################nested for each loop########################");

        int[] cols = {1,2,3};
        int[] rows = {1,2,3,4};

        for(int row :rows){
            System.out.println();

            for(int column : cols){
                System.out.print("|Row" + row + "-Column " + column);
            }
        }

        System.out.println();

        System.out.println("###############nested while loop#####################");

        int row = 0;
        while(row<5){
            row++;
            System.out.println();

            int col = 0;
            while(col<3){
                col++;
                System.out.print("|Row " + row + "-Column " + col);
            }
        }










    }
}
