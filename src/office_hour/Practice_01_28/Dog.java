package office_hour.Practice_01_28;

public class Dog extends Animal {

    //Dog is an animal so I extend Animal class
    String dogName;

    @Override
    public void run() {
        System.out.println("The dog is running");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}
