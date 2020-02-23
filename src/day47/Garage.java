package day47;

public class Garage {

    public static void main(String[] args) {
       // Abstract class can not be instantiated
       // means we can not create object out of it
//        Car c1 = new Car();
        ElectricCar c1 = new ElectricCar();
        c1.start();
        c1.goBackward();
        c1.goBackward();
        c1.turn("Right");

        // create another sub class of Car called GasCar
        //add a field called gasLevel
        //implements all the abstract method of Car class

        // create GasCar object here
        //call all the methods to test

        GasCar g1 = new GasCar();
        g1.start();
        g1.foForward();
        g1.goBackward();
        g1.turn("Left");


    }


}
