package day48;

//this is how we create an interface
// interface is abstract type just like abstract class
//no object can be crated from it
//it provide guideline for implementing classes
//it's like signing a contract

/*
We can achieve abstraction using :
    abstract class
    interface

    both of them are abstract type and can not create object out of it !!!!
 */
public interface Flyable {

    // an interface can only have public static final field
    public static final boolean HAVE_WING = true;

    // can we have constructor ? ABSOLUTELY NO !!!!!!!

    public abstract void fly();
}
