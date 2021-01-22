package InterviewsCodeKnowledge;

import java.util.HashMap;
import java.util.Map;

/*
Create a method that will accept a String and
be print how many times each characters is found in the String
 */
public class CountLetters {

    public static void main(String[] args) {

               countLetter("apple");
    }

    public static void countLetter(String str){

        Map<Character,Integer> map = new HashMap<>();

        for(int i= 0; i< str.length();i++){

            char key = str.charAt(i);
            if(!map.containsKey(key)){
                map.put(key,0);
            }
            map.put(key,map.get(key)+1);
        }

       // System.out.println(map); //we can print like this ,or we may print nicer as below :
        for(Character key :map.keySet()){
            System.out.println("key: " + key);
            System.out.println("Value: " + map.get(key));
            System.out.println();
        }
    }
}
