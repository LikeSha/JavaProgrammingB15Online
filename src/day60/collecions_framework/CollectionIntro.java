package day60.collecions_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

// a class extends another class
// an interface extends another interface
// a class implements one or more interfaces

public class CollectionIntro {


    public static void main(String[] args) {

        //    List<String> names = new ArrayList<>();

//     //List in Collection interface extends Collection interface
//                //and ArrayList implements List interface
//                // so we can safely say ArraysList
                 // List is the only data structure that have index(order), none of the other data structure has index


        Collection<String> names = new ArrayList<>(); // the higher you go ,the less you can accessible
//        // with this assignment we can access only what Collection interface have
//        // so we can learn what any type of Collection including Set , Queue, List have in common
        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");
        names.addAll(names);// addAll method parameter type is Collection( interface ) so we can pass anything IS-A Collection

        System.out.println("names = " + names);
      //  names.remove("Hasan");
        //removeAll can be used to remove many items at the same time
        //removeAll expect another Collection object
        names.removeAll(Arrays.asList("Hasan"));

        //quickly generating a type of List object and assign it to super type Collection
        Collection<String> toRemoveLst = Arrays.asList("Abdullo");
        names.removeAll(toRemoveLst);

        for(String eachName : names){

            System.out.println("eachName = " + eachName);

        }


     //   System.out.println("First item " + names.get(0));// Collection interface does not have the get method

        // below is a very useful method should know :

        names.forEach( each-> System.out.println("each = " + each) ); // this is how we can use forEach method to print out everything in one shot

        // go to module and watch Java short video  ,very useful




    }






}





/**
 The word Collection everywhere :

 Collection Framework ---> referring entire things , entire topic

 Collection interface -->one interface under the entire Collection Framework

 Collection class--> (it has s at the end ) just like Array and Arrays)
                -->  is a utility class with many static methods
              for example : Collections.sort(your collection object)




 **/