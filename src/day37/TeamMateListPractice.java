package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {

    public static void main(String[] args) {

        /**
         * Warm up:
         * Create Arraylist of String and store
         * teamMates
         * print one by one
         * print reverse
         * print first last
         * print 2 at a time
         * concat everyone in one string separated by -
         */

         //ArrayList<String> teamMates = new ArrayList<>();
        List<String> teamMates = new ArrayList<>();

        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");

        System.out.println("teamMates = " + teamMates);

        // first item
        System.out.println("Fisrt Item = " + teamMates.get(0));
        // last item --> using last index --->> size()-1
        int lastItemIndex = teamMates.size()-1;
        System.out.println("Last Item = " + teamMates.get(lastItemIndex));

        //print one by one
        for (int i = 0; i <teamMates.size() ; i++) {

            System.out.println("\tItem " +(i+1) +" = " + teamMates.get(i));

        }
        System.out.println("\nALL ITEMS IN REVERSE ORDER :");
        for (int x = lastItemIndex; x >=0 ; x--) {

            System.out.println("\tItem "+ (x+1) +" = " + teamMates.get(x));

        }

         // print 2 items at a time
         // for example : 1-2 , 2-3 , 3-4 , 4-5 , 5-6 ,....
        // if you wanna get 3 names print out , teamMates.size()-3.......
        for(int x = 0; x <= teamMates.size()-2 ; x++){

            System.out.println(teamMates.get(x) + "---" + teamMates.get(x+1));

            /**
             * for (int x = 0; x <= teamMates.size() - 2; x+=2) {
             *     System.out.println(teamMates.get(x)+"---"+teamMates.get(x+1));
             * }
             * this worked with not repeating the names in pairs
             */
        }

           // print 2 items without repeat names .
        System.out.println("\nPrint 2 items at a time without repeating : ");
        for (int x = 0; x <= teamMates.size() - 2; x+=2) {
            System.out.println(teamMates.get(x)+"---"+teamMates.get(x+1));
        }

      // challenge: pair them up by 3
        /**
         * if(x==teamMates.size()-3) {
         *     if (teamMates.size() % 2 == 1) {
         *         System.out.println("\t"+teamMates.get(teamMates.size() - 1));
         *     }
         */

        //concat everyone in one string separated by -
        String result = "";
        for (int i = 0; i <teamMates.size() ; i++) {

            result = result + teamMates.get(i) +"-";

        }
        System.out.println("result = " + result);
        // TODO : REMOVE THE LAST DASH
        /**
         * // concat everyone in one String separated by -
         * String result ="";
         * for (int x = 0; x <teamMates.size()-1 ; x++) {
         *     result+=teamMates.get(x)+"-";
         * }
         * System.out.println("result = "+result+teamMates.get(teamMates.size()-1));
         */

        //TODO : How can we turn a List into a String and Store it ? and manipulated
        String lstToString = teamMates.toString();
        System.out.println("lstToString = " + lstToString);
        System.out.println("lstToString after replacing  = \n\t"
                + lstToString.replace(", ", "-")
                .replace("[", "")
                .replace("]", ""));

    }
}
