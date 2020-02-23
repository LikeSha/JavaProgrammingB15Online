package rtplSelfPractce;

import java.util.Arrays;

public class Repl126_ArraysPrintShortesWord2 {

    public static void main(String[] args) {

        /**Write a program that will find out shortest words in the given string str.
         * If there are few words that are evenly short, print them all.
         * Use split method in order to split str string variable and create an array of strings.
         * Print array with Arrays.toString() method. Sort array before printing.
         Split values by comma: split(", ");
         input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
         output: [cat, old, ray]
         *
         */

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] strSplitted = str.split(",");
        Arrays.sort(strSplitted);
        System.out.println(Arrays.toString(strSplitted));


        String min = strSplitted[0];

        for (int i = 0; i < strSplitted.length; i++) {

            if (strSplitted[i].length() < min.length()) {

                strSplitted[i] = min;
            }

            // find the number of shortest words , in another word, find if there any word length equals min length ;

            //int countOfShortest = 0 ;

        }


              for(String otherShorts : strSplitted){
              if(otherShorts.length() == min.length()){
                min = min.concat(otherShorts+ " ");
            }
        }
                System.out.println(min);

    }
}