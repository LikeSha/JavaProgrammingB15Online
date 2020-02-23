package day41_AfterSchoolPractice;

public class TVStore {

    public static void main(String[] args) {


        TV t1 = new TV();
        t1.name = "Sumsun";

        System.out.println("t1 = " + t1);
        t1.turnOn();
        t1.setCurrentChannel(12);
        t1.setCurrentChannel(112);

        System.out.println(t1.getCurrentChannel());
        t1.trunOff();

        System.out.println("t1 = " + t1.toString());
    }
}
