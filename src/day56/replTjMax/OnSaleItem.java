package day56.replTjMax;

public class OnSaleItem extends Item {

    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */

    /**
     * public constructor with:
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     */
    public OnSaleItem(String name, int quantity, int catalogNumber, double price,double discount) {
        super(name, quantity, catalogNumber, price);
        this.discount = discount;
    }
}
