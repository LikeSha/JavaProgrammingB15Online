package day12;

public class CarShoppint {

    public static void main(String[] args) {

        //Buy corolla or Tesla( only if it's within the budget)

        String carBrand = "corolla";

        double budget = 40000;

        if(carBrand.equals("corolla") && budget <= 40000 ){
            System.out.println("buy corolla");
        }else if(carBrand.equals("Tesla") && budget > 40000){
            System.out.println("buy Tesla");
        }else{
            System.out.println("don't buy any other brand car");
        }

    }
}
