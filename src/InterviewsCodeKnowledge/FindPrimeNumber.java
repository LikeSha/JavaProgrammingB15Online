package InterviewsCodeKnowledge;

public class FindPrimeNumber {

    /*
    Write a method that can check if a number is prime or not
     */

    public static void main(String[] args) {

        System.out.println(" is primeNumber(8) prime number ? " + primeNumber(8));


    }

    public static boolean primeNumber(int num){

        boolean result = false;

        if(num <= 1){
            return result;
        }

        for(int i =2; i<num;i++){
            if(num%i == 0){
                return true;
            }
        }

        return result;
    }
}
