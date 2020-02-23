package selfStudyFolder.oopConcertPart1;

import javax.xml.namespace.QName;

public class StaticAndNonStaticConcept {


     // global variables : the scope of global variables will be available across all the functions with some conditions
    String name = "Tom";//non static global variable
   static int age = 25;// static global variable

    public static void main(String[] args) {

        // how to call static methods and variables ?
        //1,direct calling
        sum();
        // 2, calling by classname;
        StaticAndNonStaticConcept.sum();

        // how to access static variable ?\
        System.out.println(age);
        System.out.println(StaticAndNonStaticConcept.age);

        // how to call non static methods and variable ?
        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail();
        System.out.println(obj.name);

        // STATIC METHOD AND OBJECT ARE NOT PART OF YOUR OBJECT !! THEY ARE STORED IN JAVA MEMORY

        // can I access static method by using object reference ?
        obj.sum(); // warning will be given  you should only use static method ,by calling either calssName.staticMember
        // the above other methods.

        // Interview question : Can I access static method by using reference ? answer is : YES ! BUT THIS IS NOT
        // A GOOD METHOD .

    }

    public void sendMail(){// non static method
        System.out.println("send mail method");
    }

    public static void sum(){//static method
        System.out.println("sum method");
    }

}
