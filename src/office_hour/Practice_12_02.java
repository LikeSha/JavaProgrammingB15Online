package office_hour;

public class Practice_12_02 {

    public static void main(String[] args) {

        //String method review:
        //While loop:
          // working with sequential numbers 1-10 10-1
         // using conditional statement inside loop

        // How to do one thing with a number
        // then expand it to many numbers using the loop
          // for example: first : get 1 character using  index charAt(0)
            // then expanded it to all the characters using indexOf(0)--str.length()

        //How to working with string and loop

        // Debug to see program flow


        //             012345678901234567890123456
        String item = "Echo Dot (3rd Gen) Charcoal";
        // get whatever is inside parenthesis

        //find out index of ( and index of ) ,use them for substring to get the text

        System.out.println(  item.substring(9,18));
        System.out.println(  item.substring(10,17));

        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");

        String wordInsideParenthesis = item.substring(indexOfOpeningParenthesis+1, indexOfEndingParenthesis   );
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);

//    ------------------------------------------------

        String letters = "J%a^v**$a" ;
        // REQUIREMENT remove ALL % ^ *  $
        letters = letters.replace("%","") // "Ja^v**$a"
                         .replace("^","")//"Jav**$a"
                         .replace("*","")//"Jav$a"
                         .replace("$","")//"Java"
                         .toUpperCase(); //JAVA

        System.out.println("letters = " + letters);
        // if you want to just replace first one use replaceFirst method


















    }
}
