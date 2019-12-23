package office_hour;

import java.util.Scanner;

public class Practice_11_25 {

    public static void main(String[] args) {

        // DAY 13
        // The equal sign = sign shows up and it has different meanings
        //1, assignment operator, making a variable equal to some value , putting a value inside the container
             // int x = 10 ;
        // 2, relational| comparison operator ( interview if they ask you hwo do you
        //  resolve this problem ? You don't answer "relational operator " just say I use
        // method 7>5, 10%3 ..........

        // >= greater or equal            7>=7-->>true
        // <= less or equal               5<=4-->>false
        // == checking for equality       51==52-->false
        // != checking for inequality     51!=52-->>true

        //3, shorthand| compound operator
          // += for example : x= x+10 -->> x += 10;
          String text = "hello" ;
          text = text + "world" ; // ---> text += " world" ;  ( this one is correct )
         //  -= for example : x = x-10-->> x -= 10;
         //  *= for example : x = x*10-->> x *= 10;
         //  /= for example : x = x/10-->> x /= 10;
         //  %= for example : x = x%10-->> x %= 10;

        // Logical Operators :
          // && &   Logical AND   & ampersand
          // || |   logical OR    | pipe
          // !      logical NOT   ! Exclamation mark

        // before writing code ,write down your logic in plain English for example login Test
          // if user name and password are correct at the same time then I will say login successful
          // if either username or password are not correct I would say login not successful
          // And so on .......

        // String equality check
          // epic battle between == and .equals method
        // which one will five you consistent result
         // .euals method WIN !!
        // It should be always used if you are checking they have exact same character
        // without worrying about where
        //it is stored in the memory

        //---Stack and Heap

        // Java memory has two general location to for storage Stack
         // will store all the variables ( containers)
         // And all primitives values

        // Heap
          // will store all the objects like String objects( "abc")
         // Scanner Objects ( new Scanner(System.in))
        // Whenever you are using a new keyword a new object is being created
        // String is a special case , you can create String object without using new keyword : for example
        // String abc = " hello " ; -->> String literals


        // Since any applications has a lot of String so there is a specific

        // rple question 21 :

        int num1, num2,num3, sum ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        num1 =  scan.nextInt();
        num2 =  scan.nextInt();
        num3 =  scan.nextInt();

        sum = num1 + num2 + num3 ;
        System.out.println("Sum of numbers: " + sum);

    }
}
