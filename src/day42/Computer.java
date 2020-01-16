package day42;

public class Computer {
       // attributes : brand,ram(1-128), price  make it private
    //behavior : runProgram-->print brand is running program with the ram(size)
       // calculate -->print brand is calculating
    // add getters and setters to all the fields
    // ram can not be less than 1 more than 128
    // price can not be less than 20
    // toString method

       private String brand;
       private int ram ;
       private double price ;

       public void runProgram(){
           System.out.println(this.brand + "brand is running program with the ram size" + ram);
       }

       public void calculate(){
           System.out.println(brand + " is calculating");
       }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        // valid ram is 1-128
        if(ram>=1 && ram<=128){
            this.ram = ram;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >20) {
            this.price = price;
        }
    }


    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
