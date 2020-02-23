package day36_AfterSchoolPractice;

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
       Boolean result1 =  checkIfStringHasNumber("ytz13ck");
        System.out.println("result1 = " + result1);
    }

        public static Boolean checkIfStringHasNumber(String str){


                for (int i = 0; i <str.length() ; i++) {
                    char eachChar = str.charAt(i);
                    if(Character.isDigit( eachChar)){
                        return Boolean.valueOf(true);
                    }

            }

                return Boolean.valueOf(false);
        }

}
