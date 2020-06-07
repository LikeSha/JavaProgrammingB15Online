package day14;

public class StringReview {

    public static void main(String[] args) {

        // METHOD/ACTION/BEHAVIOR
        // 3 Questions to ask about method :

        // WHAT DOES IT DO ?  the name itself give you answer          check for equality......
         // DO I NEED TO PROVIDE EXTRA DATA TO TAKE THIS ACTION ?     you need to provide String
          // WHAT DO I GET OUT OF IT ?  intelliJ gave us instruction  boolean....

        // String methods we know so far :
         // equals:
         // equalsIgnoreCase
         // toUpperCase
         // toLowerCase
         // length

        // word " index " means " position "    index = position(location)

         String str = "I like Pumpkin" ;

        //System.out.println("str");
        //System.out.println(str);

        //System.out.println(  str.equals("pumpkin")    );

        // contains :
        // it checks whether a string exists in another string
        // and return true or false result
        System.out.println(" does it contains Pumpkin");
        System.out.println(   str.contains( " Pumpkin")       );

        boolean gotPumpkin = str.contains("Pumpkin") ;
        //shortcut to print variable value in nice format soutv + tab
       System.out.println("gotPumpkin = " + gotPumpkin);



        // startsWith endsWith
        // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result
        
        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);


        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);

        // PASSWORD VALIDATOR

        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAINS _ OR $
        // IT MUST NOT CONTAINS SPACE
        // IT MUST START WITH Ab

        // If any of above condition does not match say INVALID PASSWORD
        // Else say GOOD PASSWORD
        String password = "Ab_12321$12csa" ;
        // Minimum 8 char max 16 char
         boolean min8max16 = password.length() >=8 && password.length() <= 16 ;

        //IT MUST CONTAINS _ OR $
        // password.contains("_") || password.contains("$")
        boolean mustContains_or$ = password.contains("_") || password.contains("$") ;

        //IT MUST NOT CONTAINS SPACE
        // !password.contains(" ")
        boolean mustNotContainsSpace = !password.contains(" ") ;

        // IT MUST START WITH Ab
        // password.startsWith("Ab")
        boolean mustStartWithAb = password.startsWith("Ab") ;

        if(min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartWithAb){
            System.out.println("VALID PASSWORD");
        }else{
            System.out.println("INVALID PASSWORD");
        }











    }
}
