package day12;

public class CheckingStringEquailityWithoutCase {

    public static void main(String[] args) {

        // store your name in a name variable
        // check for equality using different uppercase lowercase example
        // using equals and equalsIgnoreCase

        String name = "LiKE" ;
        // I want to store the result of the checking name into a variable

        boolean nameEqualsWithoutCase = name.equalsIgnoreCase("Like");

        System.out.println(" Does this name has same character without caring about the case ");
        System.out.println(nameEqualsWithoutCase);


        // They will eventually come to true or false
        System.out.println( name.equalsIgnoreCase("lIKe"));

        System.out.println( name.equalsIgnoreCase("abc"));





    }
}
