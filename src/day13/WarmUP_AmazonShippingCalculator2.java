package day13;

public class WarmUP_AmazonShippingCalculator2 {

    public static void main(String[] args) {

       // created a boolean store the result of youWanToShop
         // if yes , do you want to go to Store or do you wanna shop online

        // if user do not wanna shop at all ,print good job stay home coding !!!

        boolean  youWantToShop = true ;
        String preference = "Online" ;

        // if( youWantToShop)---this one also right ,because already true boolean value
        if(youWantToShop == true){


            if(preference.equals("Store")){
                System.out.println("GOING TO STORE FOR SHOPPING");
            }else{
                System.out.println("GOING TO ONLINE FOR SHOPPING");
            }


        }else{

            System.out.println("print good job stay home coding !!!");
        }





    }
}
