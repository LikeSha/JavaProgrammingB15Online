package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    // in interview ,they wanna see your logic , for example ,if they ask you to searching something
    //  or " give me the location of something " , the answer is : those searching issue
    // should be done in plain loop

    public static void main(String[] args) {


        // Array class ia a class coming from java.util package
        // it has a lot of pre-built method to work with array object (when you say method ,it means
                                   // there are a lot of actions you can take )
        // for printing the content of the array
        //toString--->> Arrays.toString(yourArrayHere)
        // This method will give you string representation of any type of array
        // the result will look -->>[item1, item2, item3,item4,...lastItem]

        String[] superHeros = {"Superman" , "Batman" , "Wonder Woman" , "Aquaman" , "Cyborg" ," Flash"} ;
        //System.out.println(superHeros);
        System.out.println("Arrays.toString(superHeros)   result");
        System.out.println(Arrays.toString(superHeros));
       // saving the string result into variable and print
        String SuperHerosAsString = Arrays.toString(superHeros) ;
        System.out.println("SuperHerosAsString  result :   ");
        System.out.println(SuperHerosAsString);

        // how do we get first character of superHersAsString variable
        System.out.println("superHerosAsString. charAt(0)  result :  ");
        System.out.println(SuperHerosAsString.charAt(0));// [ is a part of string.because that is what you
        // get out of this "toString" method.toString method give you a String representation out of your
        // Array in what format ? in this format[ sdo, doair,...]  comma inside [] ,this is a string
        // this is how you can get the result .
        System.out.println("---------------------------------------------");

        int[] numbers = {10,44,55,3,78} ;
        System.out.println("Arrays.toString(numbers) RESULT");
        System.out.println(Arrays.toString(numbers)); // this is what I want to see inside this array what are they

        System.out.println("----------------------------------------------");
        // create an double ( data type) array of 3 items ; and put 3 value
        // get a string representation out of this array and save it as priceString
        //print each and every character in this String in this format
        //character at index 0 is : yourCharacterHere
        //character at index 1 is : yourCharacterHere and so on all the way till last

        double[] prices = {195.87, 983.71, 3590.35};
        System.out.println(Arrays.toString(prices));
        System.out.println("Arrays.toString(prices) result" +Arrays.toString(prices) );
        //since the method give you back a string representation of array object
        //in this format [ first Item, secondItem,thirdItem....lastItem]
        // I can save it into String variable

        String pricesString = Arrays.toString(prices) ;
        System.out.println("PricesString = " + pricesString);

        // we are looping over a String not an array so we stop after at last character finishes
        for (int i = 0; i < pricesString.length() ; i++) {
            System.out.println("character at index " + i + " is " + pricesString.charAt(i));

        }

        // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE !



        // for sorting an array in ascending order
        //sort --->> Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals --->> Arrays.equals(firstArray,secondArray)







    }
}
