package day13_AfterSchoolPractice;

public class WarmUP_AmazonShippingCalculator2 {

    public static void main(String[] args) {


        // created a boolean store the result of youWanToShop
        // if yes , do you want to go to Store or do you wanna shop online

        // if user do not wanna shop at all ,print good job stay home coding !!!

        boolean youWantToShop = true ;
        String storeOrOnline = "store";

        if(youWantToShop==true){
            if(storeOrOnline.equals("store")){
                System.out.println("shop in store");
            }else{
                System.out.println("shop online");
            }
        }   else{
            System.out.println("good job stay home coding");
        }






    }
}
