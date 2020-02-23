package day43;

/**
 * A blueprint for Coffee object
 * with 3 constructors
 * getters and setters
 * Price should never be less than 0
 * No coffee object with minus price should be created
 * No one should change the price
 * to minus for any existing coffee object
 */
public class Coffee {

    private String type;
    private int caffineLevel;
    private double price;

    public Coffee() {
        System.out.println("no arg constructor being called");
    }

    public Coffee(String type, int caffineLevel) {
        this.type = type;
        this.caffineLevel = caffineLevel;
        System.out.println("2 args constructor being called");
    }

    public Coffee(String type, int caffineLevel, double price) {
        this.type = type;
        this.caffineLevel = caffineLevel;
        // only set the value if the price is valid
//       if (price > 0) {
//            this.price = price;
//
//        } else {
//            this.price = 1;
//        }
         // we already have a code to do above logic in setter
        // so we can call the method directly to avoid duplication
        //you can call any methods of same class in constructors
        setPrice(price);
    }


    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffineLevel=" + caffineLevel +
                ", price=" + price +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffineLevel() {
        return caffineLevel;
    }

    public void setCaffineLevel(int caffineLevel) {
        this.caffineLevel = caffineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;

        } else {
            this.price = 1;
        }
        this.price = price;
    }
}
