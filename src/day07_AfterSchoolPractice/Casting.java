package day07_AfterSchoolPractice;

public class Casting {

    public static void main(String[] args) {

    //int num = 10 ;
     // 10 is implycitly ( automatically ) converted to doulbe 10.0
     // and sorted inside bigNum behind scene

    double bigNum = 10 ;
        System.out.println(bigNum);
         // 12.99 is double , double has much bigger range than int
        // so it just does not fit
        //int num = 12.99 ; // compiler error!!!

        int num= (int) 12.99;
        System.out.println(num);

        // create a long variable and store int
        long earthToMoon = 10000 ; // --->> 10000l
        // CREATE AN INT VARIABLE AND TRY TO STORE ABOVE LONG VALUE
        int earthToMoon_int = (int) earthToMoon;

        System.out.println(earthToMoon_int );


    }



}
