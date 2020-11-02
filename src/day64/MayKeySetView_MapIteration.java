package day64;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MayKeySetView_MapIteration {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple"));
              // Map view :
               // keySet view , values view, entrySet view
        // How do I store all the keys into a Collection ?
        // what do you think the data type will be to store such collection ?
        //---Set   because keys are unique

        //Map is not iterable so we can not directly iterate over them
        // we can get something iterable out of the map
        // for example keySet view will return a Set<String> and it's iterable


        // we can use keySet() method of Map to get Set of Keys
        Set<String> allNames = groceryPriceMap.keySet();

        for(String eachName : allNames){
            System.out.println("eachName = " + eachName);
            System.out.println(" | value is = " + groceryPriceMap.get(eachName));
        }

    }
}
