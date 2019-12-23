package day17;

public class WakeUp_FullNameCorrector {

    public static void main(String[] args) {
       //                  0123456789
        String fullName = "arYa sTarK";
        int indexOfSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0,indexOfSpace); // arYa
        String lastName = fullName.substring(indexOfSpace+1);   // sTark

        String firstNameCorrected
                = firstName.toUpperCase().substring(0,1) + // ARYA-->>A
                  firstName.toLowerCase().substring(1);    //arya-->>rya
        System.out.println(firstNameCorrected);

        String lastNameCorrected = lastName.toUpperCase().substring(0,1)+
                                   lastName.toLowerCase().substring(1);
        System.out.println("lastNameCorrected = " + lastNameCorrected); // soutv

        fullName = firstNameCorrected +" "+ lastNameCorrected ;
        System.out.println(fullName);




    }
}
