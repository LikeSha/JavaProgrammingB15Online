package day47;

public class ElectricCar extends Car {

    int batteryLevel;

    @Override
    public void start() { // you can not put " abstract " keyword
                       // in an non-abstract class !!
        //even you can ,but abstract method does not have a body!
        System.out.println("This is how electric car start");
    }

    @Override
    public void foForward() {
        System.out.println("going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("turning " + direction);
    }










}
