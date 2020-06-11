package B15BootCampReview.str_review;

public class StringPool {

    public static void main(String[] args) {

        String s1 = "hello"; // String literal hello is stored into String pool
        String s2 = "hello"; // hello already exist in the pool so no new object will be created
        String s3 = new String ( "hello"); // using new keyword always put String outside the pool

        System.out.println("s1==s2 > " + (s1==s2));
        System.out.println("s1==s3 > " + (s1==s3));

        // How can I point to the String object in the String pool
        //call the intern method
        s3 = s3.intern();

        System.gc(); // this is the method to suggest to enforce collection

        System.out.println("s1==s3 > " + (s1==s3));


    }


}
