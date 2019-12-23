package day10_AfterSchoolPractice;

public class SeasonAction {

    public static void main(String[] args) {

        /*
         * what do you do in each season
         *
         * Spring--->> Hike ! Easter , Nawruz, Blossom
         * Summer-->> Swim, Vacation , BBQ , Holiday
         * Fall -->> Black Friday , Hiking, Harvest , Halloween , Shopping
         * Winter-->> Snowboarding , Ski, Christmas , New Year
         *
         * */

        // Question: in what cases we put after "Default" - Break?
        // Answer : Default part of switch is optional , the break is also option for default part,
        // because after default the switch statement finish
        //Question : Is there any Specific Cases when we must to use IFELSE verses Switch ?
        //Answer : What can you do with if else if else -->> anything!!
        //There is no restriction while using if statements
        // Switch :  switch is a very specialized way of branching your code ;
        // you can only use it for checking multiple possible exact value of a variable
        // And data type of the variables are limited to :
        // byte, short, int, char, String .



        // You can also use scan statement ,but not necessary ! example ;
        // Scanner scan = new Scanner(System.in)
        // System.out.println("hey what is the season ???");
        // String season = scan.next( ) then---followe by :
        // switch(season){
        //......
        String season = "Fall";

        switch(season){
            case "Spring" :
                System.out.println("Hike ! Easter , Nawruz, Blossom");
                break;
            case "Summer" :
                System.out.println("Swim, Vacation , BBQ , Holiday");
                break;
            case "Fall" :
                System.out.println("Black Friday , Hiking, Harvest , Halloween , Shopping");
                break;
            case "Winter" :
                System.out.println("Snowboarding , Ski, Christmas , New Year");
                break;










        }











    }
}
