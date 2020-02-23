package day64;

import java.util.*;

public class RepresentingTableData {
//
//    Represent Table Data using Collection
//     * so you have easy access to the data
//     * by row number and column name
//     *
//             * start with single row
//     * You want to be able to get the data by its column name
//     *
//             * Map<String,String>\

    // THIS PRACTICE IS TIGHT TO YOUR REAL WORK !! THIS IS SUPER PRACTICAL PROBLEM SOLVING . MUST UNDERSTAND HOW TO USE IT
    // THIS IS USING A LOT IN DATA DRIVEN

    public static void main(String[] args) {

        //for single row
        // I want to get the value by it's column name
        // so I choose Map

        Map<String,String> row1 =  new LinkedHashMap<>();//Map<String,String> row1 =  new HashMap<>();
        row1.put("first_name","Regan");
        row1.put("email","rboichat0@1688.com");
        row1.put("gender","Female");

        Map<String,String> row2 =  new LinkedHashMap<>();//Map<String,String> row1 =  new HashMap<>();
        row2.put("first_name","Carleen");
        row2.put("email","cmorillas1@blog.com");
        row2.put("gender","Male");

        // for one row I used one map
        // but I have many rows!
        // may of Some type ---> List<SomeType>

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        List<Map<String,String>> rowMapList = new ArrayList<>();
        rowMapList.add(row1);
        rowMapList.add(row2);

        System.out.println("rowMapList = " + rowMapList);
        // How do I get 2nd row email column value
        System.out.println("rowMapList.get(1).get(\"email\") = " + rowMapList.get(1).get("email"));

        // Update the Name of 1st row to Hulk
        rowMapList.get(0).replace("first_name","Hulk");
        System.out.println("rowMapList = " + rowMapList);
        rowMapList.get(0).put("first_name","Jane"); // we can use both way to replace the first name of row1 : replace or put
        System.out.println("rowMapList = " + rowMapList);


    }
}
