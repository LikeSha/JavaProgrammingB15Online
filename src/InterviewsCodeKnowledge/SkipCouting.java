package InterviewsCodeKnowledge;

public class SkipCouting {

    public static void main(String[] args) {

        // skip counting by 3 from 0 till 30
        // 3 6 9 12 15 18 21 24 27 30

        int counter = 0 ;
        while(counter < 30){

            //counter = counter + 3 ;
            counter += 3 ;
            System.out.print( counter + " ");


        }
        System.out.println();
        System.out.println("__________skip county by 2 __________________________________________________________");
        // skip counting by 2
        // starting from 0-100

        for (int i = 0; i < 100; i+=2) {
            System.out.print(i + " ");
        }
         // skip counting by 3
        //starting from 0-100

        System.out.println();
        System.out.println("____________skip counting by 3 ______________________________________________");

        for (int i = 0; i < 100; i+=3) {
            System.out.print(i + " ");
        }

    }
}
