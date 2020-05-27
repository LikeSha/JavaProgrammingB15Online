package rebootCamp1.day5_Collections;

import java.util.PriorityQueue;

public class QueueEx {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();

        System.out.println(queue.peek());//now at this point ,its empty ,because nothing inside queue yet
//        System.out.println(queue.element());//now if we use peek() counter part method element(), they
                                           // give us an exception

        queue.add("java");
        queue.offer("a");
//        queue.add(null); // null is not valid ,will throw NoPointerException
//        queue.offer(null); // null is invalid always.even you use offer();

        System.out.println(queue.element()); // if we print element() ,it give us a first
        System.out.println(queue.remove());

        System.out.println(queue);// queue is automatically natural order

    }
}
