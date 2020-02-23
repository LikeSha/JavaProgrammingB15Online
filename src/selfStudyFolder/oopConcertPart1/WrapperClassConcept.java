package selfStudyFolder.oopConcertPart1;

public class WrapperClassConcept {

    public static void main(String[] args) {

        String x = "100"; // I want to convert this string to Integer, so you need to use wrapper class
        System.out.println(x+20);

        // data conversion : String to int
        int i = Integer.parseInt(x);
        System.out.println(i + 20);

        //Integer , Double, Character, Boolean

        // String to double conversion:
        String y= "12.23";
        double d = Double.parseDouble(y);
        System.out.println(d+10);

        //String to boolean :
        String k = "true";
        boolean b = Boolean.parseBoolean(k);

        // int to String conversion :
        int j = 200;
        System.out.println(j+20);

        String s = String.valueOf(j);// int become string-->"200"
        System.out.println(s+20);// become string concatenate with int -->> 20020

        // IMPORTANT INTERVIEW QUESTION :
        String u = "100A"; // ---- NumberFormatException
        Integer.parseInt(u);// this can not convert ! it will show " NumberFormatException "  String to int
        // only accept pure number !!



    }
}
