package rebootCamp1.day5_Collections;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.add("a");
        stack.push("b");//helps us last in first out by using push method
        stack.push("c");
        stack.push(null);
        stack.push("d");

//        stack.remove(null);

        System.out.println(stack.pop());
       // System.out.println(stack.peek());// peek() tells us what is the next element you are looking at
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);




    }
}
