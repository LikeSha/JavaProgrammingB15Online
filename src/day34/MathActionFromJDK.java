package day34;

public class MathActionFromJDK {

    public static void main(String[] args) {

        // where is String class coming from
        // it's coming from a package called java.lang
        // it's a special package
        // and any class in it , does not need importing when being used
        // for example String class

        // what if I really want to explicitly import String class
        // import java.lang.String

        //String str = "Hello" ;

        // There is a class under java.lang called Math
        // and it has lots of math utility methods that ready to be used
        int sum = Math.addExact(10,20);
        System.out.println("sum = " + sum);

        Math.max(10,20);
        System.out.println("max of 10,20 --> " + Math.max(10,20));

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



    }

}
