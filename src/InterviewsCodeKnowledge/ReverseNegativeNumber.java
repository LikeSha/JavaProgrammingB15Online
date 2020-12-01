package InterviewsCodeKnowledge;

public class ReverseNegativeNumber {

    /*
    Write a return method that can reverse negative number and return it as int
     */

    public static void main(String[] args) {

      int num = -763;
        System.out.println("reverseNumber(num) = " + reverseNumber(num));

    }

    public static int reverseNumber(int num){

        String str = new StringBuilder(""+num).reverse().toString();
        if(num<0){
            str = "-"+str.substring(0,str.length()-1);
        }

        return Integer.valueOf(str);
    }
}
