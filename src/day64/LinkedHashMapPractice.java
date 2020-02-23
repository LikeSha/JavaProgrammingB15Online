package day64;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {
        // Use LinkedHashMap if you want the insertion order ( what order it original is ,the print exactly as that order ,no change)
        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap); // LinkedHashMap the only you need to know is
                                            // it keeps in order

        // FOR HashMap : no order at all ,whatever order java want to print out
        // this is the ONLY DIFFERENCE between LinkedHashMap and HashMap


    }
}
