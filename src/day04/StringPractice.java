package day04;

public class StringPractice {

    public static void main(String[] args) {

        String firstName = "Hasan";
        String lastName = "Sultan";

        String fullName = firstName+ "\t" +lastName;
//        String fullName = firstName+ " " +lastName;

        System.out.println("My first name is " + firstName);
        System.out.println("My last name is " + lastName);

        System.out.println("My full name is " + fullName);

//         String productName Amazon Fire
//         String model HD
//         int version   8
//         float price  79.99

//         I saw Fire HD8 hands-free with Alexa for $79.99


        String productName = " Fire Alexa";
        String model = "HD";
        int version = 8;
        char dollar = '$';
        float price = 79.99f;

        System.out.println(" I saw Fire " + "\t" + model + version + " hands-free with"+productName + " for" + " "+ dollar +price);

    }
}
