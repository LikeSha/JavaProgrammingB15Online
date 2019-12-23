package day21;

public class BreakContinue {


    public static void main(String[] args) {


        for(int x = 1 ; x <= 5 ; x ++){

            System.out.println(x);
            // this below is pointless ( if(x==5){
            //                         }
             //                           break ;
            // after the 5th iteration
            // the loop will stop by itself
            // no point doing this
 //           if(x==5){
 //               break ;
//            }

             continue; // this line is useless because above it already break, continue at the
                       // last line is useless, this is pointless because after each iteration
                       // it's going to next iteration anyway !

        }










    }
}
