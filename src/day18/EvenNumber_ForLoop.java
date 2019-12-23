package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

        // skip counting by 2
        // start from 0--100

        for(int i = 0 ; i < 100 ; i+=2){// or i = i + 2

            System.out.print(i + " ");

        }
        System.out.println();

        // skip counting by 2
        // start from 0
        System.out.println("-----------even number");

        for(int x = 0 ; x < 100 ; x += 3){

            System.out.print(x + " ");
        }

        for (int i = 0; i < 100 ; i++) { // typing " fori" then "enter" wola !

            if(i %2 ==0 ){
                System.out.print(i + " ");
            }
            // THE SHORTCUT FOR GENERATING FOR LOOP IS : fori enter or tab

        }
        for (int i = 0; i < 100 ; i++) {

            if(i %5 == 0 && i %3 == 0){

                System.out.println(i + " is Fizz Buzz number");
            }

        }


    }
     // everyting you can do with the for loop-->> can be done using while loop !!
}
