package InterviewsCodeKnowledge;

public class TernaryOperator {

    public static void main(String[] args) {

        /*
        condition ? expression 1 : expression 2

        if condition is true , result would be expression 1
        if condition is false, result would be expression 2
         */

        // this Ternary Operator condition just like normal if statement :

        int n1 = 5;
        int n2 = 3;
        int max =0;

        if(n1>n2){
            max =n1;
        }else{
            max =n2;
        }

        System.out.println("max = " + max);

        // above if statement : --> same as : max = (n1>n2) ? n1 :n2
        // if n1>n2 is true ,value n1 will be assigned to max
        // if n1>n2 is false,value n2 will be assigned to max

        max = (n1>n2) ? n1 :n2;
        System.out.println("max = " + max);

        // lets see another example :

        String action;
        boolean isGreen=true;

        if(isGreen){
            action = "Can drive";
        }else{
            action = "Can't drive";
        }

        System.out.println("action = " + action);

        // we turn above if statement into ternary operator as below :

        // String action;
        // boolean isGreen=true;

        action = (isGreen) ? "Can drive" : "Can't drive";
        System.out.println("action = " + action);

    }


}
