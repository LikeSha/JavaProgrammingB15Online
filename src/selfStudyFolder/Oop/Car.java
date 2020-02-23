package selfStudyFolder.Oop;

public class Car {

    // very famous interview question : can we override static method ? BIG NO !!!!!!!!!!!!
    // instance method CAN NOT OVERRIDE STATIC METHOD !!

    //can I overload static method ? of course you can !!!!!

    // Method Hiding
    public void start(){
        System.out.println("Car---start");
    }
    public void stop(){
        System.out.println("Car---stop");
    }
    public void refuel(){
        System.out.println("Car---refuel");
    }
    public static void start(int a){  // this is method overloading with different parameters
        System.out.println("Car---start");
    }
    public static void stop(int b){ // method overloading ,with different parameters
        System.out.println("Car---stop");
    }



}
