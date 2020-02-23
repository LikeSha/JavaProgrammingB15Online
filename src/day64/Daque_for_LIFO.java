package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Daque_for_LIFO {

   // How do we implement a LifoQueue if not using old class called Stack
    // we can use any of Deque interface implementation
    //Deque is a double ended Queue so we can add item as always
    //and when we remove we can sue removeLast last method to achieve Last in first out


    public static void main(String[] args) {

        Deque<String> lifoQue = new LinkedList<>();

        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("say bye to Java");

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());

        // post fix : lifoQue.removeLast.soutv typing this the above print format showing up




    }
}
