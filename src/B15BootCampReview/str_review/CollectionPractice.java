package B15BootCampReview.str_review;

import java.util.ArrayList;
import java.util.List;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();//generic something means <>
        //generic type is to compiler
        // generic is the type we specify certain ......go google it
        // Array doesn't support generic ,ArrayList support generic

        lst.add(12);
        lst.add(2);
        lst.add(7);
        lst.add(6);
        lst.add(18);

        // remove all the numbers above 10 :
        // we can use iterator

        // the coolest way ,also fastest way is calling removeIf() method
        //it accepts type of predicate (predicate is interface)
        lst.removeIf( num-> num>10 );//lamda expression

//        System.out.println(lst);// lst.soutv + Enter

        lst.forEach( num-> System.out.println(num));


    }
}
