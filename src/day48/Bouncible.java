package day48;
/*
create an interface called Bouncible
     * it has one constant called
     * gravity as double  and assign 9.81
     * it has 1 abstract methods
     *     abstract void method bounce();
     * create 2 implementing classes of Bouncible
     *
     *   Ball
     *     instance fields
     *       shape as String
     *       color as String
     *       crate constructor to set those 2 fields
     *     implements abstract method from interface
     *     add toString method
     *
     *
     * Kangaroo
     *     instance fields:
     *       name as String
     *       int jumpDistance
     *       add constructor to set above two fields
     *
     *       instance methods:
     *         implements abstract method from interface
     *         toString
     *         eat
     *
 */
public interface Bouncible {

  //ALL THE MEMBERS IN INTERFACE MUST BE PUBLIC
   // THIS IS EXCLUSIVE TO INTERFACE TYPE
    // NOWHERE ELSE YOU GET THIS AT ALL !!!!!!!!!!!
    // if we don't add any part of public static final for the filed
    //all interface fields are automatically public static final

    public static final double GRAVITY = 9.81;

    //every member of interface automatically public
    //if no access modifier is given
    //all the method with no body automatically public abstract
    //void bounce();

    public abstract void bounce();

    public static void main(String[] args) {

        Ball b1 = new Ball("round","green");
        System.out.println("b1 = " + b1);
        b1.bounce();

        System.out.println(Bouncible.GRAVITY);

        Kangaroo k1 = new Kangaroo("Coco",10);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.eat();
        k1.carryChildInThePocket();
        k1.kickBox();

        // SuperType variableName = new SubType(...) ; THIS WORKS


        Bouncible k2 = new Kangaroo("Toto",6);
        k2.bounce();
        //System.out.println("k2 = " + k2);

        // a class extends another class
        // a class implements 1 or more interfaces
        // an interface can not extend or implement a class

        // what we did not cover :
        // an interface can extend another interface to inherit abstract
        // its member
    }
}


