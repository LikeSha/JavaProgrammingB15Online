package day13_AfterSchoolPractice;

import jdk.swing.interop.SwingInterOpUtils;

public class StringMethods {

    public static void main(String[] args) {

        // String actions that we already know so far

        // equals
        String s1 = "hello" ;
        System.out.println(  s1.equals("abc"));
        // equalsIgnoreCase
        System.out.println(  s1.equalsIgnoreCase("HELLO"));

        // toUpperCase method of String is used to make String all character uppercase

        // so called " method " how do we identify so called " method " ?
        // IT ALWAYS COMES WITH PARENTHESES (), EITHER THERE ARE SOMETHING INSIDE OR NOTHING INSIDE
        System.out.println(   s1.toUpperCase()          );

        // toLowerCase method of String is used to make String all character lowercase
        System.out.println( s1.toLowerCase()    );

        String myName = "Salik Malik" ;
        System.out.println(myName.toUpperCase());
        System.out.println("My name is " + myName.toUpperCase());

        System.out.println(myName.toLowerCase());
        System.out.println("My name is " + myName.toLowerCase());

        // In order to get how many character inside String
        // we can use length method of String
        // It WILL COUNT EACH AND EVERY

        System.out.println(  s1.length()       );

        int lengthOfStr= s1.length() ;

        if(s1.length()>4){
            System.out.println("More than 4 character");
        }else{
            System.out.println("NOT MORE THAN 4 ");
        }


    }
}
