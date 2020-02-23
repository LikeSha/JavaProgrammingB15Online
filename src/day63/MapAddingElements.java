package day63;

import java.util.*;

public class MapAddingElements {

    public static void main(String[] args) {

        //CREATING HashMap objects
         Map<String,Integer> nameAgePair = new HashMap<>(); // first variable is key ,second is value

        //adding elements : put
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muhammed",21);
        nameAgePair.put("Maiia",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Fatih",null);
        nameAgePair.put("Ruhksona",16);
        //The keys of the Map is unique, it does not accept duplicate .
        //here since we already have Zehra--it will just replace the old value with new one
        nameAgePair.put("Zehra",7);

        // How do I only add new items it does not already exists
        nameAgePair.putIfAbsent("Zehra",10);


        System.out.println("nameAgePair = " + nameAgePair); // HashMap no order when print . Hash key word indicate no order

        // getting the size of map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        // how do we get an value according to the key
        System.out.println("Zehra's Age = " + nameAgePair.get("Zehra"));

        // how do I check a key already exist or not
        System.out.println("nameAgePair.containsKey(\"Ruhksona\") = " + nameAgePair.containsKey("Ruhksona"));
        System.out.println("nameAgePair.containsKey(\"Hassan\" = " + nameAgePair.containsKey("Hassan"));

        // Updating the element in the Map using replace
        nameAgePair.replace("Maiia",17);
        System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));
        //why don't we just use put ??? what is the downside ?
        // if I don't have that key , it will just add new one and that's not what we want , we only want to update

        // updating the value only if the old value equals to a specified value
        // update Zehra age to 9 if it was 17
        nameAgePair.replace("Zehra",17,9);
        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));

        //removing Entry by the key
        nameAgePair.remove("Fatih");
        //try not to use get method to check you have the entry or not
        //cecause if you don't have the key you will get null
        //but you will also get null if the value was actually null
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));
        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));

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

        Map<String,Double> groceryNameAndPricePair = new HashMap<>();

        groceryNameAndPricePair.put("Apple",1.99);
        groceryNameAndPricePair.put("Banana",0.59);
        groceryNameAndPricePair.put("grape",2.99);
        groceryNameAndPricePair.put("Tomato",2.39);
        groceryNameAndPricePair.put("Onion",0.89);
        groceryNameAndPricePair.put("Milk",6.99);
        groceryNameAndPricePair.put("Egg",3.99);

        groceryNameAndPricePair.putIfAbsent("Apple",2.99);
        System.out.println("groceryNameAndPricePair = " + groceryNameAndPricePair);







    }
}
