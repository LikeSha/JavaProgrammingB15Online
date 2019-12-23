package day10_AfterSchoolPractice;

public class MultiBranch_withSwitch {

    public static void main(String[] args) {

        // At the McDonald Drive thru
        System.out.println("Welcome to McDonald, what can I get for you ?");

        /*
         * 11, Burger
         * 5, French Fries
         * 8, Nuggets
         * 35, IceCream
         * 55, Coke
         **/
        String order = "";
        int itemNumber = 35;
        // what data type of variable I can use here
        // type ,short, int, char, String --ONLY THESE 5 TYPES CAN BE USED IN SWITCH STATEMENT

        switch(itemNumber){
            case 11 :
                System.out.println("You have selected 11");
                order = "Burger";
                break; // if break does not show up here
                       // it will just move on to next case
            case 5 :
                System.out.println("You have selected 5");
                order = "French Fries";
                break;
            case 8 :
                System.out.println("You have selected 8");
                order = "Nuggets";
                break;
            case 35 :
                System.out.println("You have selected 35");
                System.out.println("YAY !! YUM!!!");
                System.out.println("ENJOY!!!");
                order = "IceCream";
                break;
            case 55 :
                System.out.println("You have selected 55");
                order = "Coke";
                break;
            default:
                System.out.println("You have selected unknown item .");
                order = "unknown";
    }

        System.out.println("Your order is " + order);


    }
}
