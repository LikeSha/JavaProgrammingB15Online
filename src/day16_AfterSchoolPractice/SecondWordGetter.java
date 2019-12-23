package day16_AfterSchoolPractice;

public class SecondWordGetter {

    public static void main(String[] args) {

        // given a sentence with 3 words
        //get the second word

        //steps:
        //second word is between first space and last space

        // getting location of space remind me of indexOf
        //getting String inside another string by beginning and ending index
        //remind me of substring
        //                 0123456789012345678
        String sentence = "You Understand Java" ;
        String secondWord ;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = "+ firstSpaceIndex );

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = "+ lastSpaceIndex );

        System.out.println( sentence.substring(1+1,6));
        secondWord = sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println("secondWord = " +secondWord );






    }
}
