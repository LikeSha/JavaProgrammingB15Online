package day49;

// you are building super-sub relationship , IS-A relationship
// a class can only extends one other class
// a class can implements multiple interfaces
public class Burger implements Edible,Juicy{

    //public static final boolean IS_HUMAN_FOOD = true;
//    public Burger(){
//        super();
//    }

    @Override
    //when you override anything you can not make it
    //default ,you have to copy whole thing  // public void eat() ----good
    // void eat()--- not good !
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink Soda");
    }

    @Override
    public void melt() {

    }

    // interface methods must be public ,its requirement
    // DOES INTERFACE HAS CONSTRUCTOR ? BIG NOOOOOOOO!!!!!
    //interface IS NOT A CLASS !!! its interface

}
