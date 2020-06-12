package B15BootCampReview.str_review;

import java.util.Hashtable;

public class ThreadPractice {
    // in single threaded application we have been creating
    //everything run in a thread named main
    public static void main(String[] args) {

        System.out.println("hello");
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        // this will open up a new thread and call it's
        t1.start();
        t2.start();


//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getId());

        System.out.println("end");

        Hashtable map = new Hashtable();




    }
}
