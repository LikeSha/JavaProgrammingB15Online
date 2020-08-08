package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {

    // String make is not inherited because
    // it has default access modifier ( String make )
    //default access modifier not seen, we don't
    //inherit the thing we don't see.
    // so we can change it to "protected String make" to
    //inherit it
    // private int year is not inherited!
    int mileage;

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.mileage = 39637;
        c1.make = "Toyota Corolla";
        System.out.println("c1.make = " + c1.make);

        System.out.println("c1.mileage = " + c1.mileage);
        c1.setYear(2016);

        System.out.println("c1.getYear() = " + c1.getYear());




    }
}
