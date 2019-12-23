package day32;

public class StringActions {

    public static void main(String[] args) {

        /**Create below static void methods :
         and call them in main method to test.
         reversePrintMyOwnName
         * create a method that has no parameter
         and print your name in reversed order
         reversePrintAnyName---( solution see Day 20 reverseAString topic )---INTERVIEW TOPIC : reverse string !
         * create a method that has 1 String parameter called name
         and print that name in reversed order
         printLastCharacterOfName
         * create a method that has 1 String parameter called name
         and print last character of that name
         printFullNameInformation
         * create a method that has 2 String parameter called firstName,lastName
         and print "Your first name is firstName , Your last Name is lastName
         print " your full name lenth is lengthOfTheFullName"
         compareNameCharacterCount
         * create a method that has 2 String parameter called name1,name2
         if name 1 has more characters
         print " name 1 is longer "
         if name 2 has more characters
         print " name 2 is longer "
         if name 2 has same character count
         print " name 1 and name 2 same character count "
         printAtoZ
         * create a method that has no parameter
         and print A-Z in one line
         printZtoA
         * create a method that has no parameter
         and print Z-A in one line
         printAlphabetInRange
         * create a method that have 2 char as parameters: beginning, ending
         if beginning character is before ending character
         for example beginning A , ending D  -->> ABCD
         if beginning character is after ending character
         for example beginning D , ending A  -->> DCBA
         (edited)
         :heavy_check_mark:
         24
         :white_check_mark:
         2

         Akbar 8:41 PM
         given this previous code we wrote in day4 :
         String productName = "Fire";
         String model = "HD";
         int version = 8;
         float price = 79.99f;
         System.out.println("I saw " + productName + " " + model + version + " hands-free with Alexa for " + price);
         // turn it into a method called printProductInfo ,
         this method  have 4 parameters and print any product information (edited)
         :heavy_check_mark:
         20

         ------------------------------------------------
         given this previous code we wrote in day4 :
         double fahrenheit = 78;
         double celsius;
         celsius = (5.0 / 9) * (fahrenheit - 32);
         System.out.println(fahrenheit + "F equals to " + celsius + "C.");
         // turn it into a method called fahrenheitToCelsius ,
         this method have one double parameter fahrenheit and it calculate the celsius value
         and print the result (edited)
         *
         *
         */
        // reversePrintMyOwnName();
        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tolkun");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");

    }

    public static void reversePrintMyOwnName() {

        String name = "Akbar";
        // start from last character and print toward first character
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

    }

    //printStringWithDashInBetween
    //it has one String parameter called name
    //it will do following in method body
    // task below : print each and every character of a String with dash in between
    // excluding the last one Akbar-->> A-k-b-a-r
    //logic : keep concatenating - after each character
    // when it comes to last character don't add it  ( see solution in main method)
    public static void printStringWithDashInBetween(String name) {
        //String name = "Akbar";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
            //if I am not at least index then I print - ( last location : name.length-1)
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
    }


}
