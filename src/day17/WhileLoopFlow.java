package day17;

import jdk.swing.interop.SwingInterOpUtils;

public class WhileLoopFlow {

    public static void main(String[] args) {

        int x = 10 ;
        // A loop condition is false then it will not even bother to enter the loop
        while ( x>100){
            System.out.println("WOLA");
            // X++
        }
        System.out.println("THE END");


    }
}
