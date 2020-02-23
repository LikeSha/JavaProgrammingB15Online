package day63;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {

    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";

        //System.out.println("getFrequencyMap(str) = " + getFrequencyMap(str)); // this is one shot below are two steps
        Map<String,Integer> theFrequency = getFrequencyMap(str);
        System.out.println("theFrequency = " + theFrequency);

    }

    // WHY THIS IS STATIC ? SO I CAN CALL IT DIRECTLY IN MAIN TO TEST
    // CAN I NOT MAKE IT STATIC ? YES YOU CAN , THEN YOU WILL HAVE TO CREATE OBJECT THEN CALL IT
    // CAN IT BE VOID ? YES YOU CAN USE VOID IF THAT'S WHAT YOU WANT
    // BUT HERE REQUIREMENT IS getFrequencyMap AND RETURN IT TO THE CALLER
    public static Map<String,Integer> getFrequencyMap(String str){

        Map<String,Integer> wordFreMap = new HashMap<>();
        String[] allWords = str.split(" ");

        for(String word : str.split(" ")){

            if(!wordFreMap.containsKey(word)){
                wordFreMap.put(word,1);
            }else{
                // if we come to this point it means we already have the key and value
                // get old count value
//                Integer oldCount = wordFreMap.get(word);
//                // then replace it by incrementing by 1
//                wordFreMap.replace(word,oldCount+1);
                wordFreMap.replace(word, wordFreMap.get(word) + 1);
            }
        }
        return wordFreMap;

    }




}
