package InterviewsCodeKnowledge;



public class ReverseString {

    // VERY VERY IMPORTANT QUESTION : WHAT IS THE INDEX OF LAST CHARACTER ????
    //ANSWER: YOU FIRST ASK INTERVIEWER : HOW MANY CHARACTER DO YOU HAVE ? I HAVE 5 CHARACTER
    //(HELLO) ,WHAT IS MY LAST INDEX ? MY LAST INDEX IS ALWAYS ALWAYS 1 LESS  THAN MY
    // CHARACTER COUNT !!!
    //THEY WILL ASK THIS KIND OF QUESTION IN INTERVIEW !!!!!
    // How do you find out last character of any String
    // counting character start with one
    // counting index (location) start with 0
    // so last character index/location will be always one less than actual character count
    public static void main(String[] args) {

        // method 1 :
//                     01234
        String name1 = "Akbar" ;

        System.out.println( name1.charAt(4) + " " + name1.charAt(3) + " " + name1.charAt(2)
                + " " + name1.charAt(1) + " " + name1.charAt(0));


        System.out.println("##############################################################");

        // THIS IS VERY IMPORTANT , ITS A VERY COMMON INTERVIEW QUESTION

        // Interview questions going deep , they gonna ask you " tell me the String is Palindrome or not ?
        //we will learn this concept in next class " PalindromeTest"

        // given a String variable name with value
        //reverse this name and store reversed value into another String variable reverseName
        //             01234567


        String name = "TONY STARK";
        String reversedName = "";

        int lastCharIndex = name.length()-1 ; // REMEMBER THIS FORMULAR !! SUPER IMPORTANT !

        System.out.println();

        for (int x = lastCharIndex; x >=0 ; x--) {

            System.out.print(x + " index : ");

            char currentChar = name.charAt(x);
            System.out.println( name.charAt(x));

            reversedName = reversedName + currentChar;

        }
        System.out.println("reversedName = " + reversedName);


        // This is all we need
        /** for( int x = lastCharIndex ; x >= 0 ; x--){

         reversedName = reversedName + name.charAt( x );
         }

         System.out.println("reversedName = " + reversedName);

         **/


        System.out.println("############### USING STRINGBULIDER DO REVERSE STRING##################");

        StringBuilder sb = new StringBuilder("programming");
        System.out.println("string = " + sb);
        // reversing of stringbuilder
        System.out.println("reverse = " + sb.reverse());


    }


    }


