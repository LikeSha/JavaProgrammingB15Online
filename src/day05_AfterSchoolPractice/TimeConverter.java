package day05_AfterSchoolPractice;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

       /*

       Task 3 :
       * Create an interactive program to ask user for day count
       * and generate minute that day have
        **/

       /*
       Task 4 :
      /* Create an interactive program to ask user for hourly wage
       * and generate yearly salary
         assume that he works 2080 hours for a year
        **/

       /*
       Task 5 : Grocery Shopping
       * ask user whats the price of tomato and store it
         ask user how many tomato you want to buy and store it
        * ask user whats the price of potato and store it
          ask user how many potato you want obuy and store it
        * ask user whats the price of banana and store it
          ask user how many you want to buy and store it

          generate this example output
          You got 3 tomato price is 2.99 and total-->>
          You got 5 potato price is 3.49 and total-->>
          You got 2 banana price is 1.99 and total-->>

          Your grand total for this shopping is ???

        **/

       // Task 3 :


        Scanner scan = new Scanner(System.in);

        System.out.println("How many days you spend on study per month ? ");
        int daysInStudy = scan.nextInt();
        int minutesPerDay = 60 * 24;
        System.out.println(" I spend " + daysInStudy + " days on study per month ." + " In another word : its equal to" + "\t"+(minutesPerDay * daysInStudy ) + " minutes " );

        // Task 4 :

        System.out.println(" What is your hourly wage ? ");
        int hourlyWage = scan.nextInt();
        System.out.println(" Your hourly wage is " + hourlyWage);

        System.out.println("How many hours you work per year ? ");
        int workinghoursPerYear = scan.nextInt();
        System.out.println(" You work " + workinghoursPerYear + " hours per year, Your yearly income is  " + "$" + hourlyWage  * workinghoursPerYear + " per year");

        // Task 5 :

        System.out.println("How much per pound for tomato price ?");
        double tomatoPricePerPound = scan.nextDouble();
        System.out.println("You said tomoto price is " + "$" + tomatoPricePerPound + " per pound .");
        System.out.println("How many pound do you want ?");
        int tomatoCount = scan.nextInt();
        System.out.println("You said you want to buy "  +  tomatoCount +  "pound tomato .");
        double totalTomatoPrice = tomatoPricePerPound * tomatoCount;
        System.out.println("Your total price for tomato is " + "$" +  totalTomatoPrice );

        System.out.println("How much per pound for potato price ?");
        double potatoPricePerPound = scan.nextDouble();
        System.out.println("You said potato price is " + "$" + potatoPricePerPound + " per pound .");
        System.out.println("How many pound do you want ? ");
        double potatoCount = scan.nextDouble();
        System.out.println("You said you want to buy " + potatoCount + " pound potato ");
        double totalPotatoPrice = potatoPricePerPound * potatoCount ;
        System.out.println("Your total price for potato is " + "$" + totalPotatoPrice);

        System.out.println("How much per pound for banana price ? ");
        double bananaPricePerPound =scan.nextDouble();
        System.out.println("You said banana price is " + bananaPricePerPound + "per pound ");
        System.out.println("How many pound you want ? ");
        double bananaCount = scan.nextDouble();
        System.out.println("You said you want to buy " + bananaCount + " pound banana .");
        double totalBananaPrice = bananaPricePerPound * bananaCount ;
        System.out.println("Your total price for banana is " + "$" + totalBananaPrice);

        System.out.println("Your total price comes to " + (totalTomatoPrice + totalPotatoPrice + totalBananaPrice ) +
                " Thank you for shopping with us. Have a nice day !");

        // WAKE UP TASK :
        // Create a program to calculate the final discounted price of an item
        // Create 3 variables called regularPrice , sale price and discountPercentage
        // Ask user question using scanner for regularPrice and discountPercentage
        // Calculate sale price suing above information
        // For examle : 80 regular price , 0.2 for discount, salePrice-->>64
        // Print out : regular price is 80, discount is 0.2 and your got deal for $64


    }
}
