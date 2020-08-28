package day49;

public class Tesla extends Vehicle implements Autonomous, Chargeable {

    int horsePower;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

//    public void charge(){
//        System.out.println("default charge," + " you may wanna do on your own");
//    } this is the thing I have but I dont see in this class ! I inherited from Chargeable Interface!
    // I dont override it , I just use it ,I can override it .If I override it ,I can implement my own method.

//    public void goForward(){
//
//        System.out.println("Vehicle is going forward now");
//
//    } this method we inherit from Vehicle abstract class. we have it but we don's see,
//    we didn't override it ,just use as it is.

    @Override
    public void selfDrive() {
        System.out.println("Tesla model " + model + " is self driving");
    }

    @Override
    public void start() {
        System.out.println("Tesla model " + model + " start with electricity");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
