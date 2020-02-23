package day47;

// this is called concrete class
//concrete class must provide body for all inherited abstract methods
//or it will not even compile
public class GasCar extends Car {

    int gasLevel;


    //implementing an abstract method in subclass
    // means " providing body for the method in sub class"
    @Override
    public void start() {
        System.out.println("This is how gas car start");

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



