package day10;

public class Calculator_v1 {

    public static void main(String[] args) {

        // Create a class Calculator with main
        // Create a variable called operator with type char
          // Assign the value for one of these 4 : +-*/
        // Use switch statement to do following logic

        // If the operator is + print you aer about to add numbers
        //If the operator is - print you aer about to subtract numbers
        //If the operator is * print you aer about to multiply numbers
        //If the operator is / print you aer about to divide numbers
        //If nothing match print invalid operator

        char operator = '+';
        switch(operator){

            // this case is equivalent of saying if (operator=='+')
            case '+' :
                System.out.println("Yor are about to add numbers");
                break;
            case '-':
                System.out.println("Yor are about to subtract numbers");
                break;
            case '*' :
                System.out.println("Yor are about to multiply numbers");
                break;
            case '/' :
                System.out.println("Yor are about to divide numbers");
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }



    }



}
