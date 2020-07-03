package day34;

public class PracticeMethodWithNumbers {

    public static void main(String[] args) {

        /**1, write a method called build3DigitNumber
         it has 3 int parameters digit1 digit2 digit3
         and it will return the 3 digit numbers you have build
         if any of digit1 digit2 digit3 is not within the range of 0-9 then change it to 0 ,
         for example :
         build3DigitNumber(4,2,4) --->> 424
         build3DigitNumber(0,2,1) --->> 21
         build3DigitNumber(65,6,9) --->> 69
         *
         */
        // DO NOT TREAT NUMBER AS A STRING// it means do not concatenate the numbers
        // 376 -->> digit1 is 3, digit2 is 7, digit3 is 6,

        //int digit1,digit2,digit3 ;
        //digit1 = 3;
        //digit2 = 7;
        //digit3 = 6 ;

        // int number = digit1 *100 + digit2 *10 + digit3 ;

        //System.out.println("number = " + number);

        int result1 = build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        int result2 =build3DigitNumber(6,14,0);
        System.out.println("result2 = " + result2);

        System.out.println(build3DigitNumber(16, 14, 90));

        // add the result of first two method call
        System.out.println("result1+result2 = " + (result1 + result2));
        System.out.println(result1 + result2 + " is result of result1+result2");
    }

    public static int build3DigitNumber(int digit1, int digit2, int digit3) {

        // if any of the digit is invalid , make it valid first
        if (digit1 < 0 || digit1 > 9) {
            digit1 = 0;
        }
        if (digit2 < 0 || digit2 > 9) {
            digit2 = 0;
        }
        if (digit3 < 0 || digit3 > 9) {
            digit3 = 0;
        }
        // we want to make sure every digit is already valid before doing below
        // if you come to this point , it should be already valid
        int number = digit1 * 100 + digit2 * 10 + digit3;
        return number;


    }
    /**
     * String name = "Jon Snow"
     * name.charAt(0) ;
     * name.toUpperCase() ;
     *
     * Scanner scan = new Scanner(System.in);
     *
     * scan.next();
     */

    /**
     * printName("Karmran")
     * printName("Astrit");
     * // public ----access modifier
     *    static ---does not an object to call
     *    void  --- return type , does not return anything
     *    String name --- method parameter
     *    "Astrit", "Kamran" the actual data that you passed. is also called " argument"
     *
     *    public static void printName(String name){
     *        System.out.println("Your name is "+ name);
     *    }
     */

}