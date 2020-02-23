package office_hour.Practice_01_22_2020MT;

public class Toyota extends Car {

    @Override // if this annotation undeline is red color ,then
    // java is telling you" you are not override !" , so if you wanna
    // check if you are override sucessfully ,just write this
    // annotation to check
    public void start(){
        System.out.println("Push Button and start");

    }

    public static void main(String[] args) {

        Toyota car1 = new Toyota();
        car1.start();

        Car car2 = new Car();
        car2.start();

        Jeep car3 = new Jeep();
        car3.start();
    }


}
