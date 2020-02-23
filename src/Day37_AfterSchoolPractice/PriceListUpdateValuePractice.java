package Day37_AfterSchoolPractice;

import java.util.ArrayList;
import java.util.List;

public class PriceListUpdateValuePractice {

    public static void main(String[] args) {

       // ArrayList<String> priceList = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);
        // change the third price to 10$

        priceList.set(2,10.0);
        System.out.println(" Third price now is = " + priceList.get(2) );

        // Add 4 dollar to first price
        priceList.set(0,priceList.get(0) + 4);
        System.out.println("firt item price now is " + priceList.get(0));

        //change last price to sum of first and second price
        priceList.set(priceList.size()-1,priceList.get(0) + priceList.get(1));
       // double sumOfFirst2Items = priceList.get(0) + priceList.get(1);
        System.out.println("last price after changed " + priceList.set(priceList.size()-1,priceList.get(0) + priceList.get(1)));

        // give 40% off to second price
        priceList.set(1,priceList.get(1)*0.60);
        System.out.println("second price after 40% off is " + priceList.get(1));

        // DOUBLE THE VALUE OF EACH AND EVERY PRICE IN THE LIST
        for(int i = 0 ; i < priceList.size();i++){
            double newPrice = priceList.get(i) * 2;
            priceList.set(i,newPrice);
        }
        System.out.println("Price list after double each one is " + priceList);

        // Cut the price into half if the price is more than 20$
        for(int i = 0 ; i <priceList.size(); i++){

            double newHalfPrice = priceList.get(i);
            if(newHalfPrice >= 20){
                priceList.set(i,newHalfPrice/2);
            }
        }
        System.out.println("price afeter cut half is " + priceList);

        // swap the first value with the last value
        double temp = priceList.get(0);
        int lastIndex = priceList.size()-1;
        priceList.set(0,priceList.get(lastIndex));
        priceList.set(lastIndex,temp);

        System.out.println("price list after swapping first and last value is " + priceList);

    }
}
