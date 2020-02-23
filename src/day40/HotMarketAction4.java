package day40;

public class HotMarketAction4 {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayOfferDetails();

        String o1Str = o1.toString();// since o1.toString() return the value ,so I can save it
        System.out.println("o1Str = " + o1Str);

        System.out.println(o1.toString());// I can direct call this method ,or store first then call( as above )
        // if you directly print out object  it will call toString() method automatically
        System.out.println(o1); // this is what is automatically happening behind the scene o1.toString



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
        //


    }
}
