package B15BootCampReview.str_review;

// AutoClosable interface is coming from JDK
// it has single abstract method called close()
public class MyResource implements AutoCloseable{

    public MyResource(){
        System.out.println("Creating awesome resource");
    }

    public void useIt(){
        System.out.println("using awesome resource");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing awesome resources");
    }
}
