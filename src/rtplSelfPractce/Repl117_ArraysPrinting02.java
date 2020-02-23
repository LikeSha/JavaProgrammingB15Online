package rtplSelfPractce;

public class Repl117_ArraysPrinting02 {

    public static void main(String[] args) {

        /**The code provided in your main method will take in eight Strings and save them into an array called arr.
         Print out the 4 lines using for loop:
         each line should contain a pair of array element as displayed below
         user for loop

         Example:
         arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
         prints:  apple , banana
         kiwi , grape
         milk, "soda"
         juice, coffee

         */
        //  String[] arr = new String[8];
        String[] arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};

        //System.out.println(Arrays.toString(arr));
        /// String arrStringType = Arrays.toString(arr) ;
        for (int i = 0; i < 8; i = i + 2) {

            System.out.println(arr[i] + " , " + arr[i + 1]);


        }






    }
}