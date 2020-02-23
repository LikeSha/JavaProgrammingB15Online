package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "Finding Word Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already knew previously " +
                "Do it and find out, Words Words Words";

       // String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";

        String[] allWords = str.split(" ");
        System.out.println("allWords.length = " + allWords.length);

        // we want to solve this using the Map
        // because Map only can have unique key , so we can use it for unique words
        // first create Map object HashMap implementation
        Map<String,Integer> wordFreMap = new HashMap<>();

        // Loop through the word array
        for(String currentWord : allWords){
            // if( ! wordFreMap.containsKey(currentWord) ){
            if(wordFreMap.containsKey(currentWord)==false){
                wordFreMap.put(currentWord,1);

            }else{
//                int newCount = wordFreMap.get(currentWord) + 1;
//                  wordFreMap.replace(currentWord,newCount);
                wordFreMap.replace(currentWord,wordFreMap.get(currentWord) + 1);
            }

        }
        System.out.println("wordFreMap = " + wordFreMap);






        // CHeck if we already have the word in the key or not
        // if we do not have the key , it means we are entering for the first time
        // so the count will be 1 , add using put method
        // else if means we already have it in the key
        // so we get existing count using that key
        // and replace the old count value with new count value by incrementing by 1



    }
}
