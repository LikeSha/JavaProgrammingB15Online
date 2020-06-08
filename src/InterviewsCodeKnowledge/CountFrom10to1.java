package InterviewsCodeKnowledge;

public class CountFrom10to1 {

    // I want to start with 10 , then decrease the value by one
    // So I can get out of the loop
    public static void main(String[] args) {


        //        while( count >=1){

//                     System.out.println(count);
//                     --count ;
        //       }



        int count = 10;

        while (count != 0) {

            System.out.println(count);
            --count;

        }
        System.out.println("the last value of count is " + count);



    }


}

