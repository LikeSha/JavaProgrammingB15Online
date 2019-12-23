package day15_AfterSchoolPractice;

public class SubStringPractice {

    public static void main(String[] args) {

        // getting the part of the String out of another String
        //
            //         0123456789012345
        String movie ="lord of The Ring";
        // Sub string will return part of another string
        // staring from beginning index until right before ending index

        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);

        // I want to get the String "of" from this movie

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe= " + wordThe);

        // Get from the second word till last word
        //
        // String movie ="lord of The Ring";

          //              0123456789012345
        // String movie ="lord of The Ring";
        int startingPoint = movie.indexOf(" ")+ 1 ;
        int endingPoint = movie.length();

        System.out.println("second word till last :" + movie.substring(startingPoint,endingPoint));

        // assume we already knew the location of staring point of second word
        // and the ending of the sentence

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("second Word Till Last = " +secondWordTillLast);

        String  wordLordOf = movie.substring(0,7);
        System.out.println("word of Lord of = " + wordLordOf);

        //if you want to stat from somewhere and just get the rest of the String
        //above method will work, however there is even better method
       // if you provide only one parameter to substring method
        // it will just start from that location and get till the end
        String secondToLast = movie.substring(5);

        //with this in mind : TASK
        // YOU KNOW THE INDEX ALREADY
        // reverse lord of the ring -->> ring of the lord

        String wordRing = movie.substring(12);
        String OfThe = movie.substring(4,12);
        String lord = movie.substring(0,4);

        System.out.println("Reverse Lord of the ring : " + wordRing + OfThe + lord);




    }
}
