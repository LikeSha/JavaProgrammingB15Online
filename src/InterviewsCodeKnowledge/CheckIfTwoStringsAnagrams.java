package InterviewsCodeKnowledge;

public class CheckIfTwoStringsAnagrams {

    /*
    Given two Strings determine if they are Anagrams --> Are built of the same characters
     */

    public static void main(String[] args) {
        // what is our approach ? we gonna use one loop to iterate each character from the first String
        // then we gonna delete them from the second String. that means : at the end, if our
        //second string after deleted is empty, meaning that we deleted the characters that have in the first String
        // second String after deleted is empty = Anagrams, because all the characters in two strings are match.

        String a = "listen";
        String b = "silent";

        a = a.toLowerCase().replace(" ","");
        b = b.toLowerCase().replace(" ","");

        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            System.exit(0);
        }


        for (int i = 0; i < a.length(); i++) {

            b=b.replaceFirst("" + a.charAt(i),"");// this code means : first step we loop string a
            // the first character of a is "l", so we replace "l" in the string b.
            // then we loop second character of string a, which is "i" and replace "i" in the string b......
        }

        if(b.isEmpty()){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }


    }

}
