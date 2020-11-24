package InterviewsCodeKnowledge;

public class SumOfDigitsInString {

    // Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        System.out.println(sumOfDigits("djojsuinha4478d"));


        }

        public static int sumOfDigits(String str){

        char[] allChars = str.toCharArray();
        int sum = 0;

        for(char each : allChars){
            if(Character.isDigit(each)){
                sum+= Integer.valueOf(each+"");
//                sum+=Integer.parseInt(each+"");<-- this line of code also works.

            }
        }

        return sum;

    }



}
