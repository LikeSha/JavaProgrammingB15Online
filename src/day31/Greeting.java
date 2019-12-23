package day31;

public class Greeting {

    public static void main(String[] args) {

//     sayHello();
      sayHelloTo("Batch 15" );    //--> print hello Batch 15
      sayHelloTo( "kids" ) ;  //---> print hello kids  .. caller of this method is sayHelloTo()

        sayHelloTo(" study hard");

    }

    // I want to create a method that do below :
    // say hello to the person's name I passed when I call this method

    // (string blabla) this is called method parameter
    // it's used to tell caller of this method ,
    // caller of the method is this :  sayHelloTo( "kids" ) ; sayHelloTo("Batch 15" ); and it
    // provide external data
    //      It's expecting this type of data when being called

    public static void sayHelloTo( String str){

        System.out.println("Hello " + str);

    }



  //  public static void sayHello(){
//
  //      System.out.println("Hello B15");
    //
  //  }



}
