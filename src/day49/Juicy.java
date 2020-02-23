package day49;

// Interface can achieve loosely coupling between implementing classes
// for example : when we say flyable
// all the implementing classes like plane ,Insects, Superman..
// can be all Flyable and has nothing to do with each other
//and almost no knowledge about each other : known as loosely coupling
//This is why it's always preferred in design
public interface Juicy {

    public abstract void melt();

    // another type of method Interface can have is :
    //static method, IT MUST HAVE A BODY
    // and it's there to provide some utility methods
    // that does not belong to any class
    //STATIC METHODS of interface ARE NOT INHERITED !!!!!!

    public static void squeeze(){
        System.out.println("static squeezing");
    }
}
