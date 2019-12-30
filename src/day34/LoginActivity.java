package day34;

public class LoginActivity {

    // create 2 login methods

    //1, login1 : static void method
    //  it has two String as method parameters called username and password
    //(it accept 2 String object as argument when being called )
    // it check whether username and password " user" and 'abc123"

    // if yes
    // print login successful
    // else
    // print login failed ( optionally find exactly why failed)

    // login2 :  static method boolean return type
    //  it has two String as method parameters called username and password
    //(it accept 2 String object as argument when being called )
    // it check whether username and password " user" and 'abc123"

    // if yes
    // print login successful
    // else
    // print login failed ( optionally find exactly why failed)
    public static void main(String[] args) {

        login1("user", "abc123");

        boolean result = login2("username", "dda");
        System.out.println("result = " + result);

        System.out.println("second run " + login2("user", "abc125"));


        if (login2("user", "abc123")) {
            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The order");

        }else{
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN !!!!");
        }

    }

    public static void login1(String user, String password){

        if(user.equals("user") && password.equals("abc123") ){
            System.out.println("login successful");
        }else{
            System.out.println("login failed");
        }
    }

     public static boolean login2(String user, String password){
        // if(user.equals("user") && password.equals("abc123") ){
         //    return true ;
        // }else{
             return user.equals("user") && password.equals("abc123") ;
         }


     }



