package day12;

public class LoginTest {

    public static void main(String[] args) {

        //TASK 4

        // String str= "abc"
           // str.equals("abc) -->> true     !str.equals("abc")--->> false



        // Create a class called LoginTest with main method
        // Create 2 String variable called userName , passWord and do following
        // your correct username password is user123 and pass123
        //Check if your username and password correct
        //If so print login successful

        //If not, Check whether your username correct
        // If not, print username is not correct
        //Check your password is correct or not
        // If not ,print password is not correct

        String userName = "user123" ;
        String passWord = "pass123" ;

        if(userName.equals("user123") && passWord.equals("pass123") ){
            System.out.println("Login Successful ");
        }else if(!userName.equals("user123") ){
            System.out.println("username is not correct ");
        }else if(!passWord.equals("pass123")){
            System.out.println("password is not correct ");



            }



        }





    }

        /* Teachers example :
        // we can declare and assign value like this
        // if it's multiple variables of same type
        String userName = 'abc" , password = "efg" ;

        // user123, pass123

        if(userName.equals("user123") && password.equals("pass123"){
            System.out.println( " Login Successful ") ;
         } else if(!userName.equals("user123") && password.equals("pass123") ){
               System.out.println( " Username not correct ! ") ;
         } else if( userName.equals("user123) && !password.equals("pass123") ){
               System.out.println( " Password not correct ") ;
         }else{
               System.out.println( " Username and Password are both wrong!!! ") ;





         */