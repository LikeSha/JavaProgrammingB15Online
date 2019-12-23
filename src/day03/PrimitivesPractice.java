package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {


        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount  );

        short sheepCount = 300;
        System.out.println("The Sheep count is "  +  sheepCount);

        int catCount = 20 ;
        System.out.println(" The catCount is " + catCount);

        long mileToMoon = 500000L;
        System.out.println(" The mileToMoon is "  + mileToMoon);
        long mileToSun = 10000000L;
        System.out.println(" The mileToSun is "  + mileToSun);

        //----------floating point-------
        //  you must add f at the end of number to indicate this  is f loat data type
        // uppercase lowercase does not matter , but it's mandatory
        float priceOfBanana = 1.99f;
        System.out.println(" The float price of Banana is "  +  priceOfBanana);


        //--------- larger floating point numbers -------
        double priceOfIpad1     = 355.99d;
        System.out.println("The price of Ipad1 is "  + priceOfIpad1);
        double priceOfIpadPro   = 1024.99D;
        System.out.println(" The price of IpadPro is "  + priceOfIpadPro);
        // compiler automatically assume it's a double so it's not required to have d
        // However for good programming habbit , add them always
        double priceOfMac       = 2299.99;
        System.out.println(" The price of Mac is "  + priceOfMac);


        // if you have a whole number by itself , compiler automatically assume it's an int
        // if you have a fractional number by itself , compiler automatically assume it's an double


    }
}
