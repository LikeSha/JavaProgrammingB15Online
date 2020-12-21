package day64;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Practice {

    public static void main(String[] args) {

        // SortedMap extends Map and it will keep the sorted order
        // TreeMap is the implementation class

        // sort by natural order of the key data type   ---TreeMap<>();
        SortedMap<String, Double> groceryPriceMap = new TreeMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

        /**
         * LinkedHashMap--- insertion order ( what order it original is ,the print exactly as that order ,no change)
         *          * HashMap----- no order , print auto by java
         *          * TreeMap---- sort by natural order of the key data type
         *          *
         *          * Interview question :
         *          *   difference between HashMap, LinkedHashMap, TreeMap
         *          HashMap default implementation : faster . no insertion order , no sorted order
         *          LinkedHashMap extends HashMap : slightly slower , keep insertion order, no sorted order
         *          TreeMap : SortedMap implementation : slowest , no insertion order, keep sorted order
         *          *
         *          *  difference between HashMap and HashSet  :
         *          *  HashSet is implementation of Set interface , store unique elements per item
         *             HashMap is implementation of Map interface , it store key value pair --keys are unique
         *             they are TWO COMPLETELY DIFFERENT DATA STRUCTURE !!!
         */

        // SortedMap methods :
        /*
              K firstKey();
              K lastKey();
              SortedMap<K,V> subMap(K fromKey, K toKey);
              SortedMap<K,V> headMap(K toKey);
              SortedMap<K,V> tailMap(K toKey);


         */
        // firstKey();
        System.out.println("first key of groceryPriceMap : " + groceryPriceMap.firstKey());

        // lastKey();
        System.out.println("last key of groceryPriceMap : " + groceryPriceMap.lastKey());

        //  view : SortedMap<K,V> subMap(K fromKey, K toKey);
        System.out.println(groceryPriceMap.subMap("Banana","Potato"));

        // view : SortedMap<K,V> headMap(K toKey); everything from beginning to a certain key.
        System.out.println(groceryPriceMap.headMap("Potato"));

        // view : SortedMap<K,V> tailMap(K toKey); getting certain item to all the way the last item
        System.out.println(groceryPriceMap.tailMap("Grape"));

        SortedMap<String, Double> tailView = groceryPriceMap.tailMap("Grape");
        tailView.replace("Grape",4.09);
        System.out.println(tailView);
        System.out.println(groceryPriceMap);

    }
}
