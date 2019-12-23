package day14_AfterSchoolPractice;

import org.w3c.dom.ls.LSOutput;

public class EmailChecker {

    public static void main(String[] args) {

        // Create a variable called email
        // check for below conditions
        // if tis does not contain character @ say invalid email
        // if it contains space say invalid email

        //if it endsWith @gamail.com-->> print gmail
        //if it endsWith @yahoo.com -->> print yahoo email
        //if it endsWith @mail.ru--->>  print russian email

        String email = "abc123@gmail.com";

        if (!email.contains("@") || email.contains(" ")) {
            System.out.println("Invalid email");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("gmail");
        } else if (email.endsWith("@yahoo.com")) {
            System.out.println("yahoo email");
        } else if (email.endsWith("@mail.ru")) {
            System.out.println("russian email");


        }



        }




}

