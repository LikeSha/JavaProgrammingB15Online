package rebootCamp1.day6_Collections2;

import java.util.ArrayList;
import java.util.Arrays;


public class SortArrayList {

    /*
    Create a method that will accept an ArrayList and sort the ArrayList into ascending order (s -> l).
    Do not sure any ready sort method. -> How will you do the opposite direction (l -> s)?
     */

    public static void main(String[] args) {
         //1,4,4,5,2,3,1
        // 4,1,3,5,2,3,1,0
        //temp = 4
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,4,5,2,3,1));
        System.out.println(sortList(list));

    }

    public static ArrayList<Integer> sortList(ArrayList<Integer> list){

         for(int i = 0; i< list.size(); i++){

             for(int j=0; j < list.size(); j++){

                 if(list.get(i) > list.get(j)){
                     int temp = list.get(i);
                     list.set(i,list.get(j));
                     list.set(j,temp);
                 }
             }
         }

              return list;
    }
}
