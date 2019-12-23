package day06_AfterSchoolPractice;

public class CoinConverter {

    public static void main(String[] args) {


        // you have 200 cents
        // how many quater you can get 25c
        // how many dime you can get 10c
        // how many Nickel you can get 5c
        // how many penny you can get
        int cent = 200 ;

        // you have purchased candle 74 cents ,
        // what would be your remainder

        cent -= 74; // 126 cent after spending 74 cent for candle

        int quater = cent/25 ; // 126/25 --->> 5, 1 is remaining
        int penny = cent %25 ; // 126/25-->>5 , 1 is remaining

        System.out.println( quater );
        System.out.println( penny  );

        // now I want to try to calculate dime for same money I got after purchase in dime
        //how to reset the value for cent 126 so I can calculate again

        int dime = cent/10 ; //-->> 126 / 10 -->> 12
        // how much penny I have after getting dime 126 % 10 -->>6 pennies
        int penny2 = cent % 10 ; ///-->> 6
        // creating new penny2 for not mixing with previous one
        System.out.println( dime);
        System.out.println( penny2 );

    }
}
