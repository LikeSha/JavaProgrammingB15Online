package B15BootCampReview.str_review;

public class TryWithResources {

    public static void main(String[] args) {

        /**
         * try( open some autoclosable resource){
         *     do something with it
         * } catch ( some Exception e){
         *    do sth here if caught
         * }
         *
         *
         *
         *
         */

//        MyResource r1 = new MyResource();
//        try{
//            r1.useIt();
//        }catch(Exception e){
//            System.out.println("caught exception");
//        }finally {
//            r1.close();
//
//        }
        // inside() you can only use to
        //create Autocloseable objects
        //It will automatically call close method
        //after the catch part
        try(MyResource r1= new MyResource()){
            r1.useIt();
        }catch(Exception e){
            System.out.println("caught exception");
        }
        //so, if we create a connection outside the try block in the same class, the autoClosable  will not close it, right?
        //



    }
}
