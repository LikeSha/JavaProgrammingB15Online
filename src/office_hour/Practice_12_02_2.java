package office_hour;

public class Practice_12_02_2 {

    public static void main(String[] args) {
        //             0123456789
        String name = "Arya Stark" ;

        // getting each character using charAt(index)
        //generate sequential number 0-->10

        //is there any chance that while loop does not execute
          // ANSWER : the condition is not true , or say condition is false

        int x = 0 ;
        while(x < name.length()){
            System.out.println("index: " + x);
            System.out.println( name.charAt(x));
            ++x ;

        }

 //       while ( x < 15){
 //           System.out.println("WOLA@");
 //       }
//        System.out.println("THE END");



    }
}
