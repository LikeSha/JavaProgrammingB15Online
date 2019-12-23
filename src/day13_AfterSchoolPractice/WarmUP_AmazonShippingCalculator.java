package day13_AfterSchoolPractice;

public class WarmUP_AmazonShippingCalculator {

    public static void main(String[] args) {

        /*
         * Amazon has 2 tye of user one is Prime member and another is regular member
         * Prime member get free shipping in all purchase no matter the amount
         * regular member user get free shipping only if their purchase is more than $25
         * otherwise they get $5 shipping fee
         *
         */
        String userType = "Prime";
        double spending =6.99d;
        int shippingFee = 5 ;

        if(userType.equalsIgnoreCase("Prime")){
            System.out.println("You get free shipping");
            System.out.println("Your final price is " + spending);
        }else if(spending > 25 && !userType.equalsIgnoreCase("Prime")){

            System.out.println("You are not a prime member but still get free shipping due to spending higher $25");
        }else{
            System.out.println("You wanna sign up for prime memebership ?");
            spending = spending += shippingFee ;
            System.out.println("Your total cost is " + spending );
        }







    }
}
