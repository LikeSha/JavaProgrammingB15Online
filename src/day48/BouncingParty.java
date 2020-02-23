package day48;

public class BouncingParty {

    public static void main(String[] args) {

        Kangaroo b1 = new Kangaroo("coco", 10);
        System.out.println("b1 = " + b1);
        b1.bounce();

        System.out.println(Bouncible.GRAVITY);

        Kangaroo k1 = new Kangaroo("Coco",10);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.eat();
        k1.carryChildInThePocket();
        k1.kickBox();

        Ball b2 = new Ball("Round","Blue");
        System.out.println("b2 = " + b2);
        b2.bounce();



    }
}
