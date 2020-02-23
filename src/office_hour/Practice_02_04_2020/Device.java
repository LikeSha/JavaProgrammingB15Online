package office_hour.Practice_02_04_2020;

public abstract class Device implements WaterProof {

    /**
     * Polymorphism -->
     *
     * Samsung(Child Class)-->a Device(Super Class)--> WaterProof(Interface)
     */

     int size;
     int price;

     public void call(){
         System.out.println("calling with device...");
     }

     // abstract method

    public abstract void sendMessage();

}
