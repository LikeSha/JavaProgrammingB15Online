package InterviewsCodeKnowledge;

import java.util.HashMap;
import java.util.Map;

public class FrequenceyOfCharacterUsingMapMehod {

    public static void main(String[] args) {

        String str = "AAAABBBBBBACCRDDD";

        //Get the frequency and store into map <Character,Integer>
        Map<Character,Integer> charFrequency = new HashMap<>();

        // looping each character{
        // if we do not have the character , we will enter character in char column
        // and enter the count as 1

        // if we have the character , increase the existing count by 1 and replace the value with new value
        // }

        // THIS IS VERY IMPORTANT INTERVIEW MAP FREQUENCY QUESTION , MUST MASTER THIS KNOWLEDGE POINT .

        for (int i = 0; i <str.length() ; i++) {

            char currentChar = str.charAt(i);

            if(!charFrequency.containsKey(str.charAt(i))){
                System.out.println("Enter for the first time  = " + currentChar);
                charFrequency.put(str.charAt(i),1);
            }else{
                // if we come to this point it means it has already showed up
                // so we update the count with 1 extra than existing count
                System.out.println("Incrementing the count of " + currentChar + " by one and " + " replacing old count " +
                        charFrequency.get(currentChar));
                //replacing the count value by incrementing existing value
                charFrequency.replace(currentChar,charFrequency.get(currentChar) + 1);
            }

        }
        System.out.println("charFrequency = " + charFrequency);


    }

    // use a method to do it like this :

    public static void FrequencyTest(String str){

        Map<Character,Integer> map = new HashMap<>();

        for(Character each : str.toCharArray()){
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }
        System.out.println(map);
    }
}
