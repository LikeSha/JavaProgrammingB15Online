package B15BootCampReview.str_review;
// How to crate singleton ?
// 1. create private constructor
//2.create private static field with same datatype as classname
//3. create public method that return the object


// to create a singleton class to make sure have only one object

public class Singleton {

    // first of all : we need to make our constructor private !
    private static Singleton myObj;  // this is private field

    private Singleton(){

    }

    public static Singleton getObject(){
        if(myObj==null){
            myObj = new Singleton();
        }
        return myObj;
    }
}
