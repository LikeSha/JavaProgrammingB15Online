package office_hour;

public class Practice_11_26_3 {

    public static void main(String[] args) {

        // if the season is
        // spring ,summer ,fall --->>  print ducks are active
        // winter --->> print ducks sleep

        String season = "spring";

        switch (season) {
            case "spring":
            case "summer":
            case "fall":
                System.out.println("bear is active");
                break;
            case "winter":
                System.out.println("bear is sleeping");

        }


    }


}


//       if(season.equals("srping") || season.equals("summer") || season.equals("fall")){

//            System.out.println(" bear is active");

//        }else if(season.equals("winter")){
//           System.out.println("bear is sleeping");


//       if(season.equals("spring")){
//          System.out.println("bears are active");
//      }else if(season.equals("summer")){
//           System.out.println("bears are active");
//      }else if(season.equals("fall")){
//         System.out.println("bears are active");
//           }else if(season.equals("winter")){
//           System.out.println("bears are sleeping");