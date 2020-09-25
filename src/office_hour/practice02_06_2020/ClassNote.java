package office_hour.practice02_06_2020;

public class ClassNote {

    /*
    02/06/2020 Practice Topic : Polymorphism

    Polymorphism: ability of the object in many forms

   if the super class/super-type is reference to sub class(non-abstract) object

       classA extends classB
            sub            super

       for this case : the regular way to create class object is :

        classA             obj     =       new classA();
        reference type     name            object

        classB            obj     =        new classB();
        classB            obj2    =        new classA();<--- Polymorphism concept classB reference child class

   IS-A relationship: Inherited relation

      example: class A extends B
               class Animal{

               }
               class Tiger extends Animal{

               }
               Tiger IS An Animal

   Has-A: instance of the A class is being used by B class
          whenever a class object being used by other class ,
          they have no inheritance relationship, no super sub relationship

          example :

          class Zoo{
              Tiger obj = new Tiger();
          }

          Zoo Has Tiger

           IMPORTANT CONCEPT IN POLYMORPHISM : The reference type decides what can be called !

           the second important concept : if the method called existing in both types, which one executed ?
           THe object type method got executed!

           public final void method1(){
        System.out.println("method 1 from States class");//final method CAN NOT BE OVERRIDDEN ,BUT CAN BE OVERLOADED!
    }

}

if you overridden ,the object class got executed , if you overloaded ,the reference type
                      // get executed.
IF A METHOD IS PRESENTED IN BOTH REFERENCE AND OBJECT , THE OVERRIDDEN ONE GETS EXECUTED

                      ANY METHOD CAN BE OVERLOADED!

     Can Interface be a super type to a class ? Yes it can .
     class extends class only
     class implements interface(s) only.
     interface extends interface

     if interface/super class is reference ,the object must be created from non-abstract sub class.
     */
}
