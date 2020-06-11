package InterviewsCodeKnowledge;

public class OnlyEvenNumber {

    public static void main(String[] args) {

        // Print all the even numbers backward from 100-0
        // try to use if statement rather than -2
        //100-98-96-94-92-90......
        // this is a very important test  in job you will use it

        int num = 100;

        while (num >= 0 ){ // num > 0  then the result print from 100 to 2
            if(num % 2 ==0){
                System.out.println(num + " is even number ");
            }
            --num;
        }

        System.out.println("------------Even number For Loop from 0-100-----------");

        for (int i = 0; i < 100; i++) {
            if(i % 2 ==0){
                System.out.print(i + " ");//the short cut for generating for loop is : fori + Enter or tab
            }
        }

        System.out.println();
        System.out.println("-----------Odd number For Loop from 0-100-----------------");

        for (int i = 0; i < 100; i++) {
            if(i % 2 !=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("------------FizzBuzz number For Loop 0-100----------------");

        for (int i = 0; i < 100; i++) {
            if(i % 5 ==0 && i % 3 == 0){
                System.out.println(i + " is FizzBuzz numbers from 0 to 100");
            }
        }


    }
}
