package day40;

public class HotMarketActions3 {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = false;
        o1.salary = 140000;

        o1.displayOfferDetails();
        o1.turnToFullTime();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayOfferDetails();

        o1.changeAllInfo("Amazon","Virginia",150000,true);
     //   o1.displayOfferDetails();

        // if this guy earn more than 100k
        // move him to Atlanta
        System.out.println("Is it 100k offer ? " + o1.is100kOffer());
     //   boolean result = o1.is100kOffer();
      //  if(result == true){
           if( o1.is100kOffer()){

            o1.changeLocation("Atlanta");
        }
         o1.displayOfferDetails();

           o1.toString();


    }
}
