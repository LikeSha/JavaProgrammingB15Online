package day64;

import java.util.*;
public class QueueInterfaceDemo {

    public static void main(String[] args) {

        // THIS IS A FIRST -IN - FIRST - OUT QUEUE
        // whichever items comes in first , it will get removed first
        // when we use remove method from the Queue interface

        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("do your homework");
        taskQueue.add("attend the class");
        taskQueue.add("say bye to Java");

        System.out.println("taskQueue = " + taskQueue);
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());

        System.out.println("taskQueue = " + taskQueue);



    }
}
