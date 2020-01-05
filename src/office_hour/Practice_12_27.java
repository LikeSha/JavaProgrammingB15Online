package office_hour;

public class Practice_12_27 {

    public static void main(String[] args) {

        /**
         * Practice topic : Methods
         * methods: grouping a series fo statements together to perform a specific action
         *
         *
         */

        String a = "ABCDEFG";
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.substring(i, i + 1));
        }
        System.out.println();
        String a1 = "Esra Fidan";

        method2();

        float num1 = 10.0f;
        double num2= num1 ;

        double number1 = method3();
               method2();

        System.out.println(Eligible(21));
        System.out.println(Eligible(45));
        // method can make our codes more reusable (don't need to repeat same set of statements)

        // method Declaration :
        // access-modifiers   specifiers, return-Type, name(parameters){
         //     statements.....;
      // }

        // during this course :
        // access-modifier : public ,protected ,default ,private
        // specifiers : static , final ,abstract
        // return-type(mandatory) : void, and any other data types(all primitives or non primitives)
        // parameters : any data-types ( all primitives or non primitives)

        // for now we will only use public and static for the access modifier and specifier

        // if return-type is void :does not return any value
        // if return-type is not void :the method MUST return a value the returning value MUST be
        // matched with the return-type of the

        // method with parameters : sometime method needs specific information(from the user)
        // to perform its function.
    }

    public static void method1(){
        System.out.println("Hello Batch 15");
       // return 10 ; return type is void , means ,can not return any value .

    }
     public static void method2(){
        if(false){
            return ; // exits the current method
        }
         System.out.println("Test completed");
        // return statement : it's used for exiting the current method. We can also use return
         //statement to return a value from the method

         // the argument that we are passing MUST match with parameters type
    }
      public static double method3(){
        // if return type is not void , the method MUST return a value

          return 10.5f;
      }

      public static boolean Eligible(int age){// buying alcohol age eligibility in usa
        if(age > 35){
            return true ;
        }
          return false ;
    }


}
