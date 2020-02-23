package day55.association;

import day55.association.Driver;
import day55.association.Engine;
import day55.association.Taxi;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("v6",400);

        Driver d = new Driver("Pdero",123456);
        // print out first character of this driver
       // System.out.println(d.name.charAt(0));

        Taxi t1 = new Taxi(101,en,d);

        System.out.println("t1 = " + t1.toString());

        Taxi t2 = new Taxi(102,new Engine("V8",600),
                          new Driver("John",12345));

        System.out.println("t2 = " + t2);

        // print out driver name and car horse power
        // driver <name> is driving the taxi with horsepower<> on the highway
      // System.out.println(t2.dr.name);

        // how do I store the t2 plate number in a variable x ?
        int x = t2.plateNumber;
        // how do I store the t2 Driver field in a variable y ?
        Driver y = t2.dr;
        // how do I store the t2 Engine field in a variable z ?
        Engine z = t2.eng;

        // how do I get the name of the driver using t2 ?
        System.out.println("Driver name "+ y.name);
        System.out.println("Driver name  " + t2.dr.name);

        // How do I get horse power of this Taxi t2 ?
        System.out.println("Engine hoursepower is " + t2.eng.horsePower);


    }
}
