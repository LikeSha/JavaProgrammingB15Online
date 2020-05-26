package RebootCamp1.day4_OOP;

public interface Teachable {

    static final int size = 20; // static final grey color is because interface by default
                               // can only have static final variable

    void teachMath();

    public static void print(){
        System.out.println(5);
    }

    public default void print2(){
        System.out.println(10);
    }
}
