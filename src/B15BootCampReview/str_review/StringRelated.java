package B15BootCampReview.str_review;

public class StringRelated {

    public static void main(String[] args) {

        // String, StringBuilder, StringBuffer
        //String immutable, StringBulder & StringBuffer mutable

        //it's a mutable way of dealing with sequence of characters
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append(" world ").append(100);

        System.out.println(sb.toString());

        StringBuffer sbf = new StringBuffer();
        sbf.append("hello").append(" world ").append(100);

        System.out.println(sbf.toString());


    }
}
