package day49;

// interface is like a contract , once someone sign the contract he/she will provide all the details that
// he/she must do
// the purpose of Interface is --> implement

// AN INTERFACE IS NOT A CLASS!!!!!
public interface Edible{

    // in interface fields are automatically static final if not defined so
    // public static final field naming convention is ALL-CAPS!!!
    //you can have as many constant as you want

    public static final boolean IS_HUMAN_FOOD = true;

    //If a method with no-body is not defined public abstract , it's automatically public abstract
    void eat();
    public abstract void drink();

    public default void digest(){

        System.out.println("YOU IMPLEMENT THE CODE YOURSELF !!!");

    }//(if I add this last
    // method " public abstract void digest(): " after implement all things ,immediately
    // all implemented class failed ! because you can not
    //change interface, you can only do with it this way :
    //  public default void digest(){})

    // default method was added since java 8 to proved
    // default implementation to not break existing implement
    // classes have option to use it as is
    // or override it according to their own requirements

    // the default method ONLY EXIST IN an Interface !!!!
    // default keyword here IS NOT AN ACCESS MODIFIER !!!!!
    // A default method MUST HAVE BODY !!!!!!!!

    // Interface can only have 4 things : CONSTANT -public static final
    //                                abstract method
    //                                static method
    //                                default method

}
