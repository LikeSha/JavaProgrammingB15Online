package day49;
//TASK :
//        *      Create an Interface called Autonomous
//        *         it has a single abstract method
//        *            selfDrive()
//        *
//        *      Create an abstract class called Vehicle
//     *         it has 1 field
//             *            brand
//             *         add a constructor to set the field
//             *         abstract method start();
//        *
//        *         non-abstract method instance method
//        *            foForward()
//        *
//        *       Create a concrete class called Tesla
//     *          add instance field horsePower as int
//             *
//             *       Tesla extends Vehicle and implements Autonomous
//             *
//             *           add constructor to set all fields
//             *           implement all abstract methods
//        *           add toString methods
//        *
//        *       Create main method to test your code
//        *
//        *       OPTIONALLY : Create Chargable interface that have charge method let Tesla implements Chargable
public interface Autonomous {

    public abstract void selfDrive();
}
