package day40;

public class Offer {

    /**
     * Create Offer class with
     * instance fields :
     * location, company, salary , isFullTime
     * instance methods :
     * displayOfferDetails -- print all info about offers
     * Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
     * Optionally : @channel
     * Store them into List<Offer> then call the method.
     * Optionally :
     * Add 5000 to each offers less than 100K
     *
     */
      // This is a instance method to print all the information about offer object
       // inside instance method we can directly access instance variable

      String location ;
      String company ;
      long salary ;
      boolean isFullTime ;

      public void displayOfferDetails(){

          System.out.println("Location = " +location +" | " + " Company= " + company + " | " +
                  " Salary = " + salary + " | "+ "isFullTime = " + isFullTime);
      }


      // Write a method called turnToFullTime( requirement is if not full time offer ,
     // change it to full time )

    public void turnToFullTime(){
          if(isFullTime == false){
          isFullTime = true ;
      }else{
              System.out.println("ALREADY FULLTIME !!");
          }


}

      // Write a method to change the location of Offer
     // to the location user passed
    public void changeLocation(String newLocation){

          location = newLocation ;

    }

    // Write a method to accept 4 parameters to change all info
    // about offers
    public void changeAllInfo(String newCompany,String newLocation,long newSalary,boolean newIsFullTime){

          company = newCompany;
          location = newLocation;
          salary = newSalary;
          isFullTime = newIsFullTime;
          // an instance method can call another instance method
        //an instance method can use any instance fields
        // since we already have functionality to display information
        // we called it here to display new information after modifying
        displayOfferDetails();

    }
    // write a method to check the offer belong to 100k club and return the
    // result as true false

    /**
     * a method to check the offer belong to 100k club
     * @return true if salary is more than 100k, false if not
     */
    public boolean is100kOffer(){
        // salary>= 100000 already generate a boolean result
        //so we can directly return that result
        return salary >= 100000;

    }

    /**
     * Create an instance method called toString
     * has no parameter
     * return String representation of Offer Object
     * [Location = Atlanta,  Company= Amazon, Salary = 150000, isFullTime = true]
     */

     public String toString(){
         // return "[Location = " +location +" | " + " Company= " + company + " | " +
         //                 " Salary = " + salary + " | "+ "isFullTime = " + isFullTime + "]" ;
         String str = "[Location = " +location +" | " + " Company= " + company + " | " +
                 " Salary = " + salary + " | "+ "isFullTime = " + isFullTime + "]" ;
         return str ;
     }

}
// static method has nothing to do with object  " static cant talk to " non- static"