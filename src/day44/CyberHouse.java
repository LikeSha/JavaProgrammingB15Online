package day44;

public class CyberHouse {

    /**
     * instance fields : houseNum, design
     * private static field : neighbourhoodName
     *
     * add 2 args constructor
     *     to set the houseNum, design
     *
     * instance method
     *    void showAllInfo()
     *       just print the houseNum, design
     *             neighbourhoodName in one line
     * static void method showNeighborhood(){
     *     print the neighbourhoodName only
     *     // try to access houseNum, design and see what happen
     * }
     */

    String design;
    int houseNum;

      // we can change default value of the fields
    // by assigning value directly in the template class
     private  static String neighbourhoodName = "Cybertek Ave";

      public CyberHouse(int houseNum,String design){
          this.houseNum = houseNum;
          this.design = design;
      }
       // instance method can access anything
      public void showAllInfo(){
          System.out.println("house: " +this.houseNum + " design: " + this.design + "neighbourhoodName " + neighbourhoodName
          );



      }

     // static method can ONLY access static members of same class
    public static void showNeighbourhoodName(){

        System.out.println("neighbourhoodName = " + neighbourhoodName);
        // CAN NOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHOD
        //System.out.println("houseNum = " + houseNum);

    }
}
