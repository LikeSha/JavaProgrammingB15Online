package InterviewsCodeKnowledge;

public class FINRA {

    /* This question is same as FizzBuzz Number.

    Write a program that prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    print "FIN" instead of the number and for numbers which are a multiple of 5,
    print "RA" instead of the number. For numbers which are a multiple of both 3 and 5,
    print "FINRA" instead of the number.
     */

    public static void main(String[] args) {

        int i = 30;

        for(i = 1;i<=30;i++){
            if(i%5 ==0 && i%3==0){
                System.out.println(i + " is FINRA");
            }else{
                if(i%3==0){
                    System.out.println(i +" is FIN");
                }else{
                    if(i%5==0){
                        System.out.println(i +" is RA");
                    }
                }
            }
        }

        System.out.println("######################### solution 2 ###################################");

       // below are the different code solution, is exactly based on requirement


        for (int j = 1; j <= 30; j++) {

            String print = "";

            if(j % 3 == 0) print = "FIN";

            if(j % 5 ==0) print += "RA";

            if(print.isEmpty()){
                System.out.println(j);
            }else{
                System.out.println(print);
            }
        }



    }
}
