package day61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {

    public static void main(String[] args) {


        // ArrayList is backed by array in the back
        // so if we have ArrayList with 4 elements
        //in the back we have array with size 4 holding all those elements

        //if you add one item to the list using add method
        // it will create an array with size 5 then copy all for above
        // and add the new item at the end

        // Linked list is backed by something called Node
        // see it as 4 people holding hands
        // the neighbouring person have pointer to previous and next person
        // because they are holding hands

        // if you want to add one person,
        // new person will just have to hold last person's hand
        // if you want to insert in the middle
        // new person just need to hold previous and next person's hand

//        List<String> lst = new ArrayList<>();
        List<String> lst = new LinkedList<>();
        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Kamira");
        lst.add("Sabira");

        System.out.println("lst = " + lst);
        lst.remove("Ershat");
        System.out.println("lst = " + lst);

        // Linked List VS ArrayList   THIS IS INTERVIEW QUESTION
        /**
         *  Internally
         *    ArrayList is backed by array
         *    LinkedList is backed by NODE
         *
         *    Node: an object that contains value plus the pointer to its neighbour
         *
         *
         *
         *
         * getting random item by index
         *             ArrayList is better
         * adding removing items
         *              LinkedList is better
         *
         * Big O(read as oh)  Notation :
         *    this is a way programmers describe the performance of an algorithm
         *    time complexity
         *    O(1) means the more elements you have in the list , it does not change the performance
         *    O(N) means the more elements you have in the list , it takes more time performance-wise
         *
         *    -----------------------------------------------------------------------------------------
         *
         *    Please create Job class
         *       location
         *       salary
         *       CompanyName
         *
         *       encapsulate all the fields
         *       add constructor to set all the field value
         *       add toString method
         *
         *       Let this class implements Comparable interface
         *           and add comparing logic of by salary
         *
         *
         *       Create a class called JobHunter with main method
         *       Create a LinkedList of jobs
         *       and store your favorite 5 jobs
         *       assign it to jobList variable with List<Job> reference
         *
         *       sort them and print out before and after
         *
         *
         */


    }
}
