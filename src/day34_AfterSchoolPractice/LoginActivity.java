package day34_AfterSchoolPractice;

public class LoginActivity {

    public static void main(String[] args) {

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

        login1("user","abc123");

        boolean result = login2("user345","345");
        System.out.println("result = " + result);


    }
      public static void login1(String username, String password){
          if (username.equals("user") && password.equals("abc123")  ) {
              System.out.println("login successful");
          }else{
              System.out.println("login failed");
          }
      }
       public static boolean login2(String username,String password){

        return username.equals("user") && password.equals("abc123");
       }
    }