package day36;

public class MethodPractice {

    public static void main(String[] args) {
        /**
         * write a static method to accept a String and return Boolean(Yes Uppercase) .
         * it should return true if the String contains at least one number.
         *
         * write a static void method to accept a long array.
         * It should swamp first value with last value of the array
         *
         * Optionally write a static void method to reverse an int array
         */

             //Boolean b = true ; // auto boxed it to Boolean Object
        Boolean result1 = checkIfStringHasNumber("ytz12ck");
        System.out.println("result1 = " + result1);

        Boolean result2 = checkIfStringHasNumber("ABCD");
        System.out.println("result2 = " + result2);

        System.out.println(checkIfStringHasNumber("aduia53"));
    }

    /**
     * write a static method to accept a String and return Boolean(Yes Uppercase) .
     * it should return true if the String contains at least one number.
      * @param str
     * @return ture Boolean Object if the String contains at least one number
     */
    public static Boolean checkIfStringHasNumber(String str){

        for (int i = 0; i <str.length() ; i++) {

            char eachChar = str.charAt(i);
            if(Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }

        }
         return Boolean.valueOf(false);

        /**
         *  boolean isFlag = false;
         *         char [] charArr = string.toCharArray();
         *         for (char each :
         *                 charArr) {
         *             if (Character.isDigit(each)){
         *                 isFlag = true;
         *             }
         *         }
         *         return isFlag;
         *
         */

    }


}
