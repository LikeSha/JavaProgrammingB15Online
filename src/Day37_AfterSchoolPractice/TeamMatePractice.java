package Day37_AfterSchoolPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class TeamMatePractice {

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

        teamMates.add("Salik");
        teamMates.add("Muhammed");
        teamMates.add("Toyly");
        teamMates.add("Anasally");
        teamMates.add("Dilxiat");
        teamMates.add("Maiia");
        teamMates.add("Yerkhanat");
        teamMates.add("Ayten Marul");
        teamMates.add("Sayed");

        System.out.println("teamMates = " + teamMates);

        // print first item and last item
        System.out.println("-------print first item--------");
        System.out.println("teamMates first item = " + teamMates.get(0));

        // last item -->> using last index --> size()-1 ;
        System.out.println("-------print last item----------");
        int lastItemIndex = teamMates.size()-1 ;
        System.out.println("lastItemIndex = " + teamMates.get(lastItemIndex));

        // print one by one
        System.out.println("--------print each name -----------");
        for (int i = 0; i <teamMates.size() ; i++) {

            System.out.println("each teamMates = " + teamMates.get(i));

        }
         // print reverse
        System.out.println(" print reverse each name ----------------");
        for (int x = teamMates.size()-1; x >=0 ; x--) {
            System.out.println("each teamMates = " +teamMates.get(x));
        }

        System.out.println("----concat everyone in one string separated by dash---------");

        String result = "";
        for (int i = 0; i <teamMates.size() ; i++) {
            result = result + teamMates.get(i) + "-";
        }
        System.out.println("result = " + result);

        // remove the last dash
        System.out.println("----remove the last dash-----");
        String result2 = "" ;
        for (int i = 0; i <teamMates.size()-1 ; i++) {
            result2 = result2 + teamMates.get(i) + "-";
        }
        System.out.println("result2 = "+result2+teamMates.get(teamMates.size()-1));

        /**
         *  public static  String getSpelledName(String name){
         *          // creating a variable for resulting String
         *          String result = "";
         *          for (int x = 0; x <name.length() ; x++) {
         *              result =  result + name.charAt(x);
         *              // concatenate dash(-) if we are not at the last character
         *              if(x != name.length()-1){
         *                  result = result + "-";
         *              }
         *          }
         *
         *          return result;
         *
         *
         *          public static  String getSpelledName2(String name){
         *          String result = "";
         *          // keep adding dash until right before last character
         *          // then concatenate last character
         *          for (int i = 0; i <name.length()-1 ; i++) {
         *              //this loop will add dash after each character
         *              // until 2nd character from the last
         *              result += name.charAt(i)+"-";
         *          }
         *          // result has everything but last character
         *          // so we need to add last character
         *          return result + name.charAt(name.length()-1);
         *      }
         *
         */

         // print 2 at a time
        System.out.println("--------print 2 items at a time---------");
        for (int x = 0; x <=teamMates.size()-2 ; x++) {
            System.out.println(teamMates.get(x) + " " +  teamMates.get(x+1));
        }

        // print 2 items without repeat names .
        System.out.println("---- // print 2 items without repeat names ------");
        for (int i = 0; i <teamMates.size()-2 ; i=i+2) {
         // if(teamMates.size() %2==0){
            System.out.println(teamMates.get(i) + " " + teamMates.get(i+1));
        //}else{
               //System.out.println(teamMates.get(i) + teamMates.get(i+1) + teamMates.get(teamMates.size()-1));
           }
        System.out.println(teamMates.get(teamMates.size()-1));
    }



}

