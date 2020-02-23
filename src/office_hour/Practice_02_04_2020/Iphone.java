package office_hour.Practice_02_04_2020;

public class Iphone extends Device{

    String platform;

    @Override
    public void sendMessage() {
        System.out.println("Hi from Iphone");
    }

    public void FaceTime(){

        System.out.println("Talking to Akbar through face time");
    }

    public void call(){
        System.out.println("calling with Iphone");
    }


}
