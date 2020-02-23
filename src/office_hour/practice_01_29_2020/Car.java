package office_hour.practice_01_29_2020;

import java.util.Arrays;

public class Car {

    String brand;
    //Car has Engine, so we are using Engine as instance variable data type
    Engine e;
    //I want car object has passenger names attracted to it
    String[] passengers;

    public static void main(String[] args) {

        Car c1 = new Car();
        // there is 2 way to create String object
        //and we are using new keyword by choice
        c1.brand = new String("Toyota");//"Toyota";
        c1.e  = new Engine("V6",270);

        c1.passengers = new String[]{"Ziyoda","Aykokul","Mehtap","Rauf"};

        System.out.println("c1 = " + c1);

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
