package selfStudyFolder.oopConcertPart1;

public class LocalVsGlobalVariables {

    // Global variables ---class variables
    String name = "Tom";
    int age = 25;

    public static void main(String[] args) {

       int i = 10;//local variable for main method
        System.out.println("i = " + i);// you can direct use local variable to print out but global variables must
                                      // be accessed through object ,you have to create objects first , then print

        // in order to access to those global variables , we must create object to access them.
        LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

    public void sum(){ // all non static method or variables will be given to objects  ! in this case give to variable in
                      // called " global variables ."  also " instance variables " understand instance field concept also
        int i = 10;// local variable for sum method
        int j = 20;
        int age = 25;
    }

}
