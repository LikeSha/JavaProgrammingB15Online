package day35_AfterSchoolPractice;

public class CharacterPractice {

    public static void main(String[] args) {

        String str= "A34B123C4X" ;
        // Get the number out of this String and store it into Integer variable x ;
        String numInStr = "";
        for (int x = 0; x <str.length() ; x++) {
            if (Character.isDigit(str.charAt(x))) {
                System.out.println("str.charAt(" + x + ") = " + str.charAt(x));
                numInStr = numInStr + str.charAt(x);
            }


        }
        System.out.println("numInStr = " + numInStr);

        Integer num = Integer.valueOf(numInStr);
        System.out.println("num = " + num);

    }

}
