package day36;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

      // create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();


       // C.R.U.D
           //  Create, Read, Update, Delete
        // add item, insert an item ,read item , update the item, remove the item, check the location,

        lst.add(12L); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println("lst = " + lst);

        // Counting items inside ArrayList
        System.out.println("Counting items using lst.size() = " + lst.size());

        // Getting items inside ArrayList object
        System.out.println("First item is : lst.get(0) = " +lst.get(0));

        // TASK : GET THE SUM OF ABOVE ARRAYLIST ITEMS

        long sum = 0 ;
        for (int i = 0; i <lst.size() ; i++) {
            sum = sum + lst.get(i);
        }

        System.out.println("sum = " + sum);

         // TASK : GET THE MAX OF AVOVE ARRAYLIST ITEMS
        System.out.println("-----use for loop----------");

        long max = lst.get(0);
        for (int i = 0; i <lst.size() ; i++) {

            if(lst.get(i)> max){
                max = lst.get(i);
            }

        }

        System.out.println("max = " + max);

        System.out.println("--------use for each loop---------");

        for( long each :lst){
            if(max < each){
                max= each;
            }
        }
        System.out.println("max = " + max);

    }
}
