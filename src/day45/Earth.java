package day45;

public class Earth extends Planet {
//
//    double gravity;
//    int radius;
//    boolean hasLife;
      int population;

    // PRACTICAL USAGE OF Super() keyword to all super constructor
    //is to reuse the functionality of super constructor in sub class
    // constructor
    public Earth(double gravity, int radius, boolean hasLife, int population) {
       super(gravity, radius, hasLife);
//        this.gravity = gravity;
//        this.radius = radius;
//        this.hasLife = hasLife;
        this.population = population;
    }

    public static void main(String[] args) {

        Earth e1 = new Earth(9.81,5000,true,10000);
        System.out.println("e1 = " + e1);
    }






    // adding toString method so we can print out object


    public String toString() {
        return "Earth{" +
                "gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }
}
