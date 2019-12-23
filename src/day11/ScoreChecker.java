package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        // Create a program to check the score  : ScoreChecker with main method
        // Create a variable called score assign a value of your choice
        // if the score is less than 0 or more than 100 -->> INVALID SCORE !!!
        //if the score is 100 -->> perfect score
        //if the score is between 70-100 -->> YOU HAVE PASSED !
        //Else you have failed !!!

        //OPTIONAL : add more condition
        // if the score is less than 20--> come to my office
        // if the score is between  30-40-->> Attend additional classes
        //if the score is between  40-70-->> Attend additional classes

        // In this case we can not use switch statement, is because switch statement is always looking for the
        // exact value NOT THE RANGE ! in this case ,we need to check the RANGE . that's obvious switch
        // statement is not for this case .
        int score = 99;
        if (score > 100 || score < 0) {
            System.out.println("INVALID SCORE !!!");
        } else if (score == 100) {
            System.out.println("perfect score !! ");
        }else if( score>=70 && score<100){
            System.out.println("YOU HAVE PASSED !");
        }else if( score<20){
            System.out.println("come to my office");
        }else if(score>30 && score<40){
            System.out.println("Attend additional classes");
        }else if(score>40 && score<70){
            System.out.println("Attend additional classes");

        }
    }
}