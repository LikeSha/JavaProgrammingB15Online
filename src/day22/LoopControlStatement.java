package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

        // Store this sentence in a variable msg
        // I struggle with Java I Like Java I love Java Everything is Awesome!

        //loop through each and every letter
        //1, print every other letter
        //means : skip a letter each time you go through the letter
        // I struggle with -->>Isrgl ih
        // USE CONTINUE FOR THIS TASK
        //2, when you reach second a break loop

        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome!" ;
        int charCount = msg.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        // for (int idx = 0; idx <=charCount-1 ; idx++) {
        for (int idx = 0; idx <charCount ; idx++) {

            if(idx%2 == 1){
                continue;
            }
            System.out.println( idx + " : " + msg.substring(idx,idx+1));
        }


      // Task 2 when you reach letter a break the loop
        for (int idx = 0 ; idx < charCount ; idx++){

            String currentChar = msg.substring(idx,idx+1);

            if(currentChar.equalsIgnoreCase("a")){
                break ;
            }
            System.out.println("currentChar = " + currentChar);


        }

        System.out.println("--------TASK 1 AND 2 COMBINED----------");
        // Task 1 and 2 combined
        for (int idx = 0 ; idx < charCount; idx++){
           //this is the code to skip odd number index letters
            if(idx % 2 ==1){
               continue;// this line will skip the rest and move to next
           }
            // this is storing each character as String
            String currentChar = msg.substring(idx,idx+1);
           // this is checking the currentChar is A or a
           if(currentChar.equalsIgnoreCase("a")){
                break;
            }
            // print out index and the character at that index
           System.out.println(idx + " index "+  "currentChar = " +currentChar);




        }




    }
}
