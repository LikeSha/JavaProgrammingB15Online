package day49;

public interface Chargable {

    public default void charge(){
        System.out.println("default charge," + " you may wanna do on your own");
    }
}
