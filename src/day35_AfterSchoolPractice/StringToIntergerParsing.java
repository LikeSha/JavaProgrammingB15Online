package day35_AfterSchoolPractice;

public class StringToIntergerParsing {

    public static void main(String[] args) {

        String strNum = "100" ;
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);

        String empID = "FB-457";

        /**
         * Integer class is class coming from java .lang package
         * It's primarily used for wrapping up primitive value and treat it as an object
         * what we will focus here is though
         * many useful static methods it proved already
         * parseInt is a static method of Integer class
         * It will return a String that has only numbers and return int result
         * if we have any non-numerical character --->> It will throw NumberFormatException
         */
        //int id = Integer.parseInt(empID.split("-")[1]);--this is one shot solution .
        String[] empIDsplit = empID.split("-");
        String idStr =      empIDsplit[1];
        int id       =  Integer.parseInt(idStr);
        System.out.println("id = " + id);

        //

    }
}
