package day35;

import jdk.swing.interop.SwingInterOpUtils;

public class ParsingPractice {

    public static void main(String[] args) {

        // task :
        // Calculate price of your grocery from this sentence
        // String sentence = "I bought 3 tomato and the price was 3.14 each" ;
        // How much is your final checkout price

        // The count is always 3rd word
        /// The price is always at 2nd word from the last

        // LOGIC : split by space , parse count and price ,do calculation

        //                 0   1    2   3     4   5   6     7   8    9
        String sentence = "I bought 3 tomato and the price was 3.14 each" ;

        String[] sentenceSplit = sentence.split(" ");
        int count = Integer.parseInt(sentenceSplit[2]);//parse return primitive
        // or use this way : int count = Integer.valueOf(sentenceSplit[2]); this will also give
        // you same result , valueOf return an object then unbox it and save it into count
        // valueOf return object , parse return primitive

        // getting the last element of any array we use index length-1
        // getting the second last element of any array we use index length-2

        String priceString =  sentenceSplit[sentenceSplit.length-2];
        double price = Double.parseDouble(priceString);

        System.out.println("Total price is " + (count*price));


    }


    }