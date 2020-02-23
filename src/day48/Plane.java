package day48;

// We build relationship between class and interface
// using implements keyword ( compared to extends keyword for class to class)
//it will build a IS-A Relationship
//we can say Plane IS-A Flyable|inheritance
//since we are inheriting an abstract method
// we need to provide body by overriding it
public class Plane implements Flyable {

    String name;
    int capacity;
    int speed;
//  public static final boolean HAVE_WING = true;

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    // bad idea but just for demo purpose
    public static void main(String[] args) {

        Plane p1 = new Plane();
        p1.fly();
        // anything static , we can access in static way
        //including the static field of interface
        System.out.println(Flyable.HAVE_WING);
        // if we have static field in this class(we have because we inherited Flyable)
        // can we access them in static method main directly? YES
        System.out.println(HAVE_WING);

    }

    /**
     *
     * create an interface called Bouncible
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



}


