package day17;

public class WakeUp_NameCorrector {

    public static void main(String[] args) {

        // Create a String variable to store your name in any case
        // Create a variable called name2
        // for example jon jOn jON any of them:

        // Create a variable called name2
        //make your first letter uppercase then rest lowercase
        // jon-->>Jon   arya-->>Ayra
        //Optionally ask your name from Scanner
        // Optionally as your full name -->> then make you full name first letter uppercase the rest lowercase

        String name = "kHumAyRa";

        // substring method copy the part of String inside another String
        // it has 2 versions :
          // 1 start with certain index and end at ending index
          // 2 start with certain index then get te rest of the String

        // logic is : get the first character --->> make it uppercase
        // get the rest of the character starting from 2nd character
        //then make it lowercase
        //eventually concatenate them
//        String nameFixed = (name.charAt(0)+"").toUpperCase();
//               nameFixed = nameFixed + name.substring(1).toLowerCase();
          String nameFixed = name.toUpperCase().substring(0,1);
                 nameFixed += name.substring(1).toLowerCase();
                 System.out.println("nameFixed = " + nameFixed);

        //make whole name uppercase then get the first character
        // get the rest of the characters starting from 2nd character
        //then make it lowercase
        //eventually concatenate them

        String nameUpperFirstChar = name.toUpperCase().substring(0,1);
        String nameRest = name.toLowerCase().substring(1);
        String nameConcate = nameUpperFirstChar + nameRest;

        System.out.println(nameConcate);







    }
}
