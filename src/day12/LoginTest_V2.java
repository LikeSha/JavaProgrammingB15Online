package day12;

import jdk.swing.interop.SwingInterOpUtils;

public class LoginTest_V2 {

    public static void main(String[] args) {

        String userName = "abc123" ;

         boolean userNameCorrect = userName.equals("ABC123");

        System.out.println( userNameCorrect );

        boolean userNameCorrect2 = userName.equalsIgnoreCase("ABC123");

        System.out.println( userNameCorrect2);

        String name = "salik";
        boolean nameCheker = name.equals("salik");
        System.out.println(nameCheker);
        boolean nameCheker2 = name.equalsIgnoreCase("SAliK");
        System.out.println(nameCheker2);


    }
}
