package day42;

public class MovieAction {

    public static void main(String[] args) {

        Movie m1 = new Movie();
        System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Joker",2.2,"Drama");
        Movie m3 = new Movie("Frozen2",1.5,"Family");
        Movie m4 = new Movie("Pursuit of Happiness",2.0,"Drama");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        // you are going to use constructor most of time ! to set the
        // initial attribute to objects

        // I want to get the name of m2 separately so
        // I can do some calculation
        // I can not access the field directly because its private
        //I need a getter method to access
        //System.out.println(m2.name);
        System.out.println(m2.getName());

        // Interview question: how do you create a class with immutable value ?
        //  we can provide ONLY getter in a class to make the object immutable
        // ( it means : 1, make it private , 2 ,do not provide setter)

      // constructor it looks like method but it is NOT
        // method , because it doesn't have return type
        // while method has return type .

        // you can not call constructor by yourself ,
        // it need new keyword to call out
    }
}
