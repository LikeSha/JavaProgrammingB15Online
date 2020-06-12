package B15BootCampReview.str_review;

public class MyThread extends Thread{

    // run method of Thread class
    // is what run when the thread start


    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName() + " Hello from my Thread");
        countTo5();

    }

    public synchronized void countTo5(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Hello " + i);
        }
    }


}
