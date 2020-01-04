package day35;

import jdk.swing.interop.SwingInterOpUtils;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        Integer num1 = 100 ; // -->> auto-boxing 100 -->> new Integer (100)

        // Integer.valueOf(...) is a method that return Integer Object
        // it has 2 overloaded version one that accept number ,another accept String
        // BUT BOTH OF THEM RETURN INTEGER OBJECT
        int num2 = Integer.valueOf("200");// auto-unboxing into 200

        // THIS CAN NOT HAPPEN BY ITSELF
       // int num3 = "200" ;

        int num3 = Integer.parseInt("200");

        /**
         * Integer.parseInt("numberHere")
         *   it return an int value converted from String
         *
         *
         * Integer.valueOf("numberHere")
         *   it return an Integer Object by wrapping up the number
         *
         *   YOU MAY USE WHICHEVER YOU WANT BECAUSE :
         *   Autoboxing and Auto-unboxing will take care of the conversion anyway
         *
         */

        // Use this number IPR2012-00001 and store the year into a int variable
        // This case number always start with 3 character either IPR, PGR, CBM ,DER
        // followed by year , followed by dash and 5 digit number
        String caseNumber = "IPR2012-00001";
        int year ; // --get 2012 out of it

        String strYear = caseNumber.substring(3,7);
        year = Integer.parseInt(strYear);
        System.out.println("strYear = " + strYear);

        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10133"));

    }


    public static int getYearOutOfCaseNumber(String caseNumber){

//         // do validation on case number
        // TODO : Case number should always start with either
               // CBM, IPR, PGR, DER
               // FOLLOWED BY 4 DIGIT NUMBER
               // FOLLOWED BY -
               // AND FOLLOWED BY 5 DIGIT

//
//         int year ; // --get 2012 out of it

//         String strYear = caseNumber.substring(3,7);
//         year = Integer.parseInt(strYear);
//         return year ;

          return Integer.parseInt( caseNumber.substring(3,7));

        /**
         * Float f1 = new Float( 3.14f ) ;
         * Float f2 = new Float( "3.14" );
         * // above way is deprecated ( old , not recommended)
         *
         * // We can also use overloaded valueOf method to create object
         * Float f3 = Float.valueOf(3.14f) ;
         * Float f3 = Float.valueOf("3.14") ;
         * // Or we can just
         * let java autobox our float value into float object
         * Float f5 = 3.14f ;
         *
         * f1-f5 are pointing to Float Object
         *
         * //How can we turn String value into float value
         * "3.14"--> 3.14f
         * float f6 = Float.parseFloat("3.14");
         * print(f6)
         * // THIS DOES NOT HAPPEN AUTOMATICALLY
         *
         *
         *
         */


    }

}
