package day24;

public class ShoppingWithArray {
    /*Akbar 9:24 AM task channel Dec 10,2019
      Create a String array of 6 items to store groceryItems
      {"apple","banana","grape","strawberry","blueberry","kiwi"}
      Create a float array of 6 float values to store prices
      { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
      assume that the order of grocery Items match the prices in same order.

     */
    public static void main(String[] args) {

        //String[] groceryItems = new String[6];
        //String[] groceryItems = new String[6]{"apple","banana","grape","strawberry","blueberry","kiwi"} ;
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        // print everything in one line with arrow

        int itemCount = groceryItems.length;
        int lastItemIndex = itemCount - 1;
        String lastFruit = groceryItems[lastItemIndex]; // groceryItem[groceryItems.length-1]
        // groceryItem[groceryItems.length-1] this is VERY IMPORTANT FORMULAR TO USE ARRAY LOOKING FOR
        // LAST INDEX ITEM !
        for (String eachFruit : groceryItems) {

            //System.out.println(eachFruit + "-->");
            System.out.print(eachFruit);
            //only print arrow when the fruit is not last item
            if (!eachFruit.equals(lastFruit)) {
                System.out.print("--> ");
            }

            //print everything in one line with arrow and do not put arrow after last one
            //assume you know last item is kiwi
            //if the fruit you are checking is kiwi, just don't add it
            // how to get last item of any array programmatically ?? arr[arr.length-1]


        }
    }
}