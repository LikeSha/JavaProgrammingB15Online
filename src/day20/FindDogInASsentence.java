package day20;

public class FindDogInASsentence {

    public static void main(String[] args) {

        // given sentence ,find out the location of the dog

        //our approach is
        //doing through the sentence 3 character at a time
        //then if 3 character s happen to be a dog , we print out the index
        //012345678901234567890123456789012345678901234
        //I LIKE Dog, Dogs are cute , Dogs are friendly
        // this is one of repls questions

        String msg = "I LIKE Dog, Dogs are cute , Dogs are friendly";

        int lastCharIndex = msg.length()-1;

        for (int x = 0; x <=lastCharIndex-2 ; x++) {

            String current3chars = msg.substring(x,x+3);// x+3 is because dog is a three character word

           // System.out.println( x + ": " + msg.substring(x,x+3));



            if(current3chars.equals("Dog")){
                System.out.println("Bingo !!! AT " + x);
            }


        }


    }
}
