package day63;

import javax.lang.model.SourceVersion;
import java.util.*;

public class GroceryActions {

    // Create a Map of grocery items
    //String, Double

    // add 7 items
    // try to add duplicate keys and see
    // Try to use putIfAbsent

    // print them out in one shot
    // observe if there is any predictable order

    // get the 3rd item value
    // double the price of the first and last item

    // OPTIONALLY: USING THE PREVIOUS CLASS STRING
    // TRY TO GET A charFrequencyMap
    // your map should store character and it's frequency
    // AAABBCDDDD--> {'A'=3, 'B'=2,'C'=1,'D'=4}

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();

        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 0.69);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.put("Fish", 12.99);

        groceryPriceMap.putIfAbsent("Fish",12.99);
        groceryPriceMap.putIfAbsent("Apple",100.0);

        System.out.println("groceryPriceMap.get(\"Tomato\") = " + groceryPriceMap.get("Tomato"));

        System.out.println("groceryPriceMap.size() = " + groceryPriceMap.size());
        System.out.println("groceryPriceMap = " + groceryPriceMap); // NO ORDER WHEN PRITING (RANDOM ORDER)

        // double the price of Apple
      //  groceryPriceMap.replace("Apple",1.89*2);
        groceryPriceMap.replace("Apple",groceryPriceMap.get("Apple")*2);
      //  double newPrice = groceryPriceMap.get("Apple") *2 ;
     //   groceryPriceMap.replace("Apple",newPrice);

        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple"));
        //try to reduce the banana price by 1 dollar
        groceryPriceMap.replace("Banana", groceryPriceMap.get("Banana")-1);
        System.out.println("groceryPriceMap.get(\"Banana\") = " + groceryPriceMap.get("Banana"));

        //remove tomato
        if(groceryPriceMap.containsKey("Tomato")){
            groceryPriceMap.remove("Tomato");
            System.out.println("NO MORE TOMATO");
        }

        System.out.println("groceryPriceMap = " + groceryPriceMap);




    }
}
