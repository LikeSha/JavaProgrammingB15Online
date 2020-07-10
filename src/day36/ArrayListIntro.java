package day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {

    public static void main(String[] args) {

        // How do we create a ArrayList Object

        ArrayList<String> lst1 = new ArrayList<>();
        // IT WILL ONLY STORE OBJECT !!! NOT PRIMITIVE
        //ArrayList<int> lst2 = new ArrayList<>();
        // Correct way to create arrayList object that store whole number
        // is to use Wrapper class type . Primitive type is FORBIDDEN!!!

        ArrayList<Integer> lst2 = new ArrayList<>(); // new ArrayList<>();

        ArrayList<Long> lst3 = new ArrayList<>(); // new ArrayList<>();   THESE PART COMPILER DO IT FOR YOU

        ArrayList<Double> lst4 = new ArrayList<>(); // new ArrayList<>();

        // OPTIONALLY YOU CAN CREATE IN THIS WAY
        // List is more general data type compared to ArrayList is more concrete data type
        //ArrayList is one type of list
        // Just like Dog is one type of Animal
        List<String> myLst = new ArrayList<>();

        // COLLECTION framework
        // List :
        // Set : Collection of unique items
        // Map : Collection of Key value pair
        // Queue : Collection of FIFO and LIFO

        /**
         * Interview question :  ArrayList VS Array
         *
         * ArrayList                                                  Array
         *
         * can store only objects                           Can store primitives and objects
         *
         * can be resized                                   Has defined size and CANNOT be changed
         *
         * can be printed directly to display elements      can NOT be printed directly to display elements,Need Arrays.toString() method
         */
    }
}
