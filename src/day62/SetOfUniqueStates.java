package day62;

import java.util.*;// importing everything under java.util for convenience
import java.util.Set;

public class SetOfUniqueStates {

    //Create a Set of String called states
    // add bunch of states with some duplicate
    // iterate over them using each and every way you know
    //states.forEach(each-> System.out.print(each+" "));

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll((Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL")));

        // any type of collection has size method to count the item
        System.out.println("How many ?? states.size() = " + states.size());

        for(String each  : states){
            System.out.println("each = " + each);
        }


        System.out.println("----------------------usting Iterator method to print each and every out --------------------------");
      // FOR LOOP DOES NOT WORK !!!! NO INDEX !!!!
        // We can use iterator for any type of collection at all time

        //creating iterator
        Iterator<String> stIter = states.iterator();

        while( stIter.hasNext()){
            System.out.println("stIter.next()  = " + stIter.next());
        }

        System.out.println("---------------using for each method ----Lambda!!! method--------------------");

        states.forEach(each-> System.out.println("each state = " + each));




    }
}
