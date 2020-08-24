package office_hour.practice_01_27_2020MT;
/*
 Practice Topics : 1. final keyword
                   2. this & super keywords

     final keyword : constant, immutable
                     only applicable :

                     1.variables : cannot be changed( re-assigned)
                                   instance & static variables need to be initialized immediately
                                   if the instance variables is private & final , we can only generate getter.

                     2.methods: the implementation/functionality can not be changed.(can not be overridden)

                     3.class(non abstract): immutable class  String is an immutable class since its declared as final
                                            the action of the immutable (final) class CAN NOT BE CHANGED !
                                            it means : immutable class CAN NOT BE A SUPER CLASS!
                                            but can be sub-class
 */

class Data{

    private String password = "123456"; // if I want to read this data outside of the class ,what should I do ?
                                        // I need to provide getter and setter method!
    // if the variable data is final ,can you generate getter and setter ? NO ! because final variable cannot be changed.
    // final variable is immutable !  private final String password = "123456";
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void printName(){ //  public final void printName(){  this method can not be overridden !!!!
                             // because its final
        System.out.println("Hasan");
    }
    // final method can not be overridden ,but can we overload final method ? YES ! ANY METHOD CAN  BE OVERLOADED!
//    public final int printName(int a){
//        return 10;
//    }
    // CAN YOU OVERRIDE STATIC METHOD ? NO !!!!!!!!
}


public class FinalKeyword extends Data{

    @Override
    public void printName(){
        System.out.println("Mohammed");
    }

        int a; // this is instance variable
        static double b;// this is static variable
//        final static double b; this one immediately give compile error ! because default value of double b is 0.0
//          once you initialized it as a final variable , the instance
//          variable and static variable immediately lose their default value ,so you need to assign it a value .
//          otherwise compile error. this way is right way :final static double b = 100;

    public static void main(String[] args) {
        final int num = 100;// this is local variable , local variable you must assign it a value . otherwise compile error.
        //num = 300;
        System.out.println(num);

        final String username; // this one works , it compile without any error , because its local variable
        System.out.println(b);
    }
}
