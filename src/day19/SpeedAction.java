package day19;

public class SpeedAction {

    public static void main(String[] args) {

        // Create 2 int variables called start ,end
        //assuming start speed is always less than end speed
        // Create a for loop to stimulate slow increase of the speed
        //for example if start 10, end 27  10,11,12,13,14....27
        //print-->>10,11,12,13,14....27

        int startSpeed = 10 ;
        int endSpeed = 27 ;

        System.out.println("You hvae started at speed --->> ");
        for(int i = startSpeed ; startSpeed <= endSpeed ; startSpeed++ ){

            System.out.print( startSpeed+ " ");

        }

        }







    }

