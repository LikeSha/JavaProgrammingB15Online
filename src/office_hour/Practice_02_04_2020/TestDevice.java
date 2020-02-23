package office_hour.Practice_02_04_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestDevice {

    // Device-->Samsung--.WaterProof
    //          Iphone

    public static void main(String[] args) {
       // references are d, s, i
        // actual objects are new Device(), new Samsung(), New Iphone()

       // Device d = new Device();

         // what is polymorphism ?  2 types ploymorphism  1, Dynamic == method overRiding
          //                                              2, static == method overLoading
        // reference(d2) type is parent class/Interface
        //object(new Samsung())  type is child class
        // this is Polymorphism

        // reference type decides what to access

        Device d2 = new Samsung();//polymorphism
        //d2 does not have access any variable or method which created in Samsung
        d2.price = 888;
        d2.size = 6;
        //d2.takePicture(); // parent CAN NOT use child class method !!
        //d2.color // parent CAN NOT use child class method !!

        WaterProof w = new Samsung();// waterProof is on the top .so
        //  no method can be used in child class
        // w does not have access for any variable or methods
        // in Device or Sumsung


        System.out.println("====d3===========================");
        // d3 type is device == d3 can have access ONLY Device class variables and methods
        Device d3 = new Iphone();//polymorphism
        d3.size = 8;
        d3.price = 374;
        d3.call(); // this method will be called from Device
        // you can not use anything from Iphone
        // d3 after you have call() in Iphone class ,it calls from



       // List<String> l = new ArrayList<>();


        System.out.println("====i2========================================");
        Iphone i2 = new Iphone();
        i2.price = 1000;
        i2.size = 5;
        i2.platform = "IOS";
        i2.call(); // calling with device  after write call() in Iphone class, this method will

        Samsung s = new Samsung();
        s.takePicture();
        s.price = 999;
        s.size = 7;
        s.color = "Black";


        s.call(); // I can use call();with Samsung because Samsung and Device are IS-A relationship
        s.sendMessage();

        System.out.println("=======================================");
        Iphone i = new Iphone();
        i.call();
        i.sendMessage();


    }

}
