package office_hour;

public class Practice12_03 {

    public static void main(String[] args) {

        // loop : repeated action
        // 100 times  1--100
        // how many loops in java ? while ,do while loop , for loop

        // for loop key word is "for"

        // for(starting point ; ending point ; iterator )
        //  starting point ; int jumpCount =1 ;
        // ending point -->> jumpCount <= 100
        // iterator --> jumpCount++

        for( int jumpCount =1 ; jumpCount <= 100 ; jumpCount++ ){
            System.out.println("I jumped " + jumpCount + " times");
        }

        // stack--> JumpCount->1

        // I wanna jump start from 3rd stairs and stop at 7th stairs
        //I wanna sing a song,drink water ,and clap at fourth level

        for(int stairs = 3; stairs <= 7 ; stairs++){
            System.out.println("sing a song");
            System.out.println("Drink water");
            System.out.println("clap");
            System.out.println("You are done with stairs " + stairs);
        }

//  int stairs = 3 ; --->this is the beginning  ,you need to check if conditon is true 3<7  yes its true then
     /* stairs <= 7  ----> true then you print below actions
        System.out.println("sing a song");
            System.out.println("Drink water");
            System.out.println("clap");

            // task : print 23--30

           */
          for(int point = 23 ; point <+ 30 ; point++){
              System.out.println(point);
          }

          // I am in level 90,89,88-----80
        for(int level = 90 ; level >= 80 ; level--){
            System.out.println("I am in level "+ level );
        }
        // 1-10 even number ? %2==0 2,4,6,8,10  // in real life ,in automation job
          // normally 99% you are doing ++ ( add one number each time )condition .like below case

        for(int num = 1 ; num <= 10; num++){

            if(num%2==0){
                System.out.println(num);
            }

        }






    }
}
