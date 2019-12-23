package day20_AfterSchoolPractice;

public class ReversingAString {

    public static void main(String[] args) {

    //  // THIS IS VERY IMPORTANT , ITS A VERY COMMON INTERVIEW QUESTION
        //
        //        // given a String variable name with value
        //        //reverse this name and store reversed value into another String variable reversedName
          //           01234567
        String name = "Tony Stark" ;
        String reversedName = "";

         int lastCharIndex = name.length()-1 ;


        for (int x = lastCharIndex; x >=0  ; x--) {

            System.out.print(x + " index : ");

            char currentChar = name.charAt(x);
            System.out.println(currentChar );

            reversedName = reversedName + currentChar ;


    }
        System.out.println("reversedName = " + reversedName);





    }
}
