package day06;

public class CoinConverter {


    public static void main(String[] args) {

        // you have 2 dollar
        // how many quarter you can get
        // how many dime you can get
        // how many nickel you can get
        // how many penny you can get
        int cent  = 200;

        // you have purchased candle for 74 cent
        // what would be your remainder

        cent -= 74 ; // 126 cent after spending 74 cent for candle
        int quarter = cent/25 ; //126/25 --->>5, 1 is remaining
        int penny  = cent%25 ; // 126/25 --->>5, 1 is remaining
        System.out.println( quarter );
        System.out.println( penny );

        // now I want to try to calculate dime for same money
        // how to reset the value for cent 126 so I can calculate again
        int dime = cent%10 ; // --->>126 10-->>12 and remainder is 6
        // howm much penny I have after getting dime 126%10-->> 6
        int penny2 = cent % 10; ///--->> 6
        System.out.println( dime);
        System.out.println( penny2);
    }
}
