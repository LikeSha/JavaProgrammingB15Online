package B15BootCampReview.str_review;

public class TestSingleTon {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getObject();
        Singleton s2 = Singleton.getObject();

        System.out.println("s1==s2 " + (s1==s2));


    }
}
