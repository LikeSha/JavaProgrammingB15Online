package RtplSelfPractce;

import java.util.Scanner;

public class Repl25_PrintShortestWord {

    public static void main(String[] args) {

        /**Write a program that will print the shortest word in the given array str.

         input: java, cable, red, vivid, remedy, grace
         output: red
         *
         */

           // this question solution at office hour Dec 9 2019 "find the minimum number "
        // also see Dec 12 2019 office hour : ArraysStringLoop

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter words");
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String min = str[0];

        for (int i = 0; i < str.length ; i++) {
            if(str[i].length() < min.length()){
                min = str[i];
            }
        }
        System.out.println("min = " + min);


    }
}
