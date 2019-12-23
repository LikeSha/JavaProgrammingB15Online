package day09_AfterSchoolPractice;



public class SelfPracticeSwitch_ScannerMix {

    public static void main(String[] args) {

        System.out.println("Which pop song star do you like the most ?  1,Michael Jackson 2, Elton John, 3," +
                " Talor Swift 4, Rihanna 5, Beyonce 6, Bruno Mars   ");


        int mostFavoriteStar = 4;
        String starName = "";
        switch(mostFavoriteStar){
            case 1 :
                starName ="Michael Jackson";
                break;
            case 2 :
                starName = "Elton John";
                break;
            case 3 :
                starName = "Talor Swift";
                break;
            case 4 :
                starName = "Rihanna";
                break;
            case 5 :
                starName = "Beyonce ";
                break;
            case 6 :
                starName = "Bruno Mars";
                break;
            case 7 :
                starName = "Not in our list";
            default:
                System.out.println("Thanks for participating ");

        }
        System.out.println("Congratulations! You selected " + starName + " and You will receive a gift within 7 days from our sponsorship.");




    }







}
