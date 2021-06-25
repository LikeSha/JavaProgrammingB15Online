package InterviewsCodeKnowledge;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line
        //                01234567
        // for example : Gokyuzum
        /*
          Go  01
          ky  23
          uz  45
          um  67
           */

        String name = "Gokyuzum";
        int charCount = name.length();
        int lastCharIndex = charCount-1 ;

        for (int i = 0; i <= name.length() - 2; i++) {
            System.out.println(name.substring(i,i+2));
        }
    }
}
