package day05_AfterSchoolPractice;


import java.util.Scanner;

public class ScannerPractice_NexxBoolean {

    public static void main(String[] args) {

        // creating scanner object
        Scanner input = new Scanner(System.in);

        // asking user are you recording
        System.out.println(" are you recording ? ");
        boolean isRecording = input.nextBoolean();

        // The reslt of concatenating a string to any data type-->> String
        System.out.println(" We are recording " + isRecording);



    }
}
