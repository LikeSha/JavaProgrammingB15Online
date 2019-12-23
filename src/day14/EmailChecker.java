package day14;

public class EmailChecker {

    public static void main(String[] args) {

        // Create a variable called email
        // check for below conditions
        // if tis does not contain character @ say invalid email
        // if it contains space say invalid email

        //if it endsWith @gamail.com-->> print gmail
        //if it endsWith @yahoo.com -->> print yahoo email
        //if it endsWith @mail.ru--->>  print russian email

        String email = "abc12@gmail.com";
        if (!email.contains("@") || email.contains(" ")) {
            System.out.println("INVALID EMAIL !");
        } else if (email.endsWith("gmail.com")) {
            System.out.println("gmail");
        } else if (email.endsWith("@yahoo.com")) {
            System.out.println("yahoo email");
        } else if (email.endsWith("@mail.ru")) {
            System.out.println(" russian email");
        }


        // Teachers example :
        // String email = "abc@gmail.com"
        //if( !email.contains("@") || email.contains(" ") ){
        // System.out.println( "invalid email");
//    }else if ( email.endsWith("@gmail.com") ){
//         System.out.println( " google mail ");
//     }else if ( email.endWith ("@yahoo.com") ){
//         System.out.println("Yahoo.mail");
//     }else if  (email.endsWith("@mail.ru")) {
//         System.out.println(" russian email");



    }
}
