package day17_AfterSchoolPractic;

public class WakeUp_FullNameCorrector {

    public static void main(String[] args) {

        String fullName = "arYa sTarK";

        String firstName = fullName.substring(0,4);// 4 is indexOf(" ") replace so program danamic
        String lastName = fullName.substring(5); // 5 is indexOf( " ") +1 replace it too .

        String firstNameCorrected = firstName.toUpperCase().substring(0,1)+
                                    firstName.toLowerCase().substring(1);

        System.out.println(firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1)+
                                   lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);

        fullName = firstNameCorrected + " " + lastNameCorrected ;
        System.out.println(fullName);
    }
}
