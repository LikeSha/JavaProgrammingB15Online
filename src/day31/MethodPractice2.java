package day31;

public class MethodPractice2 {

    // write a piece of reusable code to count from 1 to 10
    // give a name: count1to10                                       : method name
    // no need for object when being called                          : static
    // it should be accessible anywhere in your project              : public
    // it does not return any value                                  : void
    // does not need any external data when being called             : nothing inside()

    // create a class called MethodPractice3
    // create a method called countDownFrom20tillOne
    // create a method to print odd numbers from 1-100 : printOddNumbers1t0100()
    // create a method to spell your name : Seda-->> S-e-d-a


    // DOES NOT MATTER WHERE YOU PUT THE METHOD
    //AS LONG AS IT'S INSIDE THE CLASS {}
    //AND OUTSIDE ANY OF THE METHOD
    public static void count1to10(){
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        count1to10();
        //System.out.println();
        count1to10();
        // optionally you can call using classname.methodName();
        MethodPractice2.count1to10();




    }




    }



