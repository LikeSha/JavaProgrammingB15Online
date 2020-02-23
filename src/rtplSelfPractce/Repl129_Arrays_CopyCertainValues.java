package rtplSelfPractce;

import java.util.Arrays;

public class Repl129_Arrays_CopyCertainValues {

    public static void main(String[] args) {
        /**
         * Instructions from your teacher:
         * Given a String array arr with the following elements
         * ["zero", "one", "two","three","four"]
         *
         * Create another array fewValues and copy words that have letter "e" in them
         *
         * You need to know how many element contain "e" and create array accordingly
         *
         * Values in fewValues array need to be["zero", "one","three"]
         *
         * Examples:
         * arr -> ["aa", "be", "lol", "lel", "oreo"]
         * fewValues -> ["be",  "lel", "oreo"]
         *
         * arr -> ["e", "hey", "bye", "furey", "spoon"]
         * fewValues ->["e", "hey", "bye", "furey"]
         */
        String[] arr = {"zero", "one", "two","three","four"};
        //System.out.println(Arrays.toString(arr));
        String wordWithE = "" ;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].contains("e")){
                System.out.println(arr[i]);
                wordWithE = wordWithE + arr[i]+" ";

            }
        }
           String[] fewValues = wordWithE.split(" ");

    }
}
