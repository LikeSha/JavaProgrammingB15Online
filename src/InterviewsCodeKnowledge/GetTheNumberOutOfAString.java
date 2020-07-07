package InterviewsCodeKnowledge;

public class GetTheNumberOutOfAString {

    public static void main(String[] args) {

        //// Get the number out of this String and store it into Integer variable num ;

        String str = "A34B123C4X";

        String numInStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                numInStr+=str.charAt(i);
            }
        }
        System.out.println("numInStr = " + numInStr);
        // // The requirement says get the result as Integer object, so do this after above :
        Integer num = Integer.valueOf(numInStr);
        System.out.println("num = " + num);


        System.out.println("-------------------GET THE SUM OF THE NUMBERS INSIDE A STRING----------------------");

        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method

        //Given any String  for example
        //String str = "A34B123C4X";
        //Add all the numbers inside the String : above String should generate 17
        // THIS IS INTERVIEW QUESTION

        char[] allChars = str.toCharArray();
        int sum = 0;
        for(char each : allChars){
            if(Character.isDigit(each)){
                System.out.println("each = " + each);
                // then turn it into int using parseInt method
                // parseInt only accept String
                // so we need to pass String by adding "" to each
                int eachNum = Integer.parseInt(each+"");
                // or we can use below 3 line of code to get int , first we need to convert chart to String
                // then, we store to int by using parseInt( paresInt can only convert String to int)
                // last we sum up all numbers.
//                String strChar = Character.toString(each);
//                int eachNumber = Integer.parseInt(strChar);
//                sum+=eachNumber;
                // now we can numerically add the number to sum
                sum+=eachNum;
            }
        }

        System.out.println("sum = " + sum);

        /*
        * public static void main(String[] args) {
 *         String str = "A34B123C4X";
 *         sum(str);
 *     }
 *     public static void sum(String s) {
 *         int sum=0;
 *       char[] arr=s.toCharArray();
 *         for (char c : arr) {
 *             if(Character.isDigit(c)){
 *                 sum+=Integer.parseInt(c+"");
 *             }
 *         }
 *         System.out.println("sum = " + sum);
 *     }

          */
    }
}
