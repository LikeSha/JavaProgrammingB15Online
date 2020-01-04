package day35;

public class CharacterPractice2 {

    public static void main(String[] args) {

        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method

        //Given any String  for example
        //String str = "A34B123C4X";
        //Add all the numbers inside the String : above String should generate 17
        // THIS IS INTERVIEW QUESTION

        char myChar = '7' ;
        // get int 7
        int myNum = Integer.parseInt(myChar+"");
        System.out.println("myNum = " + myNum);

        // Character.toString(myChar)
        //String.valueOf(myChar)

        String str = "A34B123C4X";
        // for each char in string check if it is number
        // if yes store in a String and use that string to get Integer
        // then sum it up

        char[] allChars = str.toCharArray();

        int sum = 0 ;

        for(char each : allChars){
            if( Character.isDigit( each)){
                // if it's print out to see
                System.out.println("each = " + each);
                // then turn it into int using parseInt method
                // parseInt only accept String
                // so we need to pass String by adding "" to each
                int eachNum = Integer.parseInt(each+"");
                // now we can numerically add the number to sum
                sum = sum + eachNum;

            }

        }
          System.out.println("sum = " + sum);



    }
}

/**
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
 *
 *
 *
 *
 */





