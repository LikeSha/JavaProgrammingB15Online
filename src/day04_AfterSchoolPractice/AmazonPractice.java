package day04_AfterSchoolPractice;

public class AmazonPractice {

    public static void main(String[] args) {
        // Extract some data out of this sentence and store it into a variable
//         String prodcutName  Amazon Fire
//         String model   HD
//         int version    8
//         float price    79.99

//         I saw Fire HD8 hands-free with Alexa for $79.99

        String productName = "Amazon Fire";
        String model = " HD8";
        int version = 8;
        float price = 79.99f;
        char dollar = '$';

        System.out.println(" I saw " + productName +  model + " hands-free Alexa for"+ '\t' + dollar + price  );


    }
}
