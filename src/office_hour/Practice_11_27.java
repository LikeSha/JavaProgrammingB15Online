package office_hour;

public class Practice_11_27 {

    public static void main(String[] args) {


        // 3 questions to ask when learning method

        // what does it do ?
        // does it need external data when performing the action ?
        // what do I get out of it ?


        // equals
        //equalsIgnoreCase
        //length
        //toUpperCase
        //toLowerCase
        //startsWith
        //endsWith
        //charAt
        //contains
        //indexOf
        //lastIndexOf
        //trim
        //isEmpty
        //---------------------------------------
        // replace
        //substring

        String message = " I love   JAVA    " ;

        //trim-->> take out spaces at beginning and ending of a String object
        System.out.println("message =<" + message + ">");

        String messageTrimmed = message.trim();

        System.out.println("messageTrimmed =<" + messageTrimmed + ">");

        //isEmpty -->> check whether a String object is empty, meaning here is nothing inside ""
        // isEmpty = yourString.length() == 0 -->> true
        String emptySpaces = "               ";
        System.out.println("emptySpace=<" + emptySpaces + ">");

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed lenth is : " + emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is empty??? :" + emptySpacesAfterTrimmed.isEmpty());

        // isEmpty VS isBlank method from String class
        // isEmpty check for --->> yourString.length() >0 true else it's false
        // isBlank-->> if you have ONLY white spaces, get true, else get false

        System.out.println("emptySpaces is blank or not ?? " + emptySpaces.isBlank());

        // indexOf -->> give you location of the string you are looking for inside anotherString
        // for example yourString.indexOf("abc")                              012345678901234
        // copied from above so we can see what we have -->>String message = " I LOVE JAVA  " ;

        int lastIndexOfLetterA = message.indexOf("A");
        System.out.println("last indexOf letter A  = " + lastIndexOfLetterA);

        // contains: -->> check whether a String exists inside another String and return true false
        //   contains works exactly same as -->> yourString.indexOf("anotherStr")>1 or >=0
        boolean messageContainsLove = message.contains("LOVE");
        System.out.println("message Contains Love = " + messageContainsLove);





    }
}
