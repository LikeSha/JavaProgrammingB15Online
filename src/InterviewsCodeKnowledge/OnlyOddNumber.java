package InterviewsCodeKnowledge;

public class OnlyOddNumber {

    public static void main(String[] args) {

        int num = 100;

        while (num >= 0 ){ // num > 0  then the result print from 100 to 2
            if(num % 2 !=0){
                System.out.println(num + " is odd number ");
            }
            --num;
        }

    }
}
