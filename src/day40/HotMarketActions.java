package day40;

import java.util.ArrayList;

public class HotMarketActions {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 14000;
        o1.displayOfferDetails();

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 10000 ;
        o2.isFullTime = true ;
        o2.displayOfferDetails();

        Offer o3 = new Offer();
        o3.location = "Amazon";
        o3.company = "Vancouver";
        o3.isFullTime = true ;
        o3.salary = 96000 ;
        o3.displayOfferDetails();

        Offer o4 = new Offer();
        // if we don't assign values for instance field/ variable
        // we get default value
        // for primitive number s 0 or 0.00
          // boolean : false
          // char :  ''
        // for any reference type :
         // null


        o4.displayOfferDetails();

        // creating ArrayList of Offer to store multiple offer objects
        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        System.out.println("myOffers ------------- ");

        for( Offer each : myOffers){

            each.displayOfferDetails();

        }
        System.out.println("myOffers-----for loop------------");

        for (int x = 0; x <myOffers.size() ; x++) {

            // store each item to a variable each
            Offer each = myOffers.get(x);
            each.displayOfferDetails();

           // myOffers.get(x).displayOfferDetails(); this is one shot version

        }



    }
}
