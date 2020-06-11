package B15BootCampReview.str_review;

public class FinalizePractice {

    public static void main(String[] args) {

         // finalize method is a method of Object class
        // it will be called before object is garbage collected
        // deprecated , not suggested to use
        System.out.println("Start");
        FinalizePractice f1 = new FinalizePractice();
        FinalizePractice f2 = new FinalizePractice();

        //What are the ways to make an object to be eligible for gc
        //1. make the reference variable point to something else
        // whenever an object has no pointer to it, it will be eligible for gc

        f1 = null;
        f2 = null;
        System.gc();
        System.out.println("End");


    }
    //this method will be called by Garbage collector right before
    //the object being removed from the memory
    @Override // overriding the finalize method of object class
    protected void finalize()  {
        System.out.println("Object is about to be garbage collected");
    }
}
