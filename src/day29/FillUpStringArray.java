package day29;

import java.util.Arrays;

public class FillUpStringArray {

    public static void main(String[] args) {

        /**Create an array with size 300 and fill it up with I Love Java

         */
        String[] strArr = new String[300] ;
        System.out.println("before filling strArr = " + Arrays.toString(strArr));

        for (int i = 0; i < strArr.length ; i++) {

            // strArr[i] = (i +1) + ".I Love Java";
            strArr[i] = "I Love Java";

        }
        System.out.println(Arrays.toString(strArr));

        String str        = new String("ABC") ; // THIS IS STRING OBJECT WITH VALUE ABC
        String[] strrArr2 = new String[5] ; // EMPTY STRING ARRAY WITH CAPACITY 5,
        strrArr2[0] = "i LOVE JAVA";
        strrArr2[1] = "i LOVE JAVA";
        strrArr2[2] = "i LOVE JAVA";
        strrArr2[3] = "i LOVE JAVA";
        strrArr2[4] = "i LOVE JAVA";

        System.out.println("strARR2 = " +Arrays.toString(strrArr2));




    }
}
