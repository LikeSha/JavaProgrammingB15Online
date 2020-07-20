package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("honeiP 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );
        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count " + productLst.size());

//         * Task 1 : print only items name
//        String itemDetail =  "honeiP 6s,449,18.71";
//        System.out.println("item name = " + itemDetail.split(",")[0]);
//        System.out.println("item price = " + itemDetail.split(",") [1]);
//        System.out.println("item monthly = " + itemDetail.split(",") [2]);

        // This is for each loop version for getting each product name
        System.out.println("------task 1 for each loop version for getting each product name----- ");
        for(String eachProduct : productLst){
            // we get each product , then we split by comma to split into 3 parts
            //and get first part of 3-->product name
            String namePart = eachProduct.split(",") [0];
            System.out.println("eachProduct name = " + namePart);

        }
        // This is for loop version for getting each product name
        System.out.println("------task 1 for loop version for getting each product name----- ");
        for (int i = 0; i <productLst.size() ; i++) {
            // we get each product by using get method of ArrayList in for loop
            //then we split by comma to split into 3 parts
            // and get first part of 3 --->> Product name
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("namePart = " + namePart);
        }

//         * Task 2 : print all the prices more than 500
        System.out.println("---------task  2 print all the prices more than 500 ----------- ");
        for( String eachProduct:productLst){

            double price = Double.parseDouble(eachProduct.split(",")[1]);

            if(price > 500){
                System.out.println("price = " + price);
            }

        }

//         * Task 3 : print average price
        System.out.println("-----task 3 print average price ----------------");

        double sum = 0 ;
        double average = 0 ;

        for( String eachProduct:productLst){

            double price = Double.parseDouble(eachProduct.split(",")[1]);

            sum = sum + price ; // sum += price ;

        }
        average = sum/productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        //         * Task 4 : print all the items name that has less than 20$ monthly payment.
        System.out.println("-----task 4 print all the items name that has less than 20$ monthly payment----  ");

               for(String eachProduct:productLst){

                   String name = eachProduct.split(",")[0];
                   double monthly = Double.parseDouble(eachProduct.split(",")[2]);

                   if(monthly <20){
                       System.out.println(name + " " + monthly);

                   }

               }
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        System.out.println("---task 5 Print the monthly payments of all the iPhone no matter what model----");

               for( String eachProduct : productLst){

                 String name = eachProduct.split(",")[0];
                 double monthly = Double.parseDouble(eachProduct.split(",")[2]);

                 if(name.contains("iphone")){
                     System.out.println("name" + " " + monthly);
                 }
             }

//         * Task 6 : Print all information about most expensive items.
        System.out.println("----task 6 print all information about most expensive item----");
               // assume first item price is max price before comparing
          double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]) ;
               int maxPriceIndex = 0 ;
        for (int i = 0; i <productLst.size() ; i++) {
            // this is how we get each price part of items details
            String priceStr = productLst.get(i).split(",")[1];
            //this is how we turn the priceString into double data type
            double price = Double.parseDouble(priceStr);
            if(price>maxPrice){
                maxPrice = price ;
                maxPriceIndex = i ;
            }

        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("expensive item detail = " + productLst.get(maxPriceIndex));
      // String maxPriceItem = "" ;
        //               for( String eachProduct : productLst){
//
//                   double price = Double.parseDouble((eachProduct.split(",")[0]));
//                   if(price > maxPrice){
//                       maxPrice = price ;
              //         maxPriceItem = eachProduct ;
//                   }
//
//               }
 //          System.out.println( "maxPriceItem = " + maxPriceItem);

//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println("---task 7 update dayson price to 80% off---------");

       // System.out.println(productLst.contains("Dyson"));// false
       // System.out.println(productLst.indexOf("Dyson")); // -1
      //  System.out.println(productLst.startsWith("Dyson")); // compiler error
         int dysonIndex = 0 ;  // there is only one Dyson
        for (int i = 0; i <productLst.size() ; i++) {

            if(productLst.get(i).startsWith("Dyson")){
                dysonIndex = i ;
            }

        }
        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productLst.get(dysonIndex);
         String name = dysonDetails.split(",")[0];
         double price = Double.parseDouble(dysonDetails.split(",")[1]);
         double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
         dysonDetails = name + "," + price*0.20 + "," + monthly *0.20 ;

        System.out.println("dysonDetial.s = " + dysonDetails);
        productLst.set(dysonIndex,dysonDetails);
        System.out.println("productLst = " + productLst);

//         * Task 8 : Count the items prices more than average price.
        System.out.println("----task 8 count the itme prices more than average price----");

        int cnt = 0 ;
        for( String eachProduct : productLst){

            double pricec = Double.parseDouble(eachProduct.split(",")[1]);
            if(pricec > average ){
                ++cnt ;
            }
        }
        System.out.println("all the items with prices more than average price = " + cnt);
//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.

        System.out.println("---task 9 remove all the items has more than average price----");

        for (int i = 0; i <productLst.size() ; i++) {
            double pricec = Double.parseDouble(productLst.get(i).split(",")[1]);
            if(pricec > average ){
                productLst.remove(i);
                --i;
            }
            System.out.println("productLst count after removing = " + productLst.size());
            //You may aslo store all the item with more than average into another list
            // then use remove all method : prodcutLst.removeAll(newListHere)

            /**
             * for (int i = productLst.size() - 1; i >= 0; i--) {
             *     double price = Double.parseDouble(productLst.get(i).split(",")[1]);
             *     if (price > average)
             *         productLst.remove(i);
             * }
             */

        }


//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :

        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>() ;

        for( String eachProduct:productLst){

            // store the name part into itemName
            String names = eachProduct.split(",")[0] ;
            itemNames.add(names);
            // store the name price into prices list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            // store the name monthlyPart into monthlyParts list
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);


        }

        System.out.println("itemNames =" + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);
    }
}
