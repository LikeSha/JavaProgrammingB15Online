package rebootCamp1.day5_Collections;

import java.util.ArrayDeque;

public class ArrayDequeEx {

    public static void main(String[] args) {

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("d");
        arrayDeque.add("s");
        arrayDeque.add("a");
//        arrayDeque.add(null);// this will give you Exception because queue can not handle them

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());//peek() gonna see what the first element FIFO
        System.out.println(arrayDeque.peekLast());// peekLast() check from the end

        arrayDeque.addFirst("2");
        arrayDeque.addLast("a");

        System.out.println(arrayDeque);

        arrayDeque.removeLast();
        System.out.println(arrayDeque);

    }
}
