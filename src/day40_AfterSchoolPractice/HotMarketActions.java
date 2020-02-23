package day40_AfterSchoolPractice;

import java.util.ArrayList;

public class HotMarketActions {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true ;
        o1.salary = 140000 ;
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000 ;
        o2.isFullTime = true ;
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000 ;
        o3.displayInformation();

        Offer o4 = new Offer();
        // if we don't assign values for instance filed/variable
        // we get default value
        // for primitive numbers : 0 or 0.0
              // boolean : false
             // char  : ''
        // for any reference types :
                 // null
        o4.displayInformation();

        // save it to a List
        // creating ArrayList of Offer to store multiple offer objects
        ArrayList<Offer> myOffer = new ArrayList<>();
        myOffer.add(o1);
        myOffer.add(o2);
        myOffer.add(o3);
        myOffer.add(o4);

        //System.out.println("myOffer = " + myOffer);// if you print out your object directly
                                                // it will give you hash code
        // use for each loop to find each and every item

        System.out.println("myOffers-----------------------------------------");
        for(Offer each :myOffer) { // Offer in here is your data type

            each.displayInformation();
        }

        System.out.println("myOffers-----for loop----------");

        for (int i = 0; i <myOffer.size() ; i++) {
            //store each item to a variable each
            Offer each = myOffer.get(i);
            each.displayInformation();
            // this is the one shot version
            //myOffer.get(i).displayInformation();
        }


    }
}
