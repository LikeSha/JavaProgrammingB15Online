package office_hour;

public class Practice_01_02_2020 {

    /**1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the String
     Ex:
     RemoveDuplicate("aaabbbccc") ==> "abc"
     2. write a return method called Frequency that accepts String and char,
     the method will return the total number of ocuurence of the given char in the given string
     Ex:
     Frequency("AAABBB", 'A') ==> 3
     3. Combined the methods 1 & 2 to write a method that prints the the frequency of each characters from the given String
     Ex:
     FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        String str = "AAABBBDDDEEE"; // expected result ABDE
        String result1 = ""; // store non duplicates

        for (int i = 0; i < str.length(); i++) {

            if (!result1.contains(str.substring(i, i + 1))) {
                result1 += str.substring(i, i + 1);

            }

        }
        System.out.println(result1);
        /**
         * if( !result1.contains("" + str.charAt(i)){
         * result1 += ""+ str.charAt(i);
         */
        System.out.println(RemoveDup("MMMNNNBBBCCCC"));

        System.out.println(frequency("AABBCC",'C'));

        frequencyOfChars("AABBBCCC");

    }

        // task 1 :
        public static String RemoveDup(String str) {
            String result1 = ""; // store non duplicates

            for (int i = 0; i < str.length(); i++) {

                if (!result1.contains(str.substring(i, i + 1))) {
                    result1 += str.substring(i, i + 1);

                }

            }
            return result1;

        }

          // Task 2 : Frequency " AAABBBBBB", 'B') ==> 6

          public static int frequency(String str, char ch){
                                       // "ABCABC"  'A'

              int count = 0 ;  // to count how many time the char is accoured in str
              char[] arr = str.toCharArray(); // ['A','B','C','A','B','C']
              for(char each : arr){
                  if(each==ch){
                      count +=1;
                  }
              }

              return count ;
          }


            // Task 3, frequencyOfChars("AAABBBCCC") ==> A3B3C3
                  // FIRST step we gonna remove the duplicated character ==> ABC
                       // THEN --------------------------------------------> A3B3C3
            public static void frequencyOfChars(String str) { // users gonna be pass me arguments . "AAABBBCCC"
                String nonDup = RemoveDup(str); // ABC

                for (int i = 0; i < nonDup.length(); i++) {
                    int count = frequency(str, nonDup.charAt(i));// 3
                    System.out.print("" + nonDup.charAt(i) + count);
                    // 'A' + 3
                }

            }


    /**public static String frequencyOfChars(String str) { // users gonna be pass me arguments . "AAABBBCCC"
     String result = "";
     String nonDup = RemoveDup(str); // ABC

     for (int i = 0; i < nonDup.length(); i++) {
     int count = frequency(str, nonDup.charAt(i));// 3
     result += "" + nonDup.charAt(i) + count;
     // 'A' + 3
     *
     *
     */



}