package day47;

public class ExtremeSport extends Sport {

//
//        @Override
//   can not override
//     but you can do anything else
//    for example you can overload it
//    public void doSomething(int x) {
//       // super.doSomething();
//        System.out.println("doing extreme sport");
//    }

   @Override
   //this final keyword is
   //blocking sub class of ExtremeSport
   //to do override this method
  //public final void doSomethingElse(){
       public void doSomethingElse(){
      //super.doSomethingElse();
       System.out.println("doing something else in extreme sport");
  }


}
