package day31;

public class SeasonChecker {

    public static void main(String[] args) {

        // a String variable declared and assigned vale inside main method
        //It can be accessible in main method
       // String season = "Winter";


        decideSeasonAction("Winter");
        decideSeasonAction("Summer");

        // a String variable declared and assigned value inside main method
        // It can be accessible in main method
        String mySeason = "AAAA" ;
        decideSeasonAction(mySeason);// STATIC METHOD WE DIRECT CALL METHOD NAME

        System.out.println("AAAA"); // you can directly pass AAAA to the method
        System.out.println(mySeason);// or you can pass a variable that has value AAAA to the method




    }
    /**
     * Write a static method called decideSeasonAction
     * It has one String parameter called season
     * Inside method body :
     * according to what user passed it should print correct action
     */
      public static void decideSeasonAction(String season){ // "String season" is called method parameter
          // this season method parameter can only by accessible inside method body ,in main method and this method
          // both " season can not see each others " they are in different method body so it does not conflict.
          switch (season){
              case"Spring":
                  System.out.println("Hiking");
                  break ;
              case"Summer":
                  System.out.println("Swimming");
                  break ;
              case"Fall":
                  System.out.println("Pumpkin picking");
                  break ;
              case"Winter":
                  System.out.println("Go Snowboarding");
                  break ;
              default:
                  System.out.println("INVALID SEASON");
          }


      }




}
