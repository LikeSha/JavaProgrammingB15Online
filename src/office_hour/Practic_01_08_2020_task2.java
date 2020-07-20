package office_hour;

import java.util.ArrayList;
import java.util.List;

public class Practic_01_08_2020_task2 {

    public static void main(String[] args) {

        /**
         * Given List of names with various character count,
         * Remove any name with less than 2 characters
         * and if any name has more than 10 character only keep 10 characters
         * and if it has exactly 5 characters , reverse it
         * Of course , Optionally make a method out of it.
         */



        System.out.println( nameCharsToList("Sumeyye"));

        List<Character> resultList = nameCharsToList("Muge");
        resultList.add('M');
        resultList.add('1'); // we are adding list to the arraylist , not the Char into arrayList
        System.out.println("resultList = " + resultList);



    }

    /**
     * a method that accept String object and turn it into List<Character>
     * @param name
     * @return  List<Character> that contains each character
     */



       public static List<Character> nameCharsToList(String name){

        List<Character> charLst = new ArrayList<>();

           for (int i = 0; i <name.length() ; i++) {
               charLst.add( name.charAt(i));
           }
            return charLst ;
       }

}
