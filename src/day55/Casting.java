package day55;

public class Casting {

    public static void main(String[] args) {

        int x = 0 ;

        long y = x ;// it works implicitly \ automatically

  //      byte b = x ;
        byte b = (byte)x ; // need to be casted explicitly

        Object o = new Dog("Chiwava");// this is upcasting from type Dog to Object
//        o.bark();
        //Dog d = new Dog(" doajdflghaljl")  this is new object
        Dog d = (Dog) o ; // (Dog) o this is downcasting from type Object to Dog
        d.bark();

        //in order to let the Dog object bark , we need to refer a dog as a Dog or
        //we don't have access to Dog only action

        // WHEN DOES CLASS CAST EXCEPTION HAPPEN
          //when we tr to cast super type object to subtype
         // or when the object type IS-NOT-A  casted reference type

        // Shape s1 = new Circle();
        // Square s2 = (Square ) s1 // this will compile fine , but will throw CassCastException
        // because we can't do Square s2 = new Circle() ; CIRCLE IS NOT A SQUARE

    }
}
