package day36_AfterSchoolPractice;

import java.util.ArrayList;

public class SumAndMaxOfArrayListItem {

    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();
        lst.add(12L); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        // TASK : GET THE SUM OF ABOVE ARRAYLIST ITEMS
        long sum = 0 ;
        for (int i = 0; i <lst.size() ; i++) {

            sum+= lst.get(i);

        }
        System.out.println("sum = " + sum);

        // TASK : GET THE MAX OF AVOVE ARRAYLIST ITEMS

        long max = 0 ;
        for (int i = 0; i <lst.size() ; i++) {

            if(lst.get(i) > max){
                max = lst.get(i) ;
            }

        }
        System.out.println("max = " + max);

    }
}
