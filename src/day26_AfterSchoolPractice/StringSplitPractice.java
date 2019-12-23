package day26_AfterSchoolPractice;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";
        // first get all the name into String array called namesArray

        // Spell the name of each person in this format
        // exclude space if you get space in names
        // A-b-b-o-s- ......
        // Z-u-l-y-a-r---
        students = students.replace(" ","");
        System.out.println("students = " + students);

        String[] nameArray = students.split(",") ;
        System.out.println(Arrays.toString(nameArray)) ;
        System.out.println("Length of namesArrays is " + nameArray.length);
        int studentCount = nameArray.length ;

        for (int x = 0; x < studentCount ; x++) {

            String name = nameArray[x] ;

            for (int i = 0; i <name.length() ; i++) {

                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();



        }





    }
}
