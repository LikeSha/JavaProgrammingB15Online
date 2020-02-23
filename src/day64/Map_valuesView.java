package day64;

import java.util.*;

public class Map_valuesView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        // in order to get all the values in the map and store it to collection
        //we can use values method from the map and it will return
        // a collection object that contains all the value

        Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices);
        allPrices.remove(1.99); // tomato removed , but banana exist ," first come first serve " first occurrence will be removed
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        List<Double> priceCopy = new LinkedList<>(allPrices);



    }
}
